package myHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class SearchHooks {
	
	// Hooks are of 3 types
	/*
	 * @Before / @After - Simple before for Scenario
	 * @Before / @After(order=1) - Customize flow with order=#
	 * @Before / @After("@tag")  - Customize for specific scenario tags
	 */
	
	@Before(order=1)
	public void setup_browser(Scenario sc) {
		System.out.println("launch chrome browser");
		System.out.println("Scenario Name => "+ sc.getName());
	}
	
	@Before(order=2)
	public void setup_url() {
		System.out.println("launch url");
	}
	
	@Before("@smoke")
	public void setup_smoke_url() {
		System.out.println("initialize db");
	}
	
	@After(order=2)
	public void tearDown_logout() {
		System.out.println("logout of app");
	}
	
	@After(order=1)
	public void tearDown_browser(Scenario sc) {
		System.out.println("Close browser");
		System.out.println("Scenario Status => "+ sc.getStatus());
	}

	@After("@smoke")
	public void tearDown_smoke_cleanup(Scenario sc) {
		System.out.println("clean up db");
	}

	@BeforeStep
	public void takeScreenShot() {
		System.out.println("Take Screenshot");
	}
	
	@AfterStep
	public void updateStatusToReport() {
		System.out.println("Status Updated to Report");
		System.out.println("------------------------");
	}
	
}
