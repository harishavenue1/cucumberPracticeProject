package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {

	@Given("I have a search field on Amazon Page")
	public void i_have_a_search_field_on_amazon_page() {
		System.out.println("Step 1");
	}

	// [^\"] -> means not(^) of (") -> this group searches anything apart from (") Char
	// when ever we use regExp, we have use ^ and $ as beginning, ending chars in step definition
	@When("^I search for a product with name \"([^\"]+)\" and price (\\d+)$") 
	public void i_search_for_a_product_with_name_and_price(String productName, Integer price) {
		System.out.println("Step 2 " + productName + " " + price);
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
		System.out.println("Step 3 "+ productName);
	}

}

 