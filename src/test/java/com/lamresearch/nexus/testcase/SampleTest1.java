package com.lamresearch.nexus.testcase;

import org.junit.Assert;
import org.junit.Test;

import com.lamresearch.nexus.executor.BaseClass;

public class SampleTest1 extends BaseClass{
	
/*	@Before
	public void beforeMethod()
	{
		System.out.println("Before each test method");
	}*/

	@Test
	public void test1() {
		System.out.println("SampleTest1_Test1");
		Assert.assertTrue(false);
	}

	@Test
	public void test2() {
		System.out.println("SampleTest1_Test2");
	}

	@Test
	public void test3() {
		System.out.println("SampleTest1_Test3");
	}

	@Test
	public void test4() {
		System.out.println("SampleTest1_Test4");
	}

}
