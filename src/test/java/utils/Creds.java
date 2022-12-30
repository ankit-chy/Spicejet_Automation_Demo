package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Creds {

	public static Properties getProperties() throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties");
		Properties prop1 = new Properties();   // Can read file having .properties extension
		prop1.load(fis);					 	// accepts input stream file  ----> Now the prop has knowledge about properties file and all the content of it
		return prop1;
	}
	
	public static String getContactNo() throws IOException {
		return getProperties().getProperty("contactNo");
	}
	
	public static String getPassWord() throws IOException {
		return getProperties().getProperty("passWord");
	}
}