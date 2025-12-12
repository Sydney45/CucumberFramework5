package PageObject2;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMPage {
	
	WebDriver driver;
	
	public PIMPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']")
	WebElement pim;
	
	@FindBy(xpath = "//button[normalize-space()='Add']")
	WebElement add;
	
	@FindBy(xpath = "//input[@name='firstName']")
	WebElement fsname;
	
	@FindBy(xpath = "//input[@name='middleName']")
	WebElement mdname;
	
	@FindBy(xpath = "//input[@name='lastName']")
	WebElement lsname;
	
	@FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")
	WebElement userid;
	
	@FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/div/button/i")
	WebElement addimg;
	
	@FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")
	WebElement save;
	
	
	public void clickPim()
	{
		pim.click();
	}
	
	public void clickAdd()
	{
		add.click();
	}
	
	public void firstName(String fs)
	{
		fsname.sendKeys(fs);
	}
	
	public void middleName(String md)
	{
		mdname.sendKeys(md);
	}
	
	public void lastName(String ls)
	{
		lsname.sendKeys(ls);
	}
	
	public void addID(String id) throws InterruptedException
	{
		userid.clear();
		Thread.sleep(2000);
		userid.sendKeys(id);
	}
	
	public void addImage() throws InterruptedException, IOException
	{
		addimg.click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C://Users//dsouz//Downloads//pandanew.exe");
	}
	
	public void clickSave() throws InterruptedException
	{
		save.click();
		Thread.sleep(3000);
	}
	
	

}
