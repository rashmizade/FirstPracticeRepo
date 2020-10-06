package com.StepDefinitions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources", 
				 plugin = {"rerun:target/rerun.txt"},
				 glue = {"com.StepDefinitions"}, 
				 tags = {"@ReRun"})

public class Runner {

}
