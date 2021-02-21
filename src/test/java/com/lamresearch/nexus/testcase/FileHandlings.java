package com.lamresearch.nexus.testcase;

import java.io.*;

public class FileHandlings {

	public void writeToFile() throws Exception {
		String csvFile = "test5_fw.csv";
		String txtFile = "txtFile.txt";
		// BufferedReader br = null;
		File file = new File(txtFile);
		// br = new BufferedReader(new FileReader(file));
		FileReader fr = new FileReader(file);
		// BufferedWriter bw = null;

		// String fileLine = "";

		FileWriter fw = new FileWriter(csvFile, true);
		// bw = new BufferedWriter(fw);
		int i = 0;
		int character;
		while ((character = fr.read()) != -1) {
			if (i == 0) {
				fw.write((char) character);
			} else {
				fw.append("\n");
				fw.append((char) character);
			}
			i++;
		}

		fr.close();
		fw.close();
		System.out.println("Done Writing");
	}

}
