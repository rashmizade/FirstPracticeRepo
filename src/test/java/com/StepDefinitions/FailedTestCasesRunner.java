package com.StepDefinitions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="@target/rerun.txt", 
				 glue = {"com.StepDefinitions"} 
				 )

public class FailedTestCasesRunner {

}
