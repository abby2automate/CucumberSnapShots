package com.test.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
					features = "src/test/resources/Hooks.feature", 
					glue = { "com.test.stepdefinition" },
					tags = { "@Test_Hooks_1,@Test_Hooks_2"},
					monochrome = false, 
					plugin = { "pretty:STDOUT","html:D:/AutoFrmWrk/CucumberSnapShots/Reports/Pretty/PrettyFormat_Report",
							    "json:D:/AutoFrmWrk/CucumberSnapShots/Reports/Json/Json_Report.json" }

		)

public class RunnerHooks {

}
