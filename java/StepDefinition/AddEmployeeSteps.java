package StepDefinition;

import java.io.IOException;
import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DriverFactory.DriverFactory;
import PageObject.AddNewEmployeePIM;
import io.cucumber.java.en.When;

public class AddEmployeeSteps {
	
	WebDriver driver;
	AddNewEmployeePIM AddEmp;
	
	public AddEmployeeSteps()
	{
		driver = DriverFactory.getDriver();
	}
	
	
	@When("User clicks on PIM page")
	public void the_user_clicks_on_pim_page() throws InterruptedException {
	 
//		driver = new ChromeDriver();
		AddEmp = new AddNewEmployeePIM(driver);
		Thread.sleep(3000);
		AddEmp.pimpage();
	}

	@When("User navigates to AddEmployee page")
	public void the_user_navigates_to_add_employee_page() throws InterruptedException {
		
		Thread.sleep(3000);
		AddEmp.addEmployee();
		
	}

	@When("User enters employee first name middle name and last name")
	public void user_enters_employee_first_name_middle_name_and_last_name() throws InterruptedException {
		
		Thread.sleep(3000);
		AddEmp.firstname(RandomStringUtils.randomAlphabetic(5));
		AddEmp.middlename(RandomStringUtils.randomAlphabetic(5));
		AddEmp.lastname(RandomStringUtils.randomAlphabetic(5));
	    Thread.sleep(2000);
	}

	@When("User select his image")
	public void user_select_his_image() throws IOException, InterruptedException {
		
		AddEmp.addImage();
		Thread.sleep(5000);
	   
	}

	@When("User clicks on save button")
	public void user_clicks_on_save_button() throws InterruptedException {
		
		
		AddEmp.clicksave();
		Thread.sleep(3000);
		System.out.println("Successfully added");
	    
	}

}
