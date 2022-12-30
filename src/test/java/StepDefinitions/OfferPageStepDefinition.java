package StepDefinitions;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetUp;

public class OfferPageStepDefinition {
	
public String offerPageProductName;	   // initialized product name for global use
TestContextSetUp testContextSetup;
PageObjectManager pageObjectManager;

//Single Responsibility Principle = SRP
//Loosly Coupled

	public OfferPageStepDefinition(TestContextSetUp testContextSetup) {
		this.testContextSetup=testContextSetup;
	}
	
	@Then("^User searched for (.+) shortname in offers page$")
	public void user_searched_for_same_shortname_in_offers_page(String shortName)  {
		
		switchToOffersPage();
		OffersPage offersPage = testContextSetup.pageObjectManager.getOfferspage(); 
		//OffersPage offersPage = new OffersPage(testContextSetup.driver);
		offersPage.searchItem(shortName);  // Sending tom in search box
		//Thread.sleep(2000);
		offerPageProductName =offersPage.getProductName();	// Extracting Tomato from offers page 

	}
	
	public void switchToOffersPage() {
		
		LandingPage landingPage = testContextSetup.pageObjectManager.getLandingPage();
		landingPage.selectTopDealsPage();									//Clicking on Top deals
		
		testContextSetup.genericUtils.SwitchWindowToChild();
		
	}
	
	@And ("validate if product name in offers page matches with Landing page")
	public void validate_if_product_name_in_offers_page_matches_with_Landing_page() {
		
		Assert.assertEquals(offerPageProductName , testContextSetup.landingPageProductName);
		
	}


}
