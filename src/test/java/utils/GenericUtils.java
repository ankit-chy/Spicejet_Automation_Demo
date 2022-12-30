package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	public WebDriver driver;
	
	public GenericUtils(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public void SwitchWindowToChild() 
	{
		Set<String> s1 =driver.getWindowHandles();            //Collection where no. of windows get stored in the from of windows id
		Iterator<String>i1 = s1.iterator();					  
		String parentWindow = i1.next();					  // Storing parent window index
		String childWindow = i1.next();					     // Storing child window index
		
		driver.switchTo().window(childWindow);			  // Switched to child window
	}
	
}
