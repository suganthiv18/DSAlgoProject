package StepDefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import PageObjects.ArrayPage;
import PageObjects.LinkedListPage;
import Utilities.ConfigReader;
import Utilities.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArrayStepDefinition {

	ArrayPage arrayPage = new ArrayPage();

//	@Given("The user is on Signin page of DS Algo portal")
//	public void the_user_is_on_signin_page_of_ds_algo_portal() {
//	  LoggerLoad.info("The user is on Signin page");
//	  String  url=ConfigReader.getSignInUrl();
//	  ArrayPage.driver.get(url);
//	}
//
//	@When("The user enter valid {string} and {string}")
//	public void the_user_enter_valid_and(String string, String string2) {
//	   arrayPage.
//	}
//
//	@When("The user click on login button")
//	public void the_user_click_on_login_button() {
//	    
//	}
//
//	@Given("The user is on the Home page")
//	public void the_user_is_on_the_home_page() {
//	    
//	}

	@Given("The user is on the Array page")
	public void the_user_is_on_the_array_page() {
		LoggerLoad.info("The user is on Array Page");
		arrayPage.clickArrayPage();
	}

	@When("The user clicks Arrays in Python link")
	public void the_user_clicks_arrays_in_python_button() {
		LoggerLoad.info("The user clicks Arrays in Python link");
		arrayPage.clickArrayPythonLink();

	}

	@Then("The user should be redirected to Arrays in Python page")
	public void the_user_should_be_redirected_to_arrays_in_python_page() {
		LoggerLoad.info("The user is redirected to Arrays in Python page");
		String title=arrayPage.getTitle();
		LoggerLoad.info("Title of current page is : " + title);

	} 

	@Given("The user is on Arrays in Python page")
	public void the_user_is_on_arrays_in_python_page() {
		arrayPage.clickArrayPythonLink();
		LoggerLoad.info("The user is on Arrays in Python page");
	}

	@When("The user clicks Try Here button")
	public void the_user_clicks_try_here_button() {
		LoggerLoad.info("The user clicks Try Here button");
		arrayPage.clickTryHereBtn();
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		LoggerLoad.info("The user clicks is on Try Editor page");
		String title=arrayPage.getTitle();
		LoggerLoad.info("Title of current page is : " + title);
		//	assertEquals(title,"Assessment","Title do not match");
	}

	@Given("The user is in a page having an tryEditor with a Run button to test")
	public void the_user_is_in_a_page_having_an_try_editor_with_a_run_button_to_test() {
		LoggerLoad.info("The user clicks is on Try Editor page");
		arrayPage.clickTryEditorLink();
	}

	@When("The user enter valid python code in tryEditor from sheet {string} and {int}")
	public void the_user_enter_valid_python_code_in_try_editor_from_sheet_and(String sheetname, Integer rownum) throws InvalidFormatException, IOException {
		LoggerLoad.info("The user enter valid python code in tryEditor");
		arrayPage.runPythonCode(sheetname,rownum);

	}

	@When("The user clicks run button")
	public void the_user_clicks_run_button() {
		LoggerLoad.info("The user clicks run button");
		arrayPage.clickRunBtn();
	}

	@Then("The user should be presented with Run result")
	public void the_user_should_be_presented_with_run_result() {
		LoggerLoad.info("The user is presented output");
		String output=arrayPage.getOutput();
		System.out.println(output);
		LoggerLoad.info("The result is :"+output);
	}

	@When("The user enter python code with invalid syntax in tryEditor from sheet  {string} and {int}")
	public void the_user_enter_python_code_with_invalid_syntax_in_try_editor_from_sheet_and(String sheetname, Integer rownum) throws InvalidFormatException, IOException, InterruptedException {
		LoggerLoad.info("The user is enters pythoncode");
		arrayPage.runPythonCode(sheetname,rownum);

	}

	@Then("The user should be presented with error result")
	public void the_user_should_be_presented_with_error_result() throws Throwable {
		String actualMsg = null;


		actualMsg = ArrayPage.getErrorText();

		LoggerLoad.info("Actual Error message is  : " + actualMsg);
		assertEquals(actualMsg,"NameError: name 'hello' is not defined on line 1", "Result do not match");
	}

	@When("The user clicks Arrays Using List link")
	public void the_user_clicks_arrays_using_list_link() {
		LoggerLoad.info("The user clicks Arrays Using List link");
		arrayPage.clickArrayListLink();
	}

	@Then("The user should be redirected to Arrays Using List page")
	public void the_user_should_be_redirected_to_arrays_using_list_page() {
		LoggerLoad.info("The user should be redirected to Arrays Using List page");
		String title=arrayPage.getTitle();
		LoggerLoad.info("Title of current page is : " + title);

	}


	@Given("The user is on Arrays Using List page")
	public void the_user_is_on_arrays_using_list_page() {
		LoggerLoad.info("The user is on Arrays Using List page");
		arrayPage.clickArrayListLink();
	}

	@When("The user clicks Basic Operations in Lists page")
	public void the_user_clicks_basic_operations_in_lists_page() {
		LoggerLoad.info("The user clicks Basic Operations in Lists page");
		arrayPage.clickBasicOpLink();
	}

	@Then("The user should be redirected to Basic Operations in Lists page")
	public void the_user_should_be_redirected_to_basic_operations_in_lists_page() {
		LoggerLoad.info("The user should be redirected to Basic Operations in Lists page");
		String title=arrayPage.getTitle();
		LoggerLoad.info("Title of current page is : " + title);
	}

	@Given("The user is on the Basic Operations in Lists page")
	public void the_user_is_on_the_basic_operations_in_lists_page() {
		LoggerLoad.info("The user is on the Basic Operations in Lists page");
		arrayPage.clickBasicOpLink();
	}

	@When("The user clicks Applications of Array link")
	public void the_user_clicks_applications_of_array_link() {
		LoggerLoad.info("The user clicks Applications of Array link");
		arrayPage.clickAppArrayLink();
	}

	@Then("The user should be redirected to Applications of Array page")
	public void the_user_should_be_redirected_to_applications_of_array_page() {
		LoggerLoad.info("The user should be redirected to Applications of Array page");
		String title=arrayPage.getTitle();
		LoggerLoad.info("Title of current page is : " + title);
	}

	@Given("The user is on the Applications of Array after logged in")
	public void the_user_is_on_the_applications_of_array_after_logged_in() {
		LoggerLoad.info("The user is on the Applications of Array after logged in");
		arrayPage.clickAppArrayLink();
	}

	@When("The user clicks Practice Questions link")
	public void the_user_clicks_practice_questions_link() {
		LoggerLoad.info("The user clicks Practice Questions link");
		arrayPage.clickPracticeQnLink();
	}

	@Then("The user should be redirected to Practice page")
	public void the_user_should_be_redirected_to_practice_page() {
		LoggerLoad.info("The user should be redirected to Practice page");
		String title=arrayPage.getTitle();
		LoggerLoad.info("Title of current page is : " + title);
	}
	@Given("The user is on the Practice page after logged in")
	public void the_user_is_on_the_practice_page_after_logged_in() {
		LoggerLoad.info("The user is on the Practice page after logged in");
		arrayPage.clickPracticeQnLink();
	}

	@When("The user clicks the Search the array link")
	public void the_user_clicks_the_search_the_array_link() {
		LoggerLoad.info("The user clicks the Search the array link");
		arrayPage.clickSearchArray();
	}

	@Then("The user should be redirected to question page contains an tryEditor with Run and Submit buttons")
	public void the_user_should_be_redirected_to_question_page_contains_an_try_editor_with_run_and_submit_buttons() {
		LoggerLoad.info("The user should be redirected to question page contains an tryEditor");
		String title=arrayPage.getTitle();
		LoggerLoad.info("Title of current page is : " + title);
	}

	@Given("The user is on Question page of Search the array link")
	public void the_user_is_on_question_page_of_search_the_array_link() {
		//arrayPage.clickTryEditorSearchLink(); 
		LoggerLoad.info("The user is on Question page of Search the array link");
		arrayPage.clickPracticeQnLink();
		arrayPage.clickSearchArray();
		arrayPage.txteditorclr();
	}

	@When("The user clicks Submit button")
	public void the_user_clicks_submit_button() {
		LoggerLoad.info("The user clicks Submit button");
		arrayPage.clickSubmitBtn();
	}

	@Then("The user should be presented with successful submission message")
	public void the_user_should_be_presented_with_successful_submission_message() throws InterruptedException {
		LoggerLoad.info("The user is presented output");
		Thread.sleep(1000);
		String output=arrayPage.getOutput();
		LoggerLoad.info("The result is :"+output);
	}

	@When("The user clicks the Max Consecutive Ones link")
	public void the_user_clicks_the_max_consecutive_ones_link() {
		LoggerLoad.info("The user clicks the Max Consecutive Ones link");
		arrayPage.clickMaxArrayLink();
	}

	@Then("The user should be redirected to question page contains an tryEditor for Max Consecutive Ones link")
	public void the_user_should_be_redirected_to_question_page_contains_an_try_editor_for_max_consecutive_ones_link() {
		LoggerLoad.info("The user should be redirected to question page contains a tryEditor");
		String title=arrayPage.getTitle();
		LoggerLoad.info("Title of current page is : " + title);
	}


	@Given("The user is on Question page of Max Consecutive Ones after logged in")
	public void the_user_is_on_question_page_of_max_consecutive_ones_after_logged_in() {
		//arrayPage.clickTryEditorMaxLink();
		LoggerLoad.info("The user is on Question page of Max Consecutive Ones");
		arrayPage.clickPracticeQnLink();
		arrayPage.clickMaxArrayLink();
		arrayPage.txteditorclr();
	}


	@When("The user clicks on  Find Numbers with Even Number of Digits")
	public void the_user_clicks_on_find_numbers_with_even_number_of_digits() {
		LoggerLoad.info("The user clicks on  Find Numbers with Even Number of Digits");
		arrayPage.clickFindEvenLink();
	}

	@Then("The user should be redirected to question page contains an tryEditor for Find Numbers with Even Number of Digits")
	public void the_user_should_be_redirected_to_question_page_contains_an_try_editor_for_find_numbers_with_even_number_of_digits() {
		LoggerLoad.info("The user should be redirected to question page contains an tryEditor");
		String title=arrayPage.getTitle();
		LoggerLoad.info("Title of current page is : " + title);
	}

	@Given("The user is on Question page of Find Numbers with Even Number of Digits after logged in")
	public void the_user_is_on_question_page_of_find_numbers_with_even_number_of_digits_after_logged_in() {
		// arrayPage.clickTryEditorEvenLink();
		LoggerLoad.info("The user is on Question page of Find Numbers with Even Number of Digit");
		arrayPage.clickPracticeQnLink();
		arrayPage.clickFindEvenLink();
		arrayPage.txteditorclr();
	}
	@When("The user clicks on  Squares of a Sorted Array")
	public void the_user_clicks_on_squares_of_a_sorted_array() {
		LoggerLoad.info("The user clicks on  Squares of a Sorted Array");
		arrayPage.clickFindSortLink();
	}

	@Then("The user should be redirected to question page contains an tryEditor for Squares of a Sorted Array")
	public void the_user_should_be_redirected_to_question_page_contains_an_try_editor_for_squares_of_a_sorted_array() {
		LoggerLoad.info("The user should be redirected to question page contains an tryEditor");
		String title=arrayPage.getTitle();
		LoggerLoad.info("Title of current page is : " + title);  
	}

	@Given("The user is on Question page of Squares of a Sorted Array after logged in")
	public void the_user_is_on_question_page_of_squares_of_a_sorted_array_after_logged_in() {
		// arrayPage.clickTryEditorSortLink();
		LoggerLoad.info("The user is on Question page of Squares of a Sorted Array");
		arrayPage.clickPracticeQnLink();
		arrayPage.clickFindSortLink();
		arrayPage.txteditorclr();
	}
}
