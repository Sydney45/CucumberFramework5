package StepDefinition;

import org.openqa.selenium.WebDriver;

import DriverFactory.DriverFactory;
import PageObject.AddWorkWeekDetails;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddWorkWeekDetailsSteps {
	
	WebDriver driver;
	AddWorkWeekDetails awwd;
	
	public AddWorkWeekDetailsSteps()
	{
		driver = DriverFactory.getDriver();
	}
	
	@When("user click on Job page")
	public void user_click_on_job_page() throws InterruptedException {
		
		awwd = new AddWorkWeekDetails(driver);
		Thread.sleep(3000);
		awwd.ClickJob();
	}

	@When("user enters joined date")
	public void user_enters_joined_date() throws InterruptedException {
		
		Thread.sleep(2000);
		awwd.JoinedDate();
	
	}

	@When("user enter job title")
	public void user_enter_job_title() throws InterruptedException {
		
		Thread.sleep(3000);
		awwd.JobTitle();
	   
	}

	@When("user enters job category")
	public void user_enters_job_category() throws InterruptedException {
		
		Thread.sleep(3000);
		awwd.JobCategory();
	  
	}

	@When("user enters sub unit")
	public void user_enters_sub_unit() throws InterruptedException {
		
		Thread.sleep(3000);
		awwd.SubUnit();
	  
	}

	@When("user enters location")
	public void user_enters_location() throws InterruptedException {
		
		Thread.sleep(3000);
		awwd.AddLocation();

	}

	@When("user enters Employement Status")
	public void user_enters_employement_status() throws InterruptedException {
		
		Thread.sleep(3000);
		awwd.EmploymentStatus();

	}

	@When("user selects contract details")
	public void user_selects_contract_details() throws InterruptedException {
		
		Thread.sleep(3000);
		awwd.EnableContractDetails();
	   
	}
	
	@Then("user will clicks on save")
	public void user_clicks_on_save() throws InterruptedException {
		
		Thread.sleep(3000);
		awwd.ClickSave();
		System.out.println("Successfully saved");
	}
	
	

}
