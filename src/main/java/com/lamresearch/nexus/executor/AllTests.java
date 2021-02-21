package com.lamresearch.nexus.executor;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.lamresearch.nexus.testcase.SampleTest1;
import com.lamresearch.nexus.testcase.SampleTest2;

@RunWith(Suite.class)
@SuiteClasses({ SampleTest1.class, SampleTest2.class })
public class AllTests {

}
