package StepDefinition;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DriverFactory.DriverFactory;
import PageObject.AddEmployeePersonalDetails;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmpldetailsSteps {
	
	WebDriver driver;
	AddEmployeePersonalDetails aepd;
	
	public AddEmpldetailsSteps()
	{
		driver = DriverFactory.getDriver();
	}
	
	@Given("User enters employee name")
	public void user_enters_employee_name() throws InterruptedException {
	
		aepd = new AddEmployeePersonalDetails(driver);
		Thread.sleep(3000);
		aepd.ClickPim();
//		Thread.sleep(2000);
//	    aepd.ClickArrow();
	    Thread.sleep(2000);
		aepd.EnterPIMName(RandomStringUtils.randomAlphabetic(1));
		Thread.sleep(3000);
	}
	
	

	@When("User clicks on search")
	public void user_clicks_on_search() throws InterruptedException {
		
		aepd.ClickSearch();
		Thread.sleep(2000);

	}

	@When("User clicks on the searched user")
	public void user_clicks_on_personal_details() throws InterruptedException {
		
		aepd.SelectUser();
		Thread.sleep(2000);
	
	}

	@When("User enters driver liscense number")
	public void user_enters_driver_liscense_number() throws InterruptedException {
		
		aepd.DriverLIscenseNumber(RandomStringUtils.randomNumeric(10));
		Thread.sleep(2000);
	   
	}

	@When("User enter liscense expiry date")
	public void user_enter_liscense_expiry_date() throws InterruptedException {
		
		aepd.LiscenseExpiry();
		Thread.sleep(2000);
	}

	@When("User enter his nationality")
	public void user_emter_his_nationality() throws InterruptedException {
		
		aepd.Nationality();
		Thread.sleep(3000);
		
	}

	@When("User enters his maritial status")
	public void user_enters_his_maritial_status() throws InterruptedException {
		
		aepd.MaritialStatus();
		Thread.sleep(2000);
	}

	@When("User enter his date birth")
	public void user_enter_his_date_birth() throws InterruptedException {
		
		aepd.DateOfBirth();
		Thread.sleep(2000);
	}

	@When("User enter his gender")
	public void user_enter_his_gender() throws InterruptedException {
		
		aepd.Gender();
		Thread.sleep(2000);
		
	}

	@Then("User clicks on save")
	public void user_clicks_on_save() {
		
		aepd.ClickSave();
	    
	}
	

}
