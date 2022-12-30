package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	public WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By loginBtn = By.xpath("//div[contains(text(),'Login')]");
	By contactNoField = By.xpath("//input[@type='number']");
	By passWordField = By.xpath("//input[@type='password']");
	
	By loginBtn2 = By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-184aecr r-z2wwpe r-1loqt21 r-18u37iz r-tmtnm0 r-1777fci r-1x0uki6 r-1w50u8q r-ah5dr5 r-1otgn73']");
	
	
//	By search = By.xpath("//input[@type='search']");
//	By productName = By.cssSelector("h4.product-name");
//	By topDeals =  By.linkText("Top Deals");
//	By increment = By.cssSelector("a.increment");
//	By addToCart = By.cssSelector(".product-action button");
	
	public String getTitleLandingPage()
	{
		return driver.getTitle();
	}
	
	public void logIn(String contactNo,String passWord) {
		
		driver.findElement(loginBtn).click();
		driver.findElement(contactNoField).sendKeys(contactNo);
		driver.findElement(passWordField).sendKeys(passWord);
		driver.findElement(loginBtn2).click();
	}
	
	
	
	
	
//	public void searchItem(String name) {	
//		driver.findElement(search).sendKeys(name);  // Sending tom in search box
//	}
//	
//	public void getSearchText() {	
//		driver.findElement(search).getText(); 
//	}
//	
//	public void incrementQuantity(int quantity)
//	{
//		int i = quantity-1;
//		while(i>0)
//		{
//			driver.findElement(increment).click();
//			i--;
//		}
//	}
//	
//	public void addToCart() 
//	{
//		driver.findElement(addToCart).click();
//	}
//	
//	public String getProductName() {
//		return driver.findElement(productName).getText();
//	}
//	
//	public void selectTopDealsPage() {
//		driver.findElement(topDeals).click();	
//	}

}
