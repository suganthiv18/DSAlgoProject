package Hooks;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;


import Utilities.ConfigReader;
import Utilities.DriverFactory;
import Utilities.LoggerLoad;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class Hooks {
	
	@BeforeAll
	public static void before() throws Throwable {
		
//		Reading browser name from Config.properties File
		LoggerLoad.info("Loading Config file");
		ConfigReader.loadConfig();
		String browser = ConfigReader.getBrowserType();
		
//		Initializing Driver using Driver Factory
	    WebDriver driver = DriverFactory.initializeDrivers(browser);
		LoggerLoad.info("Initializing driver for : "+browser);
	}
	
	
	@BeforeMethod
	public void scenario(Scenario scenario) {
		LoggerLoad.info("-----------------------------------------------------------------------------------------------");
		LoggerLoad.info(scenario.getSourceTagNames() +" : "+scenario.getName());
		LoggerLoad.info("-----------------------------------------------------------------------------------------------");
		
	}
	
	
//	@AfterAll
//	public static void after() {
//		
//		LoggerLoad.info("Closing Driver");
//	    DriverFactory.closeallDriver();
//	}
	
	
}
