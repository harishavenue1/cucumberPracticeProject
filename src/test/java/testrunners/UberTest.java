package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="src/test/resources/AppFeatures/Uber.feature",	 //for specific file	
	glue="stepDefinitions",
	tags="not @Smoke",
	plugin="pretty"
)
public class UberTest {

}
