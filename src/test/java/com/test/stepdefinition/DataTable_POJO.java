package com.test.stepdefinition;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTable_POJO {
	
	@Given("^The DataTables test using POJO$")
	public void the_DataTables_test_using_POJO() throws Throwable {
	   
		System.out.println("POJO - Given");
	}

	@When("^The data for POJO is$")
	public void the_data_for_POJO_is(List<POJO> data) throws Throwable {
		
		for (POJO p : data)
		{
			System.out.println(
					p.getData1() + "||" + p.getData2()+ "||" + p.getData3() + "||" + p.getData4());
		}

	}

	@Then("^End Testing using POJO$")
	public void end_Testing_using_POJO() throws Throwable {

		System.out.println("POJO - Then");
		System.out.println(
				"============================================================================================");
	}

}
