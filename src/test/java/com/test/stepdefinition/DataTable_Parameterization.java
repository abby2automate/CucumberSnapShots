package com.test.stepdefinition;

import cucumber.api.java.en.Given;

public class DataTable_Parameterization {

	@Given("^The data for Parameterization is \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_data_for_Parameterization_is_and(String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("The Strings are : " + arg1 + " " + arg2);
		System.out.println(
				"============================================================================================");
	}

}
