

package com.test.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;
import com.test.stepdefinition.Scenario_DocString;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Scenario_DocString.feature", 
		glue = { "com.test.stepdefinition" }, 
		tags = {"@WithExtentReport"}, 
		plugin = {  "pretty:STDOUT","html:D:/AutoFrmWrk/CucumberSnapShots/Reports/Pretty/PrettyFormat_Report",
				    "json:D:/AutoFrmWrk/CucumberSnapShots/Reports/Json/Json_Report.json",
				    "com.cucumber.listener.ExtentCucumberFormatter:D:/AutoFrmWrk/CucumberSnapShots/Reports/Extent/Extent_Report.html"}, 
		monochrome = false, // To enhance readability
		strict = false, // Try to find missing StepDefinition and if not found will fail the test
		dryRun = false // Try to find missing StepDefinition and if not found will NOT fail the test
)

public class RunnerExtentReports {
	
	@AfterClass
	public static void loadExtentConfig() throws Exception
	{
		Reporter.loadXMLConfig(new File("src\\main\\resources\\extent-report.xml"));	
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setTestRunnerOutput("Cucumber Extent Report");
		
		if(Scenario_DocString.scenario.isFailed())
		{
			System.out.println("<------------------IN scenario.isFailed() ------------------> ");
			String imagePath = Scenario_DocString.getScreenshot(Scenario_DocString.driver, Scenario_DocString.scenario.getName());
			Reporter.addScreenCaptureFromPath(imagePath, Scenario_DocString.scenario.getName());
			
		}
		
		Scenario_DocString.driver.close();
		Scenario_DocString.driver.quit();
	}

}
