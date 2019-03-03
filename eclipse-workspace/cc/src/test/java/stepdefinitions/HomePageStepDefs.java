package stepdefinitions;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.ResultPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class HomePageStepDefs {
	HomePage hp = new HomePage();
	ResultPage rp = new ResultPage();
	

	@Given("User enters {string} in searchbox")
	public void user_enters_in_searchbox(String string) {
		hp.searchBox.sendKeys("wooden spoons");
		hp.searchButton.click();
	}

	@Then("User should see search results in results page")
	public void user_should_see_search_results_in_results_page() {
		Assert.assertTrue(rp.searchResult.isDisplayed());
	}


}
