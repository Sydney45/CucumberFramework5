package StepDefinition;

import java.time.Duration;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DriverFactory.DriverFactory;
import PageObject.AddContactDetails;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddContactDetailsSteps {
	
	WebDriver driver;
	AddContactDetails acd;
	
	public AddContactDetailsSteps()
	{
		driver = DriverFactory.getDriver();
	}
	
	@When("user clicks on contact page")
	public void user_clicks_on_contact_page() throws InterruptedException {
	
		acd = new AddContactDetails(driver);
	    Thread.sleep(3000);
		acd.ClickContactPage();
	}
	
	@When("user enter street1")
	public void user_enter_street1() throws InterruptedException {
		
		Thread.sleep(2000);
		acd.EnterStreet1(RandomStringUtils.randomAlphabetic(7));
	
	}

	@When("user enter street2")
	public void user_enter_street2() throws InterruptedException {
		
		Thread.sleep(2000);
		acd.EnterStreet2(RandomStringUtils.randomAlphabetic(7));
	
	}


	@When("user enter city name")
	public void user_enter_city_name() throws InterruptedException  {
		
		Thread.sleep(2000);
		acd.EnterCity(RandomStringUtils.randomAlphabetic(5));
	   
	}

	@When("user enter state name")
	public void user_enter_state_name() throws InterruptedException{
		
		Thread.sleep(2000);
		acd.EnterState(RandomStringUtils.randomAlphabetic(5));
	   
	}
	
	@When("user enter zipcode")
	public void user_enter_zipcode() throws InterruptedException {
		
		Thread.sleep(2000);
		acd.EnterZipCode(RandomStringUtils.randomNumeric(5));
	   
	}


	@When("user enter country")
	public void user_enter_country() throws InterruptedException {
		
		Thread.sleep(2000);
		acd.EnterCountry();
	  
	}

	
	@When("user enter home phone number")
	public void user_enter_home_phone_number() throws InterruptedException {
		
		Thread.sleep(2000);
		acd.HomeNumber(RandomStringUtils.randomNumeric(9));
	}

	@When("user enter mobile number")
	public void user_enter_mobile_number() throws InterruptedException {
		
		Thread.sleep(2000);
		acd.MobileNumber(RandomStringUtils.randomNumeric(9));
	
	}

	@When("user enter work phone number")
	public void user_enter_work_phone_number() throws InterruptedException {
		
		Thread.sleep(2000);
		acd.WorkPhone(RandomStringUtils.randomNumeric(9));
	 
	}

	@When("user enter emaild id")
	public void user_enter_emaild_id() throws InterruptedException {
		
		Thread.sleep(2000);
		acd.EnterEmail(RandomStringUtils.randomAlphabetic(7)+"@gmail.com");
	   
	}

	@Then("user clicks on save")
	public void user_clicks_on_save() throws InterruptedException {
		
		Thread.sleep(2000);
		acd.ClickSave();
	  
	}



	
	

}
