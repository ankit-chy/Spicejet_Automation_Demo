package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage {
	
	public WebDriver driver;
	public SearchResultPage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	By lowestPrice = By.xpath("//*[@id=\"list-results-section-0\"]/div[2]/div/div/div[5]");
	By profile = By.cssSelector(".css-1dbjc4n.r-1jkjb");
	By logOut = By.xpath("//div[contains(text(),'Log Out')]");
	
	public void checkPrice() {
		
		 driver.findElement(lowestPrice).getText();
	
	}
	
	public void logOut() {
		
		driver.findElement(profile).click();
		driver.findElement(logOut).click();
		System.out.println("User Logged Out Successfully");
		
	}


}
