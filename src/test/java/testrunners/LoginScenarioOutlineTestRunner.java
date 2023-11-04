package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="src/test/resources/AppFeatures/Login.feature",	 //for specific file	
	glue="stepDefinitions",
	plugin="pretty"
)
public class LoginScenarioOutlineTestRunner {

}
