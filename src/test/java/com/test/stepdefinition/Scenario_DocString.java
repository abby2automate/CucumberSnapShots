package com.test.stepdefinition;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Scenario_DocString {

	public static WebDriver driver;
	public static Scenario scenario;

	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() throws Throwable {
		System.out.println("Scenario");
	}

	@Given("^some other precondition$")
	public void some_other_precondition() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Scenario");
	}

	@When("^I complete action$")
	public void i_complete_action() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Scenario");
	}

	@When("^some other action$")
	public void some_other_action() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Scenario");
	}

	@When("^yet another action$")
	public void yet_another_action() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Scenario");
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Scenario");
	}

	@Then("^check more outcomes$")
	public void check_more_outcomes() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Scenario");
	}

	@Given("^Load Make my Trip Page$")
	public void load_Make_my_Trip_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Automation_Drivers_Code\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		Thread.sleep(5000);

	}

	@Given("^Check the Following Dock String$")
	public void check_the_Following_Dock_String(String expected) throws Throwable {

		WebElement actual = driver
				.findElement(By.xpath("//h5[text()='Why MakeMyTrip?']//parent::section//child::p[1]"));
		
		String actualVal = actual.getText();
		
		Assert.assertTrue(false);
		
	}
	
/*	@After()
	public void tearDown() throws Exception
	{
		if(scenario.isFailed())
		{
			System.out.println("<------------------IN scenario.isFailed() ------------------> ");
			String imagePath = Scenario_DocString.getScreenshot(driver, scenario.getName());
			Reporter.addScreenCaptureFromPath(imagePath, scenario.getName());
			
		}
		
		driver.close();
		driver.quit();
	}*/
	
	public static String getScreenshot(WebDriver driver,String screenshotName) throws Exception {

		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/" + screenshotName + dateName
				+ ".png";
		File finalDestination = new File(destination);
		FileHandler.copy(source, finalDestination);
	//	FileUtils.copyFile(source, finalDestination);
		return destination;
	}
	
	
	
}
