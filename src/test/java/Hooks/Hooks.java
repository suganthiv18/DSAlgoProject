package Hooks;

import org.openqa.selenium.WebDriver;
import Utilities.ConfigReader;
import Utilities.DriverFactory;
import Utilities.LoggerLoad;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;


public class Hooks {
			
	@BeforeAll
	public static void before() throws Throwable {
		
//		Reading browser name from Config.properties File
		LoggerLoad.info("Loading Config file");
		ConfigReader.loadConfig();
		String browser = ConfigReader.getBrowserType();
		
		//Initializing Driver using Driver Factory
	    WebDriver driver = DriverFactory.initializeDrivers(browser);
		LoggerLoad.info("Initializing driver for : "+browser);
//		driverfactory = new DriverFactory();
//		driver = DriverFactory.initializeDrivers(browser);
//		LoggerLoad.info("Initializing driver for : "+browser);
	}
	
	
	
	@AfterAll
	public static void after() {
		LoggerLoad.info("Closing Driver");
	    DriverFactory.closeallDriver();
	}
	
	
}
