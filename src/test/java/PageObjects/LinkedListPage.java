package PageObjects;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Config;

import Utilities.ConfigReader;
import Utilities.DriverFactory;
import Utilities.ExcelReader;

public class LinkedListPage {

	public static WebDriver driver=DriverFactory.getdriver();
	String excelpath=ConfigReader.getExcelFilepPath();
	//LinkedListURLs
	String LinkedListUrl=ConfigReader.getLinkedListUrl();
	String IntroductionUrl=ConfigReader.getIntroductionUrl();
	String CreateLinkedListUrl=ConfigReader.getCreateLinkedListUrl();
	String TypesLinkedListUrl=ConfigReader.getTypesLinkedListUrl();
	String ImpLinkedListUrl=ConfigReader.getImplinkedListUrl(); 
	String TraversalUrl=ConfigReader.getTraversalUrl();
	String InsertionUrl=ConfigReader.getInsertionUrl();
	String DeletionUrl=ConfigReader.getDeletionUrl();
	
	
	@FindBy(xpath="//a[@href='/tryEditor']")WebElement tryHereBtn;
	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")WebElement textEditorElmnt;
	@FindBy(xpath="//button[text()='Run']")WebElement runBtnElmnt;
	@FindBy(xpath="//pre[@id='output']")WebElement outputElmnt;
	@FindBy(xpath="//a[@href='/linked-list/practice']")WebElement pracQnElmt;
	
	public LinkedListPage() {

		PageFactory.initElements(driver, this);
	}
	
	public void clickLinkedList() {
		driver.get(LinkedListUrl);
		
	}

	public void clickIntoLink() {
		driver.get(IntroductionUrl);
		
	}
	
	public void clickCreateLinkedList() {
		driver.get(CreateLinkedListUrl);
	}
	
	public void clickTypesLinkedList() {
		driver.get(TypesLinkedListUrl);
	}
	
	public void clickImpLinkedList() {
		driver.get(ImpLinkedListUrl);
	}
	public void clickTraversal() {
		driver.get(TraversalUrl);
		
	}
	public void clickInsertion() {
		driver.get(InsertionUrl);
		
	}
	public void clickDeletion() {
		driver.get(DeletionUrl);
		
	}
	public String getTitle() {
		
		return driver.getTitle();
	}

	public void clickTryHereBtn() {
		
		tryHereBtn.click();
	}

	public void getTryEditorPage() {
		driver.get(ConfigReader.getTryEditorUrl());
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
	
//	public static String getErrorText() {
//		String errorMsg = driver.switchTo().alert().getText();
//		return errorMsg;
//	}
	public static String getErrorText() throws Throwable {
		String msg;

		Alert alert = driver.switchTo().alert();
		msg=alert.getText();

		Thread.sleep(2000);

		alert.accept();

		return msg;
	}

	public void clickPractQnLink() {
		pracQnElmt.click();
		
	}

	
}
