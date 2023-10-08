package Runner;

import org.testng.annotations.DataProvider;

//import com.beust.jcommander.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"html:Reports/Cucumber-Reports/Reports.html"},
monochrome = false, // console output
tags = "", // tags from feature file
features = { "src/test/resources/features" }, 
glue = { "StepDefinitions", "Hooks" }) 

public class TestRunner extends AbstractTestNGCucumberTests {
	//@Parameters({"browser","url"})
	@DataProvider(parallel = false)
	public void test() {
	
		System.out.println("Success");
		}

}