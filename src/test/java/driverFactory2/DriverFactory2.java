package driverFactory2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory2 {

	public static WebDriver driver;
	
	public static WebDriver initializeDriver()
	{
		if(driver==null)
		{
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
//			ConfigsReader.loadProperties("src/main/resources/configs.properties");  
		}
		return driver;
		
	}
	
	public static WebDriver getDriver()
	{
		return driver;	
	}
	
	public static void quitDriver()
	{
		if(driver!=null)
		{
			driver.quit();
			driver=null;
		}
	}


}
