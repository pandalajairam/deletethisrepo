package com.lamresearch.nexus.executor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.lamresearch.nexus.testcase.Child;

public class Java8 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("one", "two", "three");
		List<String> list2 = new ArrayList<String>();
		list2.add("four");
		try {
			list.add("four");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getMessage());
		}
		list2.forEach(a -> System.out.println(a));

		Child child = new Child();
		child.printMessage();
	}

}
