package StepDefinitions;


import static org.testng.Assert.assertEquals;

import PageObjects.PortalPage;
import Utilities.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PortalStepDefinition { 

	PortalPage openPage=new PortalPage();

	@Given("The user opens the DS Algo portal link")
	public void the_user_opens_the_ds_algo_portal_link() {
		LoggerLoad.info("User is on DSAlgo portal page");
		openPage.openPortal();

	}

	@When("The user clicks on {string} button")
	public void the_user_clicks_on_button(String string) {
		LoggerLoad.info("User clicks on \"Getstarted link\" on Main Page");
		openPage.clickGetStarted();
	}

	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() throws Exception {

		String title=openPage.getPageTitle();
		System.out.println(title);
		LoggerLoad.info("Title of current page is ***** " +title+ " ****");
		assertEquals(title, "NumpyNinja", "Title do not match");

	}


}
