package stepDefinitions;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BillingSteps {
	
	double billingAmount;
	double taxAmount;
	double finalAmount;

	@Given("User is on Billing Page")
	public void user_is_on_billing_page() {
		
		
	}

	@When("User enter Billing Amount {string}")
	public void user_enter_billing_amount(String billingAmount) {
		this.billingAmount = Double.valueOf(billingAmount);
	}

	@When("User enter Tax Amount {string}")
	public void user_enter_tax_amount(String taxAmount) {
		this.taxAmount = Double.valueOf(taxAmount);
	}

	@Then("User calculates {string}")
	public void user_calculates(String finalAmount) {
		this.finalAmount = this.billingAmount + this.taxAmount;
		assertTrue(this.finalAmount == Double.valueOf(finalAmount));
		
	}
}
