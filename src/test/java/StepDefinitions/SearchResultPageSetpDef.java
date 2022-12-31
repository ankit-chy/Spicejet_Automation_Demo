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
import pageObjects.SearchResultPage;
import utils.TestContextSetUp;

public class SearchResultPageSetpDef {
	
public WebDriver driver; 				 	// initialized the web-driver so it is now accessible throughout  the class
TestContextSetUp testContextSetup;		   //Created variable/instance of test context setup from package utils 
PageObjectManager pageObjectManager;	  //Created variable/instance of Page Object Manager from package page object manager
SearchResultPage searchResultPage;


public SearchResultPageSetpDef(TestContextSetUp testContextSetup) {
	this.testContextSetup=testContextSetup;
	this.searchResultPage=testContextSetup.pageObjectManager.getSearchResultPage();
}


		@Then("User Checks the flight price")
		public void user_checks_the_flight_price() {
			
			searchResultPage.checkPrice();
		  
		}
		@Then("User LogsOut")
		public void user_logs_out() {
			
		     searchResultPage.logOut();
		  
		}


}
