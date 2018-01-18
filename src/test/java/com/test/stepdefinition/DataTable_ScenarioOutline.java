package com.test.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTable_ScenarioOutline {
	
	public static int count=0;
	
	@Given("^The DataTables test using Outline$")
	public void the_DataTables_test_using_Outline() throws Throwable {
		System.out.println("Scenario Outline - Given");
	}

	@When("^The data (\\d+) and (\\d+)$")
	public void the_data_and(int Data1, int Data2) throws Throwable {
		
		count++;
		System.out.println("The Row Number is : "+count);
		System.out.println("Data1 : "+Data1+" "+"Data2 : "+Data2);
		System.out.println("##################################################################3");
		
	   
	}

	@Then("^End Testing using Outline$")
	public void end_Testing_using_Outline() throws Throwable {
		System.out.println("Scenario Outline - Then");
	}
	

}
