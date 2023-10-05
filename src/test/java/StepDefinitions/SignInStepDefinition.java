package StepDefinitions;

import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;
import java.util.List;



import PageObjects.SignInPage;
import Utilities.ConfigReader;
import Utilities.ExcelReader;
import Utilities.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInStepDefinition {

	SignInPage signinPg =new SignInPage();
	String excelpath=ConfigReader.getExcelFilepPath();
	
	@Given("The user is on signin page")
	public void the_user_is_on_signin_page() {

		signinPg.getLoginPage(); 
	}

	@When("The user clicks on register link on signin page")
	public void the_user_clicks_on_register_link_on_signin_page() {
		SignInPage.clickRegisterLnk();
	}

	@Then("The user redirected to Registration page from signin page")
	public void the_user_redirected_to_registration_page_from_signin_page() {
		System.out.println(signinPg.getTitle());
	}

	@Given("The user is on Sign in page")
	public void the_user_is_on_sign_in_page() {
		signinPg.getLoginPage();
	}

	@When("The user enter invalid {string} and {string}")
	public void the_user_enter_invalid_and(String username, String password) {
		signinPg.isLogin(username, password);
	}

	@Then("click login button to verify")
	public void click_login_button_to_verify() {
		signinPg.clickLoginBtn();
		
	}

	@Given("The user is on Login page")
	public void the_user_is_on_login_page() {
		signinPg.getLoginPage();
	}

	@When("The user enter sheet {string} and {int}")
	public void the_user_enter_sheet_and(String sheetname, Integer rownum) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> listLogin= reader.getData(excelpath, sheetname);
		String uname=listLogin.get(rownum).get("Username");
		String pwd=listLogin.get(rownum).get("Password");
		System.out.println("username :"+uname+" "+pwd);
		signinPg.isLogin(uname, pwd);
	}

	@Then("click login button")
	public void click_login_button() {
		signinPg.clickLoginBtn();
	}
	
	@Given("The user clicks sign in button")
	public void the_user_clicks_sign_in_button() {
		//signinPg.getHomePage();
	   signinPg.clickSignin();
	}

	@Given("enter valid username {string} and password {string}")
	public void enter_valid_username_and_password(String username, String passwd) {
	    signinPg.isLogin(username, passwd);
	}

	@When("The user clicks login button")
	public void the_user_clicks_login_button() {
	   signinPg.clickLoginBtn();
	}


	@Given("The user is on signin page with valid username {string} and password {string}")
	public void the_user_is_on_signin_page_with_valid_username_and_password(String uname, String pwd) {
		signinPg.getLoginPage();
		signinPg.isLogin(uname, pwd);
		signinPg.clickLoginBtn();
		System.out.println("uname:"+uname+" pwd:"+pwd+"is logged in");
	}

	@When("The user click signout button")
	public void the_user_click_signout_button() {
		signinPg.clickLogoutBtn();
	}

	@Then("The user redirected to homepage")
	public void the_user_redirected_to_homepage() {
		String alert=signinPg.getAlertMsg();
		System.out.println(alert);
		String url= signinPg.getTitle();
		System.out.println(url);
	}

}
