package StepDefinitions;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.PageObjectManager;
import utils.Creds;
import utils.TestContextSetUp;

public class LandingPageStepDefinition {
	
public WebDriver driver; 				 	// initialized the web-driver so it is now accessible throughout  the class
TestContextSetUp testContextSetup;		   //Created variable/instance of test context setup from package utils 
PageObjectManager pageObjectManager;	  //Created variable/instance of Page Object Manager from package page object manager
LandingPage landingPage; 

//Single Responsibility Principle = SRP
//Loosly Coupled
//Factory Design Pattern = Responsible for creation of object of all pageObjects java classes

public LandingPageStepDefinition(TestContextSetUp testContextSetup) {
	this.testContextSetup=testContextSetup;
	this.landingPage = testContextSetup.pageObjectManager.getLandingPage();   // Calling page object manager from test context setup  
}


		@Given("User is on spicejet Landing page")
		public void user_is_on_spicejet_landing_page() {
			
			Assert.assertTrue(landingPage.getTitleLandingPage().contains("SpiceJet"));
		    
		}
		
		@When("User logs in with credentials")
		public void user_logs_in_with_credentials() throws IOException {
			
		     landingPage.logIn(Creds.getContactNo(), Creds.getPassWord());
		  
		}
		
		@When("User searches for desired location flights")
		public void user_searches_for_desired_location_flights() throws InterruptedException {
		     landingPage.selectingDesiredLocation();
		     landingPage.selectingDate();
		     landingPage.searchingFlights();
		     
		}
	
}
