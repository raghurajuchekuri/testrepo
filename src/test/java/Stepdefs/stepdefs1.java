package Stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;



public class stepdefs1 {
	
	
	
	@Given("^I navigate to google$")
	public void i_navigate_to_google() throws Throwable {
		System.out.println("HI 1");
		
	    
	}

	@And("^I will validate the title$")
	public void i_will_validate_the_title() throws Throwable {
		
		
		System.out.println("HI 2");
		
	    
	}


}
