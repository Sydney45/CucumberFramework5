package StepDefinition;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DriverFactory.DriverFactory;
import PageObject.AddDependent;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddDependentSteps {
	
	WebDriver driver;
	AddDependent ad;
	
	public AddDependentSteps()
	{
		driver = DriverFactory.getDriver();
	}
	
	@When("user clicks on Dependents page")
	public void user_clicks_on_dependents_page() throws InterruptedException {
	    
		ad = new AddDependent(driver);
		Thread.sleep(3000);
	    ad.AddDependency();
	    Thread.sleep(2000);
	    ad.clickAdd();	
		
	}
	
	@When("user enter his name")
	public void user_enter_his_name() throws InterruptedException {
		
		Thread.sleep(2000);
		ad.AddName(RandomStringUtils.randomAlphabetic(5));
	}

	@When("user enter his relationship")
	public void user_enter_his_relationship() throws InterruptedException {
		
		Thread.sleep(3000);
		ad.Relationship();
	    
	}

	@When("user enter his date of birth")
	public void user_enter_his_date_of_birth() throws InterruptedException {
		
		Thread.sleep(2000);
		ad.DateofBirth();
	}

	@Then("user clicks save")
	public void user_clicks_save() throws InterruptedException {
		
		Thread.sleep(2000);
		ad.ClickSave();
	    
	}

}
