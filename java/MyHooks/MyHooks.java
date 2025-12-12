package MyHooks;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import DriverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MyHooks {
	
	WebDriver driver;
	
	@Before
	public void setup() throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\dsouz\\eclipse-workspace\\CucumberFramework4\\chromedriver-win64\\chromedriver.exe");
		 WebDriverManager.chromedriver().setup();
		 driver = DriverFactory.initializeDriver();
//		 driver = DriverFactory.getDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(3000);	 
		 
	}
	
	@AfterStep
	public void addScreenshot(Scenario scenario)
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		final byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", scenario.getName());
		
	}
	
	@After
	public void tearDown()
	{
//		if(driver!=null)
//		{
//			driver.quit();
//		}
		DriverFactory.quitDriver();
		
	}
	


//	public static WebDriver getDriver() {
//		
//		return null;
//	}
//	
	

}
