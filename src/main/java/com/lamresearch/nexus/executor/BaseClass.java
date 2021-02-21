package com.lamresearch.nexus.executor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.lamresearch.nexus.testcase.SampleTest1;
import com.lamresearch.nexus.testcase.SampleTest2;

public class BaseClass {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before class ");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After class ");
	}

	public static void main(String[] args) {
		List<Class<?>> listOfClasses = new ArrayList<>();
		try {
			listOfClasses.add(Class.forName("com.lamresearch.nexus.testcase.SampleTest1"));
			listOfClasses.add(Class.forName("com.lamresearch.nexus.testcase.SampleTest2"));
			listOfClasses.add(Class.forName("com.lamresearch.nexus.testcase.SampleTest3"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Class<?> className : listOfClasses) {
			Result result = JUnitCore.runClasses(className);
			System.out.println(result.getRunCount());
			for (Failure failure : result.getFailures()) {
				System.out.println(failure.toString());
			}
			System.out.println(result.getFailureCount());
		}
		
		
	}

}
