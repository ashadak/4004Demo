package com.JunitDemo.Demo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	additionTest.class,
	additionTest2.class
})

public class testSuite {

}
