package cucumberOptions;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "@target/failed_scenario.txt",
		glue = "StepDefinitions",
		monochrome = true,
		dryRun = false,
		plugin = {"html:target/cucumber.html", "json:target/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class FailedTestRunner extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();	
	}

}
