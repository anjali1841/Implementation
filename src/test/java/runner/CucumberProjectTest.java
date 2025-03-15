package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\poloju.anjali\\Downloads\\ProjectImplementation"},
		glue = {"stepdefinition","hooks"},
		plugin = {"html:./reports/cucumber_report.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)


public class CucumberProjectTest {

}
