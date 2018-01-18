package com.test.stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import junit.framework.Assert;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario; // Add the package 

public class Hooks {

	WebDriver driver;
	Scenario scenario;

	@Before({"@Test_Hooks_1,@Test_Hooks_2"})
	public void testingBefore(Scenario scenario) {

		this.scenario = scenario;
		System.out.println("----------> In before method : "+scenario.getName());
		System.setProperty("webdriver.chrome.driver",
				"C:\\Automation_Drivers_Code\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	}

	@Given("^Run the Background Test$")
	public void run_the_Background_Test() throws Throwable {
		System.out.println("Running Background statements");
		String title = driver.getTitle();
		Assert.assertEquals("Welcome: Mercury Tours", title);
	}

	@Given("^Testing data for hooks with earlier data$")
	public void testing_data_for_hooks_with_earlier_data() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(true);

	}

	@Given("^Testing data for hooks with later data$")
	public void testing_data_for_hooks_with_later_data() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(false);
	}

	@After({"@Test_Hooks_1,@Test_Hooks_2"})
	public void testingAfter(Scenario scenario) {
		System.out.println("----------> In After method : "+scenario.getName());
		if (scenario.isFailed()) {
			scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
		}

		System.out.println("-------------------------------------------------------------------------------------");
		driver.close();
		driver.quit();

	}

}
