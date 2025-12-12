package StepDefinition;

import java.time.Duration;


import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DriverFactory.DriverFactory;
import PageObject.AddImmigration;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddImmigrationSteps {
	
	WebDriver driver;
	AddImmigration ai;
	
	public AddImmigrationSteps()
	{
		driver = DriverFactory.getDriver();
	}
	
	@When("user will click on Immgration page")
	public void user_clicks_on_immgration_page() throws InterruptedException {
	  
		ai = new AddImmigration(driver);
		Thread.sleep(3000);
		ai.ClickImmigration();
		Thread.sleep(2000);
		ai.ClickAdd();
		
	}

	@When("user enter passport number")
	public void user_enter_passport_number() throws InterruptedException {
		
		Thread.sleep(2000);
		ai.PassportNumber(RandomStringUtils.randomNumeric(10));
	   
	}

	@When("user enter issue date")
	public void user_enter_issue_date() throws InterruptedException {
		
		Thread.sleep(2000);
		ai.IssueDate();
	  
	}

	@When("user enter expiry date")
	public void user_enter_expiry_date() throws InterruptedException {
		
		Thread.sleep(2000);
		ai.ExpiryDate();
	    
	}

	@When("user enter eligible status")
	public void user_enter_eligible_status() throws InterruptedException {
		
		Thread.sleep(2000);
		ai.EligibleStatus();
	  
	}

	@When("user selects issued by")
	public void user_selects_issued_by() throws InterruptedException {
		
		Thread.sleep(2000);
		ai.IssuedBy();
	   
	}

	@When("user enter eligible review date")
	public void user_enter_eligible_review_date() throws InterruptedException {
		
		Thread.sleep(2000);
		ai.EligibleReviewDate();
	    
	}

	@When("user enter comment")
	public void user_enter_comment() throws InterruptedException {
		
		Thread.sleep(2000);
		ai.Comment(RandomStringUtils.randomAlphabetic(20));
	  
	}
	
	@Then("user click save")
	public void user_click_save() throws InterruptedException {
		
		Thread.sleep(3000);
		ai.ClickSave();
		System.out.println("Successfully saved");
		
	}

}
