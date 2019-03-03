package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;

public class HomePageStepDefs {
	
	HomePage hp = new HomePage();
	
	@Given("User is Amazon homepage")
	public void user_is_Amazon_homepage() {
		
	}

	@When("clicks on search button")
	public void clicks_on_search_button() {
		
	}

	@When("types {string}")
	public void types(String string) {
		hp.searchBox.sendKeys("Wooden Spoons");
		
	}

	@Then("he should see the search results")
	public void he_should_see_the_search_results() {
	}

}
