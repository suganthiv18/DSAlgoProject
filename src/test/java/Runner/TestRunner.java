package Runner;

import org.junit.runner.RunWith;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import Utilities.ConfigReader;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
glue={"StepDefinitions","Hooks"},
tags="@Home"
//plugin = {"pretty","html:target/HTMLreports/report.html",
//		"json:target/JSONreports/report.json",
//"junit:target/Junitreports/report.xml"},
//monochrome = true)
)
public class TestRunner{
	
}

//public class TestRunner extends AbstractTestNGCucumberTests {
//
////	@DataProvider(parallel=true)
////	public Object[][]scenarios(){
////		return super.scenarios();
////	}
////	
////	@BeforeTest
////	@Parameters("browserType")
////	public void beforeClass(String browser){
////		ConfigReader.setBrowserType("browserType");
////	}
//}
