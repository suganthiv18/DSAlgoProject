package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObjects.StackPage;
import Utilities.LoggerLoad;

public class StackStepDefinition {

	StackPage stack = new StackPage();
	
	@Given("The user is on the Stack page")
	public void the_user_is_on_the_stack_page() {
		LoggerLoad.info("The user is on Stack Page");
		stack.clickstack();
	}

	@When("User click on Operations in Stack page in Python")
	public void the_user_click_on_operations_in_stack_in_python() {
		LoggerLoad.info("User click on Operations in Stack page in Python");
		stack.clickstackoperations();

	}

	@Then("The user should be redirected to Operations in Stack page")
	public void the_user_should_be_redirected_to_operations_in_stack_page() {
		LoggerLoad.info("Then user should be redirected to Operations in Stack page");
		String title=stack.getTitle();
		LoggerLoad.info("Title of current page is : " + title);

	} 
	
	
	@When("User click on Implementations Page in Python")
	public void the_user_click_on_implementations_page_in_python() {
		LoggerLoad.info("User click on Implementations Page in Python");
		stack.clickstackImpl();

	}

	@Then("The user should be redirected to Implementations Page")
	public void the_user_should_be_redirected_to_implementations_page() {
		LoggerLoad.info("TThe user should be redirected to Implementations Page");
		String title=stack.getTitle();
		LoggerLoad.info("Title of current page is : " + title);

	} 
	
	@When("User click on Applications Page in Python")
	public void the_user_click_on_applications_page_in_python() {
		LoggerLoad.info("User click on Applications Page in Python");
		stack.clickstackAppl();

	}

	@Then("The user should be redirected to Applications Page")
	public void the_user_should_be_redirected_to_applications_page() {
		LoggerLoad.info("The user should be redirected to Applications Page");
		String title=stack.getTitle();
		LoggerLoad.info("Title of current page is : " + title);

	} 
}