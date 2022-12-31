package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public LandingPage landingPage;
	public WebDriver driver;      //
	public SearchResultPage searchResultPage;
	
	public PageObjectManager(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public LandingPage getLandingPage() 
	{
		landingPage = new LandingPage(driver);
		return landingPage;
	}
	

	
	public SearchResultPage getSearchResultPage() 
	{
		searchResultPage = new SearchResultPage(driver);	
		return searchResultPage;
	}
}
