package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.ConfigReader;
import Utilities.DriverFactory;

public class SignInPage {

	public  static WebDriver driver=DriverFactory.getdriver();
	String homeurl=ConfigReader.getHomeUrl();
	String loginUrL=ConfigReader.getSignInUrl();

	boolean isRequired;
	
	@FindBy (name="username") static WebElement username;
	@FindBy (name="password")static WebElement password;
	@FindBy (xpath="//input[@type='submit']")WebElement loginBtn;
	@FindBy (xpath="//div[@role='alert']")WebElement alertMsg;
	@FindBy (xpath="//a[@href='/register']")static WebElement register;
	@FindBy (xpath="//a[@href='/login']")static WebElement loginlnk;
	@FindBy (xpath="//a[@href='/logout']")WebElement logoutBtn;
	
	public SignInPage() {

		PageFactory.initElements(driver, this);
	}

	public void getLoginPage() {
		driver.get(loginUrL);
	}

	public static void clickRegisterLnk() {
	    register.click();
			
	}
	
	public String getTitle() {
		 return driver.getTitle();
	}
	
	
	public Boolean isLogin(String uname, String pwd) {

		username.clear();
		username.sendKeys(uname);
		password.clear();
		password.sendKeys(pwd);

		// To check empty fields , we need to check "required" field is on an attribute
		if ( uname.isBlank()) {
			JavascriptExecutor js_user = (JavascriptExecutor) driver;
			isRequired = (Boolean) js_user.executeScript("return arguments[0].required;", username);
			return isRequired;
		} else if (pwd.isBlank()) {
			JavascriptExecutor js_password = (JavascriptExecutor) driver;
			isRequired = (Boolean) js_password.executeScript("return arguments[0].required;", password);
			return isRequired;

		}
		return isRequired;
	}

	public void clickLoginBtn() {
		loginBtn.click();
		
	}
	public void clickLogoutBtn() {
		logoutBtn.click();
		
	}
	public String getAlertMsg() {
		return alertMsg.getText();
	}

	public void clickSignin() {
	 loginlnk.click();
		
	}

	public void getHomePage() {
		driver.get(homeurl);
		
	}

	
	
	
	
}
