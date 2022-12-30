package StepDefinitions;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetUp;

public class SearchResultPageSetpDef {
	
public WebDriver driver; 				 	// initialized the web-driver so it is now accessible throughout  the class
public String landingPageProductName;   	//  initialized product name for global use
public String offerPageProductName;	   		// initialized product name for global use
TestContextSetUp testContextSetup;		   //Created variable/instance of test context setup from package utils 
PageObjectManager pageObjectManager;	  //Created variable/instance of Page Object Manager from package page object manager
LandingPage landingPage; 

//Single Responsibility Principle = SRP
//Loosly Coupled
//Factory Design Pattern = Responsible for creation of object of all pageObjects java classes

public SearchResultPageSetpDef(TestContextSetUp testContextSetup) {
	this.testContextSetup=testContextSetup;
	this.landingPage = testContextSetup.pageObjectManager.getLandingPage();   // Calling page object manager from test context setup  
}


		@Then("User Checks the flight price")
		public void user_checks_the_flight_price() {
		     
		  
		}
		@Then("User LogsOut")
		public void user_logs_out() {
		     
		  
		}


}
