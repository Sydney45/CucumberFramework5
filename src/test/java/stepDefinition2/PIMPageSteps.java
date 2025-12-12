package stepDefinition2;

import java.io.IOException;
import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import PageObject2.PIMPage;
import driverFactory2.DriverFactory2;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class PIMPageSteps {
	
	WebDriver driver;
	PIMPage pim;
	
	public PIMPageSteps()
	{
		driver = DriverFactory2.getDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
    
	@When("user clicks on PIM page")
	public void user_clicks_on_pim_page() throws InterruptedException {
		
		pim = new PIMPage(driver);
		pim.clickPim();
		Thread.sleep(2000);
	   
	}

	@When("user clicks on add new employee")
	public void user_clicks_on_add_new_employee() throws InterruptedException {
		
		pim.clickAdd();
		Thread.sleep(3000);
	    
	}

	@When("user enters {string},{string},{string}")
	public void user_enters(String fs, String md, String ls) throws InterruptedException {
		
		pim.firstName(fs);
		Thread.sleep(2000);
		pim.middleName(md);
		pim.lastName(ls);
		Thread.sleep(2000);
		pim.addID(RandomStringUtils.randomNumeric(5));
	   
	}

	@When("user clicks on add image")
	public void user_clicks_on_add_image() throws InterruptedException, IOException  {
		
		
		pim.addImage();
		Thread.sleep(3000);
	   
	}

	@Then("user clicks on save")
	public void user_clicks_on_save() throws InterruptedException  {
		
		
		pim.clickSave();
		Thread.sleep(3000);
	  
	}

}
