package StepDefinitions;

import PageObjects.ArrayPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArrayStepDefinition {

	ArrayPage arrayPage = new ArrayPage();

	@Given("The user is on the Array page")
	public void the_user_is_on_the_array_page() {
		arrayPage.clickArrayPage();
	}

	@When("The user clicks Arrays in Python link")
	public void the_user_clicks_arrays_in_python_button() {
		arrayPage.clickArrayPythonLink();
	}

	@Then("The user should be redirected to Arrays in Python page")
	public void the_user_should_be_redirected_to_arrays_in_python_page() {
		String url=arrayPage.getTitle();
		System.out.println(url);
	} 
	@Given("The user is on Arrays in Python page")
	public void the_user_is_on_arrays_in_python_page() {
		arrayPage.clickArrayPythonLink();
	}

	@When("The user clicks Try Here button")
	public void the_user_clicks_try_here_button() {
		arrayPage.clickTryHereBtn();
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		String url=arrayPage.getTitle();
		System.out.println(url);
	}
	@Given("The user is in a page having an tryEditor with a Run button to test")
	public void the_user_is_in_a_page_having_an_try_editor_with_a_run_button_to_test() {
		arrayPage.clickTryEditorLink();
	}

	@When("The user enter valid python code in tryEditor from sheet {string} and {string}")
	public void the_user_enter_valid_python_code_in_try_editor_from_sheet_and(String sheetname, String rownumber) {
	   arrayPage.getPythonCode(sheetname,rownumber);
	}

	@When("The user clicks run button")
	public void the_user_clicks_run_button() {
		arrayPage.clickRunBtn();
	}

	@Then("The user should be presented with Run result")
	public void the_user_should_be_presented_with_run_result() {
		//  arrayPage.
	}

	
	@When("The user clicks Arrays Using List link")
	public void the_user_clicks_arrays_using_list_link() {
		arrayPage.clickArrayListLink();
	}

	@Then("The user should be redirected to Arrays Using List page")
	public void the_user_should_be_redirected_to_arrays_using_list_page() {
		String url=arrayPage.getTitle();
		System.out.println(url);
	}
	@Given("The user is on Arrays Using List page")
	public void the_user_is_on_arrays_using_list_page() {
		arrayPage.clickArrayListLink();
	}
	@When("The user clicks Basic Operations in Lists page")
	public void the_user_clicks_basic_operations_in_lists_page() {
		arrayPage.clickBasicOpLink();
	}

	@Then("The user should be redirected to Basic Operations in Lists page")
	public void the_user_should_be_redirected_to_basic_operations_in_lists_page() {
		String url=arrayPage.getTitle();
		System.out.println(url);
	}

	@Given("The user is on the Basic Operations in Lists page")
	public void the_user_is_on_the_basic_operations_in_lists_page() {
		arrayPage.clickBasicOpLink();
	}

	@When("The user clicks Applications of Array link")
	public void the_user_clicks_applications_of_array_link() {
		arrayPage.clickAppArrayLink();
	}

	@Then("The user should be redirected to Applications of Array page")
	public void the_user_should_be_redirected_to_applications_of_array_page() {
		String url=arrayPage.getTitle();
		System.out.println(url); 
	}
	@Given("The user is on the Applications of Array after logged in")
	public void the_user_is_on_the_applications_of_array_after_logged_in() {
		arrayPage.clickAppArrayLink();
	}

	@When("The user clicks Practice Questions link")
	public void the_user_clicks_practice_questions_link() {
		arrayPage.clickPracticeQnLink();
	}

	@Then("The user should be redirected to Practice page")
	public void the_user_should_be_redirected_to_practice_page() {
		String url=arrayPage.getTitle();
		System.out.println(url); 
	}
	@Given("The user is on the Practice page after logged in")
	public void the_user_is_on_the_practice_page_after_logged_in() {
		arrayPage.clickPracticeQnLink();
	}

	@When("The user clicks the Search the array link")
	public void the_user_clicks_the_search_the_array_link() {
		arrayPage.clickSearchArray();
 	}

	@Then("The user should be redirected to question page contains an tryEditor with Run and Submit buttons")
	public void the_user_should_be_redirected_to_question_page_contains_an_try_editor_with_run_and_submit_buttons() {
		String url=arrayPage.getTitle();
		System.out.println(url); 
	}

	@Given("The user is on Question page of Search the array link")
	public void the_user_is_on_question_page_of_search_the_array_link() {
		//arrayPage.clickTryEditorSearchLink(); 
		arrayPage.clickPracticeQnLink();
		arrayPage.clickSearchArray();
	}

	@When("The user clicks Submit button")
	public void the_user_clicks_submit_button() {
		arrayPage.clickSubmitBtn();
	}

	@Then("The user should be presented with successful submission message")
	public void the_user_should_be_presented_with_successful_submission_message() {

	}

	@When("The user clicks the Max Consecutive Ones link")
	public void the_user_clicks_the_max_consecutive_ones_link() {
		arrayPage.clickMaxArrayLink();
	}

	@Then("The user should be redirected to question page contains an tryEditor for Max Consecutive Ones link")
	public void the_user_should_be_redirected_to_question_page_contains_an_try_editor_for_max_consecutive_ones_link() {
		String url=arrayPage.getTitle();
		System.out.println(url); 
	}

		
	@Given("The user is on Question page of Max Consecutive Ones after logged in")
	public void the_user_is_on_question_page_of_max_consecutive_ones_after_logged_in() {
		//arrayPage.clickTryEditorMaxLink();
		arrayPage.clickPracticeQnLink();
		arrayPage.clickMaxArrayLink();
	}

	@Then("The user should be presented with error message")
	public void the_user_should_be_presented_with_error_message() {
	    
	}
	
	@When("The user clicks on  Find Numbers with Even Number of Digits")
	public void the_user_clicks_on_find_numbers_with_even_number_of_digits() {
	   arrayPage.clickFindEvenLink();
	}

	@Then("The user should be redirected to question page contains an tryEditor for Find Numbers with Even Number of Digits")
	public void the_user_should_be_redirected_to_question_page_contains_an_try_editor_for_find_numbers_with_even_number_of_digits() {
		String url=arrayPage.getTitle();
		System.out.println(url); 
	}

	@Given("The user is on Question page of Find Numbers with Even Number of Digits after logged in")
	public void the_user_is_on_question_page_of_find_numbers_with_even_number_of_digits_after_logged_in() {
	  // arrayPage.clickTryEditorEvenLink();
		arrayPage.clickPracticeQnLink();
		arrayPage.clickFindEvenLink();
	}
	@When("The user clicks on  Squares of a Sorted Array")
	public void the_user_clicks_on_squares_of_a_sorted_array() {
	   arrayPage.clickFindSortLink();
	}

	@Then("The user should be redirected to question page contains an tryEditor for Squares of a Sorted Array")
	public void the_user_should_be_redirected_to_question_page_contains_an_try_editor_for_squares_of_a_sorted_array() {
		String url=arrayPage.getTitle();
		System.out.println(url);  
	}

	@Given("The user is on Question page of Squares of a Sorted Array after logged in")
	public void the_user_is_on_question_page_of_squares_of_a_sorted_array_after_logged_in() {
	   // arrayPage.clickTryEditorSortLink();
		arrayPage.clickPracticeQnLink();
		arrayPage.clickFindSortLink();
	}
}
