package myHooks2;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import configsReader.ConfigsReader;
import driverFactory2.DriverFactory2;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;



public class MyHooks2 {
	
	DriverFactory2 df;
    WebDriver driver;
//	private Properties properties;
	
	@Before
	public void setup() throws InterruptedException
	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dsouz\\eclipse-workspace\\CucumberFramework5\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = DriverFactory2.initializeDriver();
		ConfigsReader.readProperties("src/main/resources/configs.properties");
//		df = new DriverFactory2();
//		DriverFactory2.driver = df.initializeDriver();
		Thread.sleep(3000);
		DriverFactory2.driver.get(ConfigsReader.getProperty("url"));
//		driver.get(ConfigsReader.getProperty("url"));
		
	    Thread.sleep(3000);

		
	}


	@AfterStep
	public void takeScreenshot(Scenario scenario)
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
	    final byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
	    scenario.attach(screenshot, "img/png", scenario.getName());
	    
	}
	
	@After
	public void tearDown()
	{
		DriverFactory2.quitDriver();
	}
	
}
