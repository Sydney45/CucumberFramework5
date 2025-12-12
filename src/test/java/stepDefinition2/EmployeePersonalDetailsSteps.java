package stepDefinition2;

import java.time.Duration;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import PageObject2.EmployeePersonalDetails;
import driverFactory2.DriverFactory2;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeePersonalDetailsSteps {
	
	WebDriver driver;
	EmployeePersonalDetails epd;
	
	public EmployeePersonalDetailsSteps()
	{
		driver = DriverFactory2.getDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@When("User enters {string}")
	public void user_enters(String en) throws InterruptedException {
	    
		 epd = new EmployeePersonalDetails(driver); 
		 epd.enterEmployeeName(en);
		 Thread.sleep(2000);
		
	}

	@When("User clicks on search")
	public void user_clicks_on_search() throws InterruptedException {
		
		epd.clickSearch();
	    Thread.sleep(2000);
	}

	
	@When("User clicks on the searched user")
	public void user_clicks_on_the_searched_user() throws InterruptedException {
		
		epd.Username();
		Thread.sleep(2000);
	
	}
	
	@When("User enter following user details")
	public void user_enter_following_user_details(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    
//		List<List<String>> userlist = dataTable.asLists(String.class);
//		for(List<String>e:userlist)
//		{
//			System.out.println(e);
//		}
		
//		for(Map<String, String> user : userList)
//		{
//			
//		}
		
		List<Map<String, String>> userList = dataTable.asMaps(String.class, String.class);
		
		String liscense = userList.get(0).get("Liscense Number");
		
		String lisexp = userList.get(0).get("Liscense Expiry");
		
		String dob = userList.get(0).get("Date of Birth");		
		
//		System.out.println(userList);	
		
		epd.liscenseNumber(liscense);
		Thread.sleep(2000);
		epd.enterLiscenseExpiry(lisexp);
		Thread.sleep(2000);
		epd.enterDateOfBirth(dob);
		Thread.sleep(2000);
		
	}

	@When("User enter his nationality")
	public void user_enter_his_nationality() throws InterruptedException {
		
		epd.Nationality();
		Thread.sleep(2000);
	
	}

	@When("User enters his maritial status")
	public void user_enters_his_maritial_status() throws InterruptedException {
		
		epd.martialStatus();
		Thread.sleep(2000);
	    
	}

	@When("User enter his gender")
	public void user_enter_his_gender() throws InterruptedException {
		
		epd.Gender();
		Thread.sleep(2000);
	   
	}

	@Then("User clicks on save")
	public void user_clicks_on_save() throws InterruptedException {
		
		epd.clickSave();
		Thread.sleep(2000);
	  
	}

}
