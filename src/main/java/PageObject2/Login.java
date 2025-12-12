package PageObject2;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	WebDriver driver;
	
	public Login(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='username']")
	WebElement user;

	@FindBy(xpath = "//input[@name='password']")
	WebElement pwd;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;

	public void addUser(String usr) throws InterruptedException {

		user.sendKeys(usr);
		Thread.sleep(2000);

	}

	public void addPassword(String pd) {
		
		pwd.sendKeys(pd);
	}

	public void clickSubmit() {
		submit.click();
		
	}

	public void pageTitle(String expTitle) {
		String actualTitle = driver.getTitle();
		if (actualTitle.equals(expTitle)) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is not correct");
		}
		
		
	}



}
