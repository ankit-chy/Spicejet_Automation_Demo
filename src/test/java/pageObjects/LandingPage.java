package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
	public WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
		By loginBtn = By.xpath("//div[contains(text(),'Login')]");
		By contactNoField = By.xpath("//input[@type='number']");
		By passWordField = By.xpath("//input[@type='password']");
		By loginBtn2 = By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-184aecr r-z2wwpe r-1loqt21 r-18u37iz r-tmtnm0 r-1777fci r-1x0uki6 r-1w50u8q r-ah5dr5 r-1otgn73']");
		By from = By.xpath("//div[contains(text(),'From')]");
		By from2 = By.cssSelector("div[data-testid='to-testID-origin'] input[type='text']");
//		By from2 = By.xpath("//div[@data-testid='to-testID-origin']//input[@type='text']);
		By to = By.xpath("//div[contains(text(),'To')]");
		By to2 = By.cssSelector("div[data-testid='to-testID-destination'] input[type='text']");
		
		
		
	
	public String getTitleLandingPage()
	{
		System.out.println("Landing Page Title is : " + driver.getTitle());
		return driver.getTitle();
	}
	
	public void logIn(String contactNo,String passWord) {
		
		driver.findElement(loginBtn).click();
		driver.findElement(contactNoField).sendKeys(contactNo);
		driver.findElement(passWordField).sendKeys(passWord);
		driver.findElement(loginBtn2).click();
		System.out.println("Logged In Successfully");
	}
	
	public void selectingDesiredLocation(String fromCity, String toCity) throws InterruptedException {
		
// 			--------- Selecting From City  --------------   
		
		System.out.println("Clicking on From");		
		WebElement fromBtn = driver.findElement(from);
		//Using Action class to click on From Button
		Actions action = new Actions(driver);
		action.moveToElement(fromBtn).click().build().perform();
		driver.findElement(from2).sendKeys(fromCity);	
		System.out.println("Selected from city as: " + fromCity + " successfully");
		
//			--------- Selecting To City  -------------- 
		
		System.out.println("Clicking on To");
		WebElement toBtn = driver.findElement(to);
		//Using Action class to click on From Button
		Actions actionTo = new Actions(driver);
		actionTo.moveToElement(toBtn).click().build().perform();
		driver.findElement(to2).sendKeys(toCity);
		System.out.println("Selected to city as: " + toCity + " successfully");
		
	}
	
	public void selectingDate() {
		System.out.println("Selecting Date");
//		driver.findElement();
	}
	
	public void searchingFlights() {
		System.out.println("clicking on search flights");
	}
}
