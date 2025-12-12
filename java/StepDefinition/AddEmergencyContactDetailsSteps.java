package StepDefinition;

import java.io.File;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DriverFactory.DriverFactory;
import PageObject.AddEmergencyContact;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmergencyContactDetailsSteps {
	
	WebDriver driver;
	AddEmergencyContact aec;
	
	public AddEmergencyContactDetailsSteps()
	{
		driver = DriverFactory.getDriver();
	}
	
	@When("user clicks on Emergency contact page")
	public void user_clicks_on_emergency_contact_page() throws InterruptedException {
		
	    aec = new AddEmergencyContact(driver);
	    Thread.sleep(3000);
		aec.EmergencyContactPage();
		Thread.sleep(2000);
        aec.ClickAdd();
	}

	@When("user enter the name")
	public void user_enter_his_name() throws InterruptedException {
		
		aec.EnterName(RandomStringUtils.randomAlphabetic(5));
		Thread.sleep(2000);
	   
	}

	@When("user enter his relationship details")
	public void user_enter_his_relationship_details() throws InterruptedException {
		
		aec.EnterRelationship("Not Married");
		Thread.sleep(2000);
	
	}

	@When("user enter his home telephone number")
	public void user_enter_his_home_telephone_number() throws InterruptedException {
		
		aec.HomeNumber(RandomStringUtils.randomNumeric(10));
		Thread.sleep(2000);
	}

	@When("user enter his phone number")
	public void user_enter_his_phone_number() throws InterruptedException {
		
		aec.MobileNumber(RandomStringUtils.randomNumeric(10));
		Thread.sleep(2000);
	 
	}

	@When("user enter his Work phone number")
	public void user_enter_his_work_phone_number() throws InterruptedException {
		
		aec.WorkNumber(RandomStringUtils.randomNumeric(10));
		Thread.sleep(2000);
	}
	
	@When("user has to click on save")
	public void user_clicks_on_save() {
		
	    aec.ClickSave();
	  
	}
	
	@Then("the Emergency contact is displayed on the page")
	public void the_emergency_contact_is_displayed_on_the_page() {
	   
		System.out.println("Emeregency contact is successfully saved");
	    
	    
	}



}
