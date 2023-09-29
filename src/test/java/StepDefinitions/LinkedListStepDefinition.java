package StepDefinitions;

import static org.testng.Assert.assertEquals;

import PageObjects.LinkedListPage;
import Utilities.LoggerLoad;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedListStepDefinition {

	LinkedListPage linkedList=new LinkedListPage();


	@Given("The user is on the Linked List page after logged in")
	public void the_user_is_on_the_linked_list_page_after_logged_in() {
		LoggerLoad.info("The user on inked List page");
		linkedList.clickLinkedList();
	}

	@When("The user clicks Introduction link")
	public void the_user_clicks_introduction_link() {
		LoggerLoad.info("The user clicks Introduction Link");
		linkedList.clickIntoLink();
	}

	@Then("The user should be directed to Introduction of Linked List Page")
	public void the_user_should_be_directed_to_introduction_of_linked_list_page() {
		LoggerLoad.info("The user is on Introduction Link");
		String title=linkedList.getTitle();
		LoggerLoad.info("Title of current page is : " + title);
		assertEquals(title,"Introduction","Title do not match");
	}
	@Given("The user is on the Introduction after logged in")
	public void the_user_is_on_the_introduction_after_logged_in() {
		LoggerLoad.info("The user is Introduction Page");
		linkedList.clickIntoLink();
	}

	@When("The user clicks Try Here button in the introduction page")
	public void the_user_clicks_try_here_button_in_the_introduction_page() {
		LoggerLoad.info("The user clicks Try Here Button");
		linkedList.clickTryHereBtn();
	}

	@Then("The user redirected to the page having an tryEditor with a Run button to test")
	public void the_user_redirected_to_the_page_having_an_try_editor_with_a_run_button_to_test() {
		LoggerLoad.info("The user is on tryEditor Page");
		String title=linkedList.getTitle();
		System.out.println(title);
		LoggerLoad.info("Title of current page is : " + title);
		assertEquals(title,"Assessment","Title do not match");
	}

	@Given("The user is in a try here page having  tryEditor with a Run button to test")
	public void the_user_is_in_a_try_here_page_having_try_editor_with_a_run_button_to_test() {
		LoggerLoad.info("The user is  tryEditor Page");
		linkedList.getTryEditorPage();
	}

	@When("The user Enter valid python code in tryEditor from sheet {string}")
	public void the_user_enter_valid_python_code_in_try_editor_from_sheet(String string) {
		LoggerLoad.info("The user is enters pythoncode");
		linkedList.runPythonCode(string);
	}

	@And("user click on Run button")
	public void user_click_on_run_button() {
		LoggerLoad.info("The user clicks run button");
		linkedList.clickRunBtn();
	}

	@Then("The user should be presented with the Run output")
	public void the_user_should_be_presented_with_the_run_output() {
		LoggerLoad.info("The user is presented output");
		String output=linkedList.getOutput();
		LoggerLoad.info("The result is :"+output);
	}

	@When("The user Enter invalid python code in tryEditor from sheet {string}")
	public void the_user_enter_invalid_python_code_in_try_editor_from_sheet(String string) {
		LoggerLoad.info("The user is enters pythoncode");
		linkedList.runPythonCode(string);
	}

	@Then("The user get the error message")
	public void the_user_get_the_error_message() {
		String actualMsg = LinkedListPage.getErrorText();
		LoggerLoad.info("Actual Error message is  :" + actualMsg);
		assertEquals(actualMsg,"NameError: name 'hello' is not defined on line 1", "Result do not match");
	}

	@When("The user clicks creating linked list link")
	public void the_user_clicks_creating_linked_list_link() {
		LoggerLoad.info("User clicks on creating Linkes LIst");
		linkedList.clickCreateLinkedList();
	}

	@Then("The user should be directed to Creating Linked List of Linked List Page")
	public void the_user_should_be_directed_to_creating_linked_list_of_linked_list_page() {
		LoggerLoad.info("The user is on Creating Linked LIst Link");
		String title=linkedList.getTitle();
		LoggerLoad.info("Title of current page is : " + title);
		assertEquals(title,"Creating Linked LIst","Title do not match");
	}

	@Given("The user is on the Creating a Linked List after logged in")
	public void the_user_is_on_the_creating_a_linked_list_after_logged_in() {
		LoggerLoad.info("User is on creating Linkes LIst");
		linkedList.clickCreateLinkedList();
	}

	@When("The user clicks Try Here button in the creating linked list page")
	public void the_user_clicks_try_here_button_in_the_creating_linked_list_page() {
		LoggerLoad.info("User clicks on Try Here Link");
		linkedList.clickTryHereBtn();
	}

	@When("The user Enter valid python code in tryEditor from sheet {string} and {int}")
	public void the_user_enter_valid_python_code_in_try_editor_from_sheet_and(String string, Integer int1) {
		LoggerLoad.info("Enter values from sheet");
	}

	@When("The user Enter invalid python code in tryEditor from sheet {string} and {int}")
	public void the_user_enter_invalid_python_code_in_try_editor_from_sheet_and(String string, Integer int1) {
		LoggerLoad.info("Enter values from sheet");
	}

	@When("The user clicks the Types of Linked List button")
	public void the_user_clicks_the_types_of_linked_list_button() {
		LoggerLoad.info("The user clicks the Types of Linked List button");
		linkedList.clickTypesLinkedList();
	}

	@Then("The user should be directed to Types of Linked List of Linked List Page")
	public void the_user_should_be_directed_to_types_of_linked_list_of_linked_list_page() {
		LoggerLoad.info("The user is on Types of Linked List of Linked List Page");
		String title=linkedList.getTitle();
		LoggerLoad.info("Title of current page is : " + title);
		assertEquals(title,"Types of Linked List","Title do not match");
	}

	@Given("The user is on the Types of Linked list after logged in")
	public void the_user_is_on_the_types_of_linked_list_after_logged_in() {
		LoggerLoad.info("The user is on the Types of Linked list page");
		linkedList.clickTypesLinkedList();
	}

	@When("The user clicks Try Here button in the types of linked list page")
	public void the_user_clicks_try_here_button_in_the_types_of_linked_list_page() {
		LoggerLoad.info("The user clicks Try Here button on Types of linked list page");
		linkedList.clickTryHereBtn();
	}

	@When("The user clicks the Implement Linked List in Python button")
	public void the_user_clicks_the_implement_linked_list_in_python_button() {
	   LoggerLoad.info("user clicks the Implement Linked List in Python Link");
	   linkedList.clickImpLinkedList();
	}

	@Then("The user should be directed to Implement Linked List in Python of Linked List Page")
	public void the_user_should_be_directed_to_implement_linked_list_in_python_of_linked_list_page() {
		LoggerLoad.info("The user is on Types of Linked List of Linked List Page");
		String title=linkedList.getTitle();
		LoggerLoad.info("Title of current page is : " + title);
		assertEquals(title,"Implement Linked List in Python","Title do not match");
	}

	@Given("The user is on the Implement Linked List in Python after logged in")
	public void the_user_is_on_the_implement_linked_list_in_python_after_logged_in() {
		LoggerLoad.info("user clicks the Implement Linked List in Python page");
		linkedList.clickImpLinkedList();
	}

	@When("The user clicks Try Here button in the Implement linked list in python page")
	public void the_user_clicks_try_here_button_in_the_implement_linked_list_in_python_page() {
	   linkedList.clickTryHereBtn();
	}




}
