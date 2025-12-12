package stepDefinition2;

import org.openqa.selenium.WebDriver;

import PageObject2.Login;
import driverFactory2.DriverFactory2;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login2Steps extends DriverFactory2  {
	
	private WebDriver driver;
	private Login lg;
	
	public Login2Steps()
	{
		driver = DriverFactory2.getDriver();
		
	}
	
	@Given("Launch chrome browser")
	public void launch_chrome_browser() throws InterruptedException {
	   
		lg = new Login(driver);
		Thread.sleep(3000);
			   
	}

	@When("User enter user id as {string} and password as {string}")
	public void user_enter_user_id_as_and_password_as(String user, String pwd) throws InterruptedException {
		
		
		lg.addUser(user);
		lg.addPassword(pwd);
		
		
    
		
//		List<List<String>> userList = dataTable.asLists(String.class);
//		for(List<String> e:userList)
//		{
//			System.out.println(e);
//		}
	
		
	}
	
	
	@When("User click on login button")
	public void user_click_on_login_button() {
		
		lg.clickSubmit();
	    
	}

	@Then("PageTitle should be {string}")
	public void page_title_should_be(String title) throws InterruptedException {
		
		lg.pageTitle(title);
		Thread.sleep(3000);
//		WebElement error = driver.findElement(By.xpath("//div[@class='oxd-alert-content oxd-alert-content--error']"));
//		if(error.isDisplayed())
//		{
//			System.out.println("Orange hrm not logged in");
//		}
	   
	}

     

}
