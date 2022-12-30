package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {
	
	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException 
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties");
		Properties prop = new Properties();   // Can read file having .properties extension
		prop.load(fis);					 	// accepts input stream file  ----> Now the prop has knowledge about properties file and all the content of it
		
		String url = prop.getProperty("DemoURL");
		String browser_properties = prop.getProperty("browser");	
		String browser_maven = System.getProperty("browser");
		
		String browser = browser_maven!= null ? browser_maven : browser_properties;
		
		if(driver == null) 
		{	
			if(browser.equalsIgnoreCase("chrome"))
			{	
				//System.setProperty("webdriver.chrome.driver" , System.getProperty("user.dir")+"\\src\\test\\resources\\chromedriver.exe");
				driver = new ChromeDriver();  // driver gets the life
				
				driver.manage().window().maximize();
			} else if(browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver" , System.getProperty("user.dir")+"\\src\\test\\resources\\msedge.exe");
				driver = new EdgeDriver();
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(url);
		}
		return driver;
	}

}
