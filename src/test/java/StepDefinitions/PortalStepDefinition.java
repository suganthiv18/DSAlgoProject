package StepDefinitions;

import PageObjects.PortalPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PortalStepDefinition {

	PortalPage openPage=new PortalPage();

	@Given("The user opens the DS Algo portal link")
	public void the_user_opens_the_ds_algo_portal_link() {
		openPage.openPortal();

	}

	@When("The user clicks on {string} button")
	public void the_user_clicks_on_button(String string) {
		openPage.clickGetStarted();
	}

	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() {

		String title=openPage.getTitle();
		System.out.println(title);

	}


}
