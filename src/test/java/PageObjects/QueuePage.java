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


public class QueuePage {
	public static WebDriver driver = DriverFactory.getdriver();
	String excelpath=ConfigReader.getExcelFilepPath();
	String QueueURL = ConfigReader.getqueueurl();
	String homeUrl=ConfigReader.getHomeUrl();
	String impofqpythonurl = ConfigReader.getimpofqpythonurl();
	String impcolldqurl = ConfigReader.getimpcolldqurl();
	String impusingarrayurl = ConfigReader.getimpusingarrayurl();
	String queueoperationsurl = ConfigReader.getqueueoperationsurl();
	String qpracquesurl = ConfigReader.getqpracquesurl();
	String tryEditorUrl=ConfigReader.getTryEditorUrl();
	
	@FindBy(xpath="//a[@href='/tryEditor']") WebElement tryHereElmnt;
	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")WebElement textEditorElmnt;
	@FindBy(xpath="//button[text()='Run']") WebElement runBtnElmnt;
	@FindBy(xpath="//input[@type='submit']") WebElement submitElmt ;
	@FindBy(xpath="//pre[@id='output']") WebElement outputElmnt;
	
	public QueuePage() {
	
		PageFactory.initElements(driver, this);	
	}

	public void clickqueue() {
		driver.get(QueueURL);
		
	}

	public void clickImplemenationofQueue() {
		
		driver.get(impofqpythonurl);
	}

	public void clickImplementationUsingCollections() {
		
		driver.get(impcolldqurl);
	}

	public void clickImplementationUsingArray() {
		
		driver.get(impusingarrayurl);
	}

	public void clickQueueOperations() {
		
		driver.get(queueoperationsurl);
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
	
		
	}