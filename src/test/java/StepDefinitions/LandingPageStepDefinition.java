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
import pageObjects.PageObjectManager;
import utils.TestContextSetUp;

public class LandingPageStepDefinition {
	
public WebDriver driver; 				 	// initialized the web-driver so it is now accessible throughout  the class
public String landingPageProductName;   	//  initialized product name for global use
public String offerPageProductName;	   		// initialized product name for global use
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

	@Given("User is on GreenKart Landing page")
	public void user_is_on_green_kart_landing_page() 
	{
		Assert.assertTrue(landingPage.getTitleLandingPage().contains("GreenKart"));
	}								
	
	@When("^User searched with shortname (.+) and captured actual name of product$")
	public void user_searched_with_shortname_and_captured_actual_name_of_product(String shortName) throws InterruptedException {
	 
		landingPage.searchItem(shortName);
		Thread.sleep(1000);
		testContextSetup.landingPageProductName = landingPage.getProductName().split("-")[0].trim();  // Extracting Tomato from Tomato - 1 kg displayed on the page
		System.out.println(testContextSetup.landingPageProductName + " is extracted from Homepage");
		
	}
	
	@When("Added {string} items of the selected product to cart")
	public void Added__items_of_the_selected_product_to_cart(String quantity) 
	{
		landingPage.incrementQuantity(Integer.parseInt(quantity));
		landingPage.addToCart();
	}

	
}
