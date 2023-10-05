package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObjects.QueuePage;
import Utilities.LoggerLoad;



public class QueueStepDefinition {
	
	QueuePage queue = new QueuePage();
	
	@Given("The user is on the Queue page")
	public void the_user_is_on_the_queue_page() {
		LoggerLoad.info("The user is on Queue Page");
		queue.clickqueue();
	}

	@When("User click on Implementation of Queue in Python")
	public void the_user_clicks_implementation_of_queue_in_python() {
		LoggerLoad.info("The user clicks implementation of Queue link");
		queue.clickImplemenationofQueue();

	}

	@Then("The user should be redirected to Implementation of Queue page")
	public void the_user_should_be_redirected_to_implementation_of_queue_in_page() {
		LoggerLoad.info("The user is redirected to Arrays in Python page");
		String title=queue.getTitle();
		LoggerLoad.info("Title of current page is : " + title);

	} 
	
	@When("User click on Implementation using Collections in Python")
	public void the_user_clicks_implementation_using_collections_in_python() {
		LoggerLoad.info("The user clicks Implementation using Collections link");
		queue.clickImplementationUsingCollections();

	}

	@Then("The user should be redirected to Implementation using Collections page")
	public void the_user_should_be_redirected_to_implementation_using_collections_page() {
		LoggerLoad.info("The user is redirected to Implementation using Collections page");
		String title=queue.getTitle();
		LoggerLoad.info("Title of current page is : " + title);

	} 
	
	@When("User click on Implementation using Array in Python")
	public void the_user_clicks_implementation_using_array_in_python() {
		LoggerLoad.info("The user clicks Implementation using Collections link");
		queue.clickImplementationUsingArray();

	}

	@Then("The user should be redirected to Implementation using Array page")
	public void the_user_should_be_redirected_to_implementation_using_array_page() {
		LoggerLoad.info("The user is redirected to Implementation using Array page");
		String title=queue.getTitle();
		LoggerLoad.info("Title of current page is : " + title);

	} 
	
	@When("User click on Queue Operations in Python")
	public void the_user_click_on_queue_operations_in_python() {
		LoggerLoad.info("The user clicks Queue Operations link");
		queue.clickQueueOperations();

	}

	@Then("The user should be redirected to Queue Operations page")
	public void the_user_should_be_redirected_to_queue_operations_page() {
		LoggerLoad.info("The user is redirected to Queue Operations page");
		String title=queue.getTitle();
		LoggerLoad.info("Title of current page is : " + title);

	} 
	
}