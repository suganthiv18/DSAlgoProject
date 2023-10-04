package PageObjects;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.ConfigReader;
import Utilities.DriverFactory;
import Utilities.ExcelReader;

public class ArrayPage {

	public static WebDriver driver=DriverFactory.getdriver();
	//String siginUrl=ConfigReader.getSignInUrl();
	String url=ConfigReader.getHomeUrl();
	String excelpath=ConfigReader.getExcelFilepPath();
	//ArrayURLs 
	String homeUrl=ConfigReader.getHomeUrl();
	String arrayurl=ConfigReader.getArrayUrl();
	String arrayPythonurl=ConfigReader.getArrayinPythonUrl();
	String arrayListUrl=ConfigReader.getArrayListUrl();
	String arrayBasicOpUrl=ConfigReader.getArrayBasicOpUrl();
	String arrayApplicationUrl=ConfigReader.getArrayApplicationUrl();
	String arrayPracticeQnUrl=ConfigReader.getArrayPracQnUrl();
	String tryEditorUrl=ConfigReader.getTryEditorUrl();

	@FindBy(xpath="//a[@href='/tryEditor']") WebElement tryHereElmnt;
	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")WebElement textEditorElmnt;
	@FindBy(xpath="//button[text()='Run']") WebElement runBtnElmnt;
	@FindBy(xpath="//input[@type='submit']") WebElement submitElmt ;
	@FindBy(xpath="//a[@href='/question/1']") WebElement searchArrayLink ;
	@FindBy(xpath="//a[@href='/question/2']") WebElement maxArrayLink;
	@FindBy(xpath="//a[@href='/question/3']") WebElement findEvenLink;
	@FindBy(xpath="//a[@href='/question/4']") WebElement findSortLink;
	@FindBy(xpath="//pre[@id='output']") WebElement outputElmnt;

	public ArrayPage() {

		PageFactory.initElements(driver, this);
	}
	
//	public void getSiginPage() {
//
//		driver.get(siginUrl);
//	}
	
//	public void Login(String uname, String pwd) {
//
//		username.clear();
//		username.sendKeys(uname);
//		password.clear();
//		password.sendKeys(pwd);
//	
//		}
	public void clickArrayPage() {

		driver.get(arrayurl);
	}

	public void clickArrayPythonLink() {

		driver.get(arrayPythonurl);
	}

	public void clickArrayListLink() {
		driver.get(arrayListUrl);
	}
	public void clickBasicOpLink() {
		driver.get(arrayBasicOpUrl);
	}
	public void clickAppArrayLink() {
		driver.get(arrayApplicationUrl);
	}
	public void clickPracticeQnLink() {
		driver.get(arrayPracticeQnUrl);
	}
	public void clickTryEditorLink() {
		driver.get(tryEditorUrl);
	}

	public String getTitle() {
		String str=driver.getCurrentUrl();
		return str;
	}

	public void clickTryHereBtn() {
		tryHereElmnt.click();
	}

	public void runPythonCode(String sheetname,int rownum) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> listPyCode= reader.getData(excelpath,sheetname);
		String code=listPyCode.get(rownum).get("code");
		System.out.println("code"+code);
		textEditorElmnt.sendKeys(code);
	}


	public void clickRunBtn() {
		runBtnElmnt.click();

	}
	public String getOutput() {
		return outputElmnt.getText();
	}

	public static String getErrorText() throws Throwable {
		String msg;

		Alert alert = driver.switchTo().alert();
		msg=alert.getText();

		Thread.sleep(2000);

		alert.accept();

		return msg;
	}
	
	public void clickSubmitBtn() {
		submitElmt.click();
	}
	
	public void txteditorclr() {
		String s = Keys.chord(Keys.CONTROL, "a");

		textEditorElmnt.sendKeys(s);
		textEditorElmnt.sendKeys(Keys.DELETE);
		
	}
	public void clickSearchArray() {
		searchArrayLink.click();
	}

	public void clickMaxArrayLink() {
		maxArrayLink.click();

	}
	public void clickFindEvenLink() {
		findEvenLink.click();

	}
	public void clickFindSortLink() {
		findSortLink.click();

	}




}
