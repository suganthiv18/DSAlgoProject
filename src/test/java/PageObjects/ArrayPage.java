package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.ConfigReader;
import Utilities.DriverFactory;

public class ArrayPage {

	public static WebDriver driver=DriverFactory.getdriver();
	String url=ConfigReader.getHomeUrl();

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

	//	public void runValidPythonCode(String string){
	//		driver.findElement(By.xpath("//div[@class='CodeMirror-scroll']")).sendKeys("hello");
	//	}
	public void getPythonCode(String sheetname, String rownumber) {


	}


	public void clickRunBtn() {
		runBtnElmnt.click();

	}
	public void clickSubmitBtn() {
		submitElmt.click();
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
