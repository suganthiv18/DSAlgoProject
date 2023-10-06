package StepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObjects.DataStructurePage;
import Utilities.LoggerLoad;

public class DataStepDefinition {

    DataStructurePage data = new DataStructurePage();
	
	@Given("The user is on the DS page")
	public void the_user_is_on_the_ds_page() {
		LoggerLoad.info("The user is on the DS page");
		data.clickds();
	}

	@When("User click on Time Complexity in DS page in Python")
	public void the_user_click_on_time_complexity_in_ds_page_in_python() {
		LoggerLoad.info("User is on Time Complexity in DS page in Python");
		data.clicktc();

	}

	@Then("The user should be redirected to Time Complexity in DS page")
	public void the_user_should_be_redirected_to_time_complexity_in_ds_page() {
		LoggerLoad.info("The user should be redirected to Time Complexity in DS page");
		String title=data.getTitle();
		LoggerLoad.info("Title of current page is : " + title);

	} 
	
}