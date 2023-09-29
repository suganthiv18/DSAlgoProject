package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.ConfigReader;
import Utilities.DriverFactory;


public class PortalPage {

	public static WebDriver driver=DriverFactory.getdriver();
	
	String url=ConfigReader.getPortalUrl();
		
	@FindBy (xpath="//a[@href='/home']")WebElement GetStartedLink;
	
	public PortalPage() {

		PageFactory.initElements(driver, this);
	}
	
	public void openPortal() {

        driver.get(url);
		
	}

	public void clickGetStarted() {
		
		GetStartedLink.click();

	}

	public String getPageTitle() {

		return driver.getTitle();
		}
}
