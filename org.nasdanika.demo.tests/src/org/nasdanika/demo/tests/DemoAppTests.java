package org.nasdanika.demo.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.nasdanika.webtest.NasdanikaWebTestSuite;
import org.nasdanika.webtest.Title;

@RunWith(NasdanikaWebTestSuite.class)
@Title("Demo App test report")
@SuiteClasses({DemoAppTest.class, DemoAppRouteTest.class})
public class DemoAppTests {
	
}
