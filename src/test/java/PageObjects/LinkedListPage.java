package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Config;

import Utilities.ConfigReader;
import Utilities.DriverFactory;

public class LinkedListPage {

	public static WebDriver driver=DriverFactory.getdriver();
	
	//LinkedListURLs
	String LinkedListUrl=ConfigReader.getLinkedListUrl();
	String IntroductionUrl=ConfigReader.getIntroductionUrl();
	String CreateLinkedListUrl=ConfigReader.getCreateLinkedListUrl();
	String TypesLinkedListUrl=ConfigReader.getTypesLinkedListUrl();
	String ImpLinkedListUrl=ConfigReader.getImplinkedListUrl();
	
	@FindBy(xpath="//a[@href='/tryEditor']")WebElement tryHereBtn;
	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")WebElement textEditorElmnt;
	@FindBy(xpath="//button[text()='Run']")WebElement runBtnElmnt;
	@FindBy(xpath="//pre[@id='output']")WebElement outputElmnt;
	
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

	public String getTitle() {
		
		return driver.getTitle();
	}

	public void clickTryHereBtn() {
		
		tryHereBtn.click();
	}

	public void getTryEditorPage() {
		driver.get(ConfigReader.getTryEditorUrl());
	}

	public void runPythonCode(String string) {
	textEditorElmnt.sendKeys(string);
	}

	public void clickRunBtn() {
		runBtnElmnt.click();
		
	}

	public String getOutput() {
		return outputElmnt.getText();
	}
	
	public static String getErrorText() {
		String errorMsg = driver.switchTo().alert().getText();
		return errorMsg;
	}

}
