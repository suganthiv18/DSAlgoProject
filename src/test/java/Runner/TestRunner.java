package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
									"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
									"html:Reports/Cucumber-Reports/Reports.html"},
monochrome = false,
features = { "src/test/resources/features" }, 
glue = { "StepDefinitions", "Hooks" }) 

public class TestRunner extends AbstractTestNGCucumberTests {
}