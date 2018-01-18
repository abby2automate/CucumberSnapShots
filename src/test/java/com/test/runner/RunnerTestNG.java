package com.test.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
					features = "src/test/resources/Scenario_DocString.feature", 
					glue = { "com.test.stepdefinition" }, 
					tags = {}, 
					plugin = { "pretty:STDOUT","html:D:/AutoFrmWrk/CucumberSnapShots/Reports/Pretty/PrettyFormat_Report",
							    "json:D:/AutoFrmWrk/CucumberSnapShots/Reports/Json/Json_Report.json" },
					monochrome = false, // To enhance readability
					strict = false, // Try to find missing StepDefinition and if not found will fail the test
					dryRun = false // Try to find missing StepDefinition and if not found will NOT fail the test
					
		)

public class RunnerTestNG extends AbstractTestNGCucumberTests {

}
