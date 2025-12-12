package DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	
	 private static WebDriver driver;
	 
//	 initialize driver
	 
	 public static WebDriver initializeDriver()
	 {
		 if(driver==null)
		 {
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
		 }
		 return driver;
	 }
	 
//	 return existing driver
	 
	 public static WebDriver getDriver()
	 {
		 return driver;
	 }
	 
//	 clean up driver
	 
	 public static void quitDriver()
	 {
		 if(driver!=null)
		 {
			 driver.quit();
			 driver=null;
		 }
	 }

}
