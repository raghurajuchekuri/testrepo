package com.Cucumber.framework;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/Feature1.feature"},
        glue = {"stepdefs1"},
        tags = {"@tag1"},
        plugin = { 
                    "pretty",
                    "html:target/cucumber",
                } 

        )

public class MainRunnerclass {
	
	
	
	public static void main(String[] args) {
		
		
		
		
	}

}
