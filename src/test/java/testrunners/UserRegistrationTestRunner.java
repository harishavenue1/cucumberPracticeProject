package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="src/test/resources/AppFeatures/UserRegistration.feature",		
	
	glue={"stepDefinitions"}, 
	//stepDefinitions - package contains methods for steps
	// myHooks - package contains before and after methods - for every scenario
	
	plugin={"pretty",							// report1
			"json:target/MyReports/report.json",// report2
			"junit:target/MyReports/report.xml"},// report3
	dryRun=false // validates structure
	//publish=true // moved this value to cucumber.properties
)
public class UserRegistrationTestRunner {
	
}

