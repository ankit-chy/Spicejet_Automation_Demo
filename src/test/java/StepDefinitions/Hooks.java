package StepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetUp;

public class Hooks {
	TestContextSetUp testContextSetup;
	
	public Hooks(TestContextSetUp testContextSetup) 
	{
		this.testContextSetup = testContextSetup;
	}
	@AfterStep
	public void AddScreenShot(Scenario scenario) throws IOException
	{
		WebDriver driver = testContextSetup.testBase.WebDriverManager();
		if(scenario.isFailed())
		{
			System.out.println("Test Failed, Hence No ScreenShot Captured");
			
		}else {
			
			  File sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			  byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
			  scenario.attach(fileContent, "image/png", "Passed");
		}
	}
	
	@After
	public void AfterScenario() throws IOException
	{
		testContextSetup.testBase.WebDriverManager().quit();		
	}

}
