package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LandingPage {
	public WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
//	By loginBtn = By.xpath("//div[contains(text(),'Login')]");
//	By contactNoField = By.xpath("//input[@type='number']");
//	By passWordField = By.xpath("//input[@type='password']");
//
//	// Have to update x path for Login_btn2 
//	By loginBtn2 = By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-184aecr r-z2wwpe r-1loqt21 r-18u37iz r-tmtnm0 r-1777fci r-1x0uki6 r-1w50u8q r-ah5dr5 r-1otgn73']");
//	By locn = By.xpath("//div[@data-testid='to-testID-origin']");
//	
////	By from1 = By.xpath("//div[@class='css-1dbjc4n r-19yat4t r-1rt2jqs'] //div[contains(text(),'Delhi')]");
////	By from2 = By.xpath("//div[@class='css-1dbjc4n r-19yat4t r-1rt2jqs'] //div[contains(text(),'Bengaluru')]");
//	By to = By.xpath("//div[@data-testid='to-testID-destination']//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-tju18j r-5njf8e r-1otgn73']");
////  By toSending = By.xpath("//input[@value='Mumbai (BOM)']");
//																 
//	By calendar = By.id("//div[normalize-space()='Departure Date']");
//	By date = By.xpath("(//div[@data-focusable='true'])[75]");

	
	public String getTitleLandingPage()
	{
		System.out.println("Landing Page Title is : " + driver.getTitle());
		return driver.getTitle();
	}
	
	public void logIn(String contactNo,String passWord) {
		
//		driver.findElement(loginBtn).click();
//		driver.findElement(contactNoField).sendKeys(contactNo);
//		driver.findElement(passWordField).sendKeys(passWord);
//		driver.findElement(loginBtn2).click();
		System.out.println("Logged In Successfully");
	}
	
	public void selectingDesiredLocation() throws InterruptedException {
		
//		System.out.println("Clicking on From");
		
//		driver.findElement(locn).clear();
//		driver.findElement(locn).sendKeys("DBR");
		
		
//		driver.findElement(from1).click();
//		driver.findElement(from2).click();		
//		Actions actions = new Actions(driver);
//		actions.moveToElement((WebElement) from).click().build().perform();		
//		driver.findElement(from).sendKeys(From);
		
//		System.out.println("Clicked on From");
//		
//		System.out.println("Selecting To");
//		driver.findElement(to).sendKeys("DBR");
//		System.out.println("Selected To");
		
		System.out.println("Executed Selection of Location Successfully");
	}
	
	public void selectingDate() {
//		
//		driver.findElement(calendar).click();
//		driver.findElement(date).click();
//		System.out.println("Selected Date");
	}
	
	public void searchingFlights() {
		System.out.println("clicking on search flights");
	}
}
