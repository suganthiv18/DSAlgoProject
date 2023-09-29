package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.ConfigReader;
import Utilities.DriverFactory;
import Utilities.LoggerLoad;

public class HomePage { 


	public static WebDriver driver=DriverFactory.getdriver();
	String url=ConfigReader.getHomeUrl();

	@FindBy (xpath="//a[@href='data-structures-introduction']")WebElement dataStructLink ;
	@FindBy (xpath="//a[@href='array']")WebElement  arrayLink ;
	@FindBy (xpath="//a[@href='linked-list']")WebElement linkedListLink ;
	@FindBy (xpath="//a[@href='stack']")WebElement stackLink ;
	@FindBy (xpath="//a[@href='queue']")WebElement queueLink ;
	@FindBy (xpath="//a[@href='tree']")WebElement treeLink ;
	@FindBy (xpath="//a[@href='graph']")WebElement graphLink  ;
	@FindBy (xpath="//div[@role='alert']")WebElement alert ;
	@FindBy (linkText ="Data Structures")WebElement dataDrpDwn ;
	@FindBy (linkText ="Arrays")WebElement arrayDrpDwn ;
	@FindBy (linkText ="Linked List")WebElement LinkdListDrpDwn ;
	@FindBy (linkText ="Queue")WebElement queueDrpDwn ;
	@FindBy (linkText ="Stack")WebElement stackDrpDwn ;
	@FindBy (linkText ="Tree")WebElement treeDrpDwn ;
	@FindBy (linkText ="Graph")WebElement graphDrpDwn ;
	@FindBy (linkText ="Register")WebElement registerElement ;
	@FindBy (linkText ="Sign in")WebElement signInElement ;

	public HomePage() {

		PageFactory.initElements(driver, this);
	}
	public void gethomePage() {

		driver.get(url);	
	}

	public void clickGetStarted(String str) {
		switch(str){
		case "Datastructures":
			LoggerLoad.info("User clicks on DataStructures ");
			dataStructLink.click();
			break;
		case "Arrays":
			LoggerLoad.info("User clicks on Array ");
			arrayLink.click();
			break;
		case "Linkedlist":
			LoggerLoad.info("User clicks on LinkedList ");
			linkedListLink.click();
			break;
		case "Stack":
			LoggerLoad.info("User clicks on Stack ");
			stackLink.click();
			break;
		case "Queue":
			LoggerLoad.info("User clicks on queue ");
			queueLink.click();
			break;
		case "Tree":
			LoggerLoad.info("User clicks on tree ");
			treeLink.click();
			break;
		case "Graph":
			LoggerLoad.info("User clicks on graph ");
			graphLink.click();
			break;
		}
	}


	public String getAlert() {

		return alert.getText();
	}

	public void clickDropdown(String str) {
		dataDrpDwn.click();
		switch (str) {
		case "Arrays":
			LoggerLoad.info("User click on " + str);
			arrayDrpDwn.click();
			break;
		case "Linkedlist":
			LoggerLoad.info("User click on " + str);
			LinkdListDrpDwn.click();
			break;
		case "Stack":
			LoggerLoad.info("User click on " + str);
			stackDrpDwn.click();
			break;
		case "Queue":
			LoggerLoad.info("User click on " + str);
			queueDrpDwn.click();
			break;
		case "Tree":
			LoggerLoad.info("User click on " + str);
			treeDrpDwn.click();
			break;
		case "Graph":
			LoggerLoad.info("User click on " + str);
			graphDrpDwn.click();
			break;
		}

	}

	public void register() {
		registerElement.click();
	}


	public String getTitle() {

		return driver.getTitle();

	}

	public void signIn() {
		signInElement.click();

	}

}
