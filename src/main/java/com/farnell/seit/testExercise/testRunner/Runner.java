package com.farnell.seit.testExercise.testRunner;	

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)				
@CucumberOptions(
		features="src/main/java/com/farnell/seit/testExercise/features",
		glue={"com.farnell.seit.testExercise.stepsDefinition"},
		plugin = {"pretty", "html:target/cucumber-report-html",
				"json:target/cucumber.json"}
		)						
public class Runner 				
{		

}