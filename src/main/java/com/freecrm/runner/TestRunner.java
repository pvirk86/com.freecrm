package com.freecrm.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/com.freecrm/src/main/java/com/freecrm/feature/testCaseOne.feature",
		glue= {"com.freecrm.stepdefinition"},
		monochrome = true,
		strict = true,
		dryRun = true
		)

public class TestRunner {
	
	

}
