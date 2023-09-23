package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"StepDefinitions"},
plugin = {"pretty","html:target/HTMLreports/report.html",
		"json:target/JSONreports/report.json",
"junit:target/Junitreports/report.xml"},
monochrome = true)
public class TestRunner {

}
