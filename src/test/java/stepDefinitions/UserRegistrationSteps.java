package stepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistrationSteps {

	@Given("User is on Registration Page")
	public void user_is_on_registration_page() {
		System.out.println("Step1");
	}

	@When("User enters following user details")
	public void user_enters_following_user_details(DataTable dataTable) {
		List<List<String>> usersList = dataTable.asLists(String.class);
		for (List<String> e: usersList) {
			System.out.println(e);
		}
	}

	@Then("User Registration is Successful")
	public void user_registration_is_successful() {
		System.out.println("Step3");
	}

	@When("User enters following user details columns")
	public void user_enters_following_user_details_columns(DataTable dataTable) {
		List<Map<String, String>> usersList = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> e: usersList) {
			System.out.println(e);
		}
	}
}

