package com.bilgin.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
				"pretty",
				"html:target/default-cucumber-reports", //generates every time we run the cukes runner
				"json:target/cucumber.json"
		
		},
		tags="@bunucalistir",
		features= {"src/test/resources/features"}, 
		glue= {"com/bilgin/stepdefinition"},
		dryRun = false
		)
public class CukesRunner {
	
	
	
}
