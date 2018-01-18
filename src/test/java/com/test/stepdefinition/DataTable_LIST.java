package com.test.stepdefinition;

import java.util.Iterator;
import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTable_LIST {
	
	@Given("^The DataTables test$")
	public void the_DataTables_test() throws Throwable {
	   System.out.println("LIST - Given");
	}

	@When("^The data is$")
	public void the_data_is(DataTable userData) throws Throwable {

		List<List<String>> lt = userData.raw();
		
		Iterator itr = lt.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("FirstRow_FirstColumn : "+lt.get(0).get(0).toString());
		System.out.println("FirstRow_SecondColumn : "+lt.get(0).get(1).toString());
		System.out.println("SecondRow_FirstColumn : "+lt.get(1).get(0).toString());
		System.out.println("SecondRow_SecondColumn : "+lt.get(1).get(1).toString());
	}

	@Then("^End Testing$")
	public void end_Testing() throws Throwable {
		 System.out.println("LIST - Then"); 
		 System.out.println("============================================================================================");
	}

}
