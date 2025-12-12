package PageObject2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmergencyContact {
	
	WebDriver driver;
	
	public EmergencyContact(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[normalize-space()='Emergency Contacts']")
    WebElement contacts;
	
	@FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/button")
	WebElement add;
	
	@FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input")
	WebElement name;
	
	@FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input")
	WebElement relation;
	
	@FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/input")
	WebElement mobile;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement save;
	
	public void emergencyContact() throws InterruptedException
	{
		Thread.sleep(2000);
		contacts.click();
	}
	
	public void addEmeregencyContact()
	{
		add.click();
	}
	
	public void enterName(String nm)
	{
		name.sendKeys(nm);
	}
	
	public void enterRelationship(String re)
	{
		relation.sendKeys(re);
	}
	
	public void enterMobile(String mo)
	{
		mobile.sendKeys(mo);
	}
	
	public void clickSave()
	{
		save.click();
	}
	
	
}
