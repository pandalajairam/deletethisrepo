package com.lamresearch.nexus.executor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Filehandling {
	private static Filehandling fileHandlingInstance = null;

	public static synchronized Filehandling getInstance() {
		if (Filehandling.fileHandlingInstance == null) {
			Filehandling.fileHandlingInstance = new Filehandling();

		}
		return Filehandling.fileHandlingInstance;

	}

	public BufferedReader bufferReader = null;

	public FileWriter fileWriter = null;

	public BufferedWriter bufferedWriter = null;

	public FileInputStream fis = null;

	public FileOutputStream fos = null;

	public FileReader fileReader = null;

	public File file = null;

	public String genericReadFile(String filepath) {
		StringBuffer readTxt = new StringBuffer();
		try {
			this.bufferReader = new BufferedReader(new FileReader(filepath));
			while (this.bufferReader.readLine() != null) {
				readTxt = readTxt.append(this.bufferReader.readLine());
			}

		} catch (FileNotFoundException exception) {
			// Log.write(Arrays.toString(exception.getStackTrace()));
		} catch (IOException exception) {
			// Log.write(Arrays.toString(exception.getStackTrace()));
		} finally {
			try {
				this.bufferReader.close();
			} catch (IOException exception) {
				// Log.write("Exception in closing the resouce" +
				// Arrays.toString(exception.getStackTrace()));
			}
		}
		return readTxt.toString();

	}

	public void readFile(String filePath, ArrayList<String> moduleList) {
		try {
			this.fileWriter = new FileWriter(filePath);
			this.bufferedWriter = new BufferedWriter(this.fileWriter);
			for (int k = 0; k < moduleList.size(); k++) {
				this.bufferedWriter.write(moduleList.get(k));
				this.bufferedWriter.newLine();
			}
		} catch (IOException exception) {
			// Log.write(Arrays.toString(exception.getStackTrace()));
		}

		finally {
			try {
				this.bufferedWriter.close();
			} catch (IOException exception) {
				// Log.write("Exception in closing the resouce" +
				// Arrays.toString(exception.getStackTrace()));
			}

		}
	}

	public int TC_36049_readLogFile(String filepath) {
		String read = null;
		int count = 0;
		try {
			this.bufferReader = new BufferedReader(new FileReader(filepath));
			read = this.bufferReader.readLine();
			while (read != null) {

				if (read.contains("The calculated accumulation due to get ready list execution is")) {
					count++;
					read = this.bufferReader.readLine();
				} else {
					read = this.bufferReader.readLine();
				}

			}

		} catch (FileNotFoundException exception) {
			// Log.write(Arrays.toString(exception.getStackTrace()));
		} catch (IOException exception) {
			// Log.write(Arrays.toString(exception.getStackTrace()));
		} finally {
			try {
				this.bufferReader.close();
			} catch (IOException exception) {
				// Log.write("Exception in closing the resouce" +
				// Arrays.toString(exception.getStackTrace()));
			}
		}
		return count;

	}

}
