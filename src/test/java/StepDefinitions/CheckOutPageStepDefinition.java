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
import pageObjects.CheckOutPage;
import pageObjects.LandingPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetUp;

public class CheckOutPageStepDefinition {
	
public WebDriver driver; 				 	// initialized the web-driver so it is now accessible throughout  the class
public CheckOutPage checkOutPage;
TestContextSetUp testContextSetup;		   //Created variable/instance of test context setup from package utils 
PageObjectManager pageObjectManager;	  //Created variable/instance of Page Object Manager from package page object manager
 

public CheckOutPageStepDefinition(TestContextSetUp testContextSetup) {
	this.testContextSetup=testContextSetup;
	this.checkOutPage = testContextSetup.pageObjectManager.getCheckOutPage(); 	 
}

@Then("User proceeds to Checkout and validate Tom item in checkout page")
public void user_proceeds_to_checkout_and_validate_tom_item_in_checkout_page() 
{
	checkOutPage.CheckOutItems();
}

@And("verify if user is able to enter promo code and place the order")
public void verify_if_user_is_able_to_enter_promo_code_and_place_the_order() 
{
	Assert.assertTrue(checkOutPage.VerifyPromoBtn());
	Assert.assertTrue(checkOutPage.VerifyPlaceOrder());
}
	
}
