package stepDefinition2;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import PageObject2.EmergencyContact;
import PageObject2.EmployeePersonalDetails;
import driverFactory2.DriverFactory2;
import excelUtility.ExcelReader2;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmergencyContactSteps {
	
	WebDriver driver;
	EmployeePersonalDetails epd;
	EmergencyContact ec;
	
	public EmergencyContactSteps()
	{
		driver = DriverFactory2.getDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@When("And User enters {string}")
	public void user_selects_the_user(String em) throws InterruptedException {
		
		 epd = new EmployeePersonalDetails(driver);
	     Thread.sleep(2000);
	     epd.enterEmployeeName(em);
	     Thread.sleep(2000);
	     epd.clickSearch();
	     epd.Username();
	  
	}
	
	@When("user clicks on emergency contact page")
	public void user_clicks_on_emergency_contact_page() throws InterruptedException {	
		
		 ec = new EmergencyContact(driver);
		 Thread.sleep(2000);
	     ec.emergencyContact();
		 Thread.sleep(2000);
		 ec.addEmeregencyContact();
		 Thread.sleep(3000);		
	}

	@When("user fills the data from excel")
	public void user_fills_the_data_from_excel() throws InterruptedException, EncryptedDocumentException, IOException {
		
		
		ExcelReader2 reader = new ExcelReader2();
		List<Map<String, String>> testdata;
		testdata = reader.getData("C:\\Users\\dsouz\\eclipse-workspace\\CucumberFramework5\\src\\test\\resources\\EmergencyContact.xlsx", "Sheet1");
		
		String name = testdata.get(0).get("Name");
		String relation = testdata.get(0).get("Relationship");
		String mobile = testdata.get(0).get("Mobile");
		
		ec.enterName(name);
		Thread.sleep(2000);
		ec.enterRelationship(relation);
		Thread.sleep(2000);
		ec.enterMobile(mobile);
		
		
	}

	@Then("it will show successful message")
	public void it_will_show_successful_message() throws InterruptedException {
	    
		ec.clickSave();
		Thread.sleep(2000);
		System.out.println("program is successful");
		
	}



}
