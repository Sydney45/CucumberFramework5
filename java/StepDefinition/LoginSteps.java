package StepDefinition;

import org.openqa.selenium.WebDriver;
import DriverFactory.DriverFactory;
import PageObject.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {


//    public Login lg;
//    public WebDriver driver = DriverFactory.getDriver();
	
	WebDriver driver;
    Login lg;
    
    public LoginSteps()
    {
    	driver = DriverFactory.getDriver();
    }
    
	@Given("Launch chrome browser")
	public void launch_chrome_browser() throws InterruptedException {
	    
//		driver = new ChromeDriver();
		lg = new Login(driver);
		
//		String currentUrl = driver.getCurrentUrl();
//		Thread.sleep(3000);
//		System.out.println("currentpage url is = "+currentUrl);
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//	    wait.until(ExpectedConditions.urlMatches("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));
		
	}


	@When("User enter user id as {string} and password as {string}")
	public void user_enter_user_id_as_and_password_as(String user, String pwd) throws InterruptedException {
	    
		lg.enterUsername(user);
		Thread.sleep(2000);
		lg.enterPassword(pwd);
		Thread.sleep(2000);
	}	
	
	@When("User click on login button")
	public void user_click_on_login_button() {
		
		lg.clicklogin();
	    
	}

	@Then("PageTitle should be {string}")
	public void page_title_should_be(String expTitle) throws InterruptedException 
	{
		lg.pagetitle(expTitle); 
	}

	
	
}
