package com.lamresearch.nexus.testcase;

import org.junit.Assert;
import org.junit.Test;

import com.lamresearch.nexus.executor.BaseClass;

public class SampleTest2  extends BaseClass{

	@Test
	public void SampleTest2_test1() {
		System.out.println("SampleTest2_test1");
	}
	
	@Test
	public void SampleTest2_test2() {
		System.out.println("SampleTest2_test2");
		Assert.assertTrue(false);
	}
	
	@Test
	public void SampleTest2_test3() {
		System.out.println("SampleTest2_test3");
	}
	
	@Test
	public void SampleTest2_test4() {
		System.out.println("SampleTest2_test4");
	}

}
