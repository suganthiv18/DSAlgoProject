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


public class StackPage {
	public static WebDriver driver = DriverFactory.getdriver();
	String stackurl =ConfigReader.getStackUrl();
	String stackoperations = ConfigReader.getStackOpUrl();
	String stackimplementation =ConfigReader.getStackImpUrl();
	String stackapplication =ConfigReader.getStackAppUrl();
    String homeUrl=ConfigReader.getHomeUrl();
	String qpracquesurl = ConfigReader.getPracQnLLUrl();
	String tryEditorUrl=ConfigReader.getTryEditorUrl();

	@FindBy(xpath="//a[@href='/tryEditor']") WebElement tryHereElmnt;
	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")WebElement textEditorElmnt;
	@FindBy(xpath="//button[text()='Run']") WebElement runBtnElmnt;
	@FindBy(xpath="//input[@type='submit']") WebElement submitElmt ;
	@FindBy(xpath="//pre[@id='output']") WebElement outputElmnt;
	
	public StackPage() {
	
		PageFactory.initElements(driver, this);	
	}

	public void clickstack() {
		driver.get(stackurl);
		
	}

	public void clickstackoperations() {
		
		driver.get(stackoperations);
	}

	public void clickstackImpl() {
		
		driver.get(stackimplementation);
	}
	
public void clickstackAppl() {
		
		driver.get(stackapplication);
	}


	public void clickPracticeQnLink() {
		driver.get(qpracquesurl);
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
	
}