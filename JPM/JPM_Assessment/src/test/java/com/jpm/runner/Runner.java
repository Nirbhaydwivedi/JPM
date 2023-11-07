package com.jpm.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/jpm/feature/Test.feature", glue={"/com/jpm/stepDefination"}, 
monochrome =true, plugin= {"pretty", "html:Reports/TestReport.html"})

public class Runner {

}
 