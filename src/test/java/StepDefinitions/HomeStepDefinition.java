package StepDefinitions;

import static org.testng.Assert.assertEquals;

import PageObjects.HomePage;
import Utilities.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStepDefinition {
	HomePage homePage=new HomePage(); 

	@Given("The user is on Home Page")
	public void the_user_is_on_home_page() {
		LoggerLoad.info("The user is on Home page");
		homePage.gethomePage();
	}

	@When("user clicks on Get Started link on Home {string} without sign in")
	public void user_clicks_on_get_started_link_on_home_without_sign_in(String option) {
		homePage.clickGetStarted(option);
	}


	@Then("The user get alert message {string}")
	public void the_user_get_alert_message(String string) {
		String alert = homePage.getAlert();
		LoggerLoad.info("Alert Message: "+alert);
		assertEquals(alert,string,"Title do not match");

	}

	@When("user clicks on Datastructures Dropdown {string}")
	public void user_clicks_on_datastructures_dropdown(String string) {
		homePage.clickDropdown(string);
	}

	@When("user clicks on Register link")
	public void user_clicks_on_register_link() {
		homePage.register();
	}

	@Then("The user gets redirected to Register Page")
	public void the_user_gets_redirected_to_register_page() {
		LoggerLoad.info("User redirected to Register page ");
		String title=homePage.getTitle();
		LoggerLoad.info("Title of current page is : " + title);
		assertEquals(title, "Registration", "Title do not match"); 
	}
	
	@When("user clicks on Sign in link")
	public void user_clicks_on_sign_in_link() {
	    homePage.signIn();
	}

	@Then("The user gets redirected to Signin Page")
	public void the_user_gets_redirected_to_signin_page() {
		
		LoggerLoad.info("User redirected to Login page ");
		String title=homePage.getTitle();
		LoggerLoad.info("Title of current page is : " + title);
		assertEquals(title, "Login", "Title do not match");
	}

}
