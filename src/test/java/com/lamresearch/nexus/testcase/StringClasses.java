package com.lamresearch.nexus.testcase;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class StringClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner readTxt = new StringJoiner(" ");
		List<String> input = new ArrayList<String>();
		input.add("ABC");
		input.add("DEF");
		input.add("GHI");
		for(String str : input)
		{
			readTxt = readTxt.add(str);
		}
		System.out.println(readTxt);
	}

}
