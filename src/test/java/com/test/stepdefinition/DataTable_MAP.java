/*
 * The data Step will be run for all the data in the table 
 * 
 * 
 */

package com.test.stepdefinition;

import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTable_MAP {

	@Given("^The DataTables test using Map$")
	public void the_DataTables_test_using_Map() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("MAP - Given");
	}

	@When("^The data for Map is$")
	public void the_data_for_Map_is(DataTable data) throws Throwable {
		for (Map<String, String> user : data.asMaps(String.class, String.class)) {
			System.out.println(
					user.get("First") + "||" + user.get("Last") + "||" + user.get("Age") + "||" + user.get("No"));
		}
	}

	@Then("^End Testing using Map$")
	public void end_Testing_using_Map() throws Throwable {

		System.out.println("MAP - Then");
		System.out.println(
				"============================================================================================");
	}

}
