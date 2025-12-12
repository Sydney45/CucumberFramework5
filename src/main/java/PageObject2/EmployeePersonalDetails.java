package PageObject2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeePersonalDetails {
	
	   WebDriver driver;
	
	   public EmployeePersonalDetails(WebDriver driver)
	   {
		  this.driver = driver;
		  PageFactory.initElements(driver, this);
		   
	   }
	
	   
	   @FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")
	   WebElement emp;
	   
	   @FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")
	   WebElement search;
	   
	   @FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div")
	   WebElement user; 
       
       @FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input")
       WebElement liscense;
       
       @FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input")
       WebElement lisexp;
       
       @FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[1]")
       WebElement national;
       
       @FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div/div[1]")
       WebElement martial;
       
       @FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/input")
       WebElement dob;
       
       @FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/label/span")
       WebElement gen;
       
       @FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button")
       WebElement save;
  
       

	   public void enterEmployeeName(String em) throws InterruptedException
       {
		   emp.clear();
    	   emp.sendKeys(em);
    	   emp.sendKeys(Keys.ARROW_DOWN);
    	   Thread.sleep(2000);
    	   emp.sendKeys(Keys.ENTER);
   
       }
       
       public void clickSearch() throws InterruptedException
       {
    	   search.click();
    	   Thread.sleep(2000);
       }
       
       public void Username()
       {
    	   user.click();
       }
       
       public void liscenseNumber(String ln)
       {
    	   liscense.sendKeys(ln);
       }
       
       public void enterLiscenseExpiry(String le) throws InterruptedException
       {
    	   Thread.sleep(2000);
    	   lisexp.sendKeys(le);
    	   
       }
       
       public void Nationality() throws InterruptedException
       {
    	   national.click();
    	   national.sendKeys(Keys.chord("i"));
    	   national.sendKeys(Keys.ARROW_DOWN);
    	   national.sendKeys(Keys.ARROW_DOWN);
    	   national.sendKeys(Keys.ENTER);
    	   Thread.sleep(2000);
       }
       
       public void martialStatus() throws InterruptedException
       {
    	   martial.click();
//    	   martial.sendKeys(Keys.chord("s"));
    	   martial.sendKeys(Keys.ARROW_DOWN);
    	   martial.sendKeys(Keys.ENTER);
    	   Thread.sleep(2000);
       }
       
       public void enterDateOfBirth(String db) throws InterruptedException
       {
    	   dob.clear();
    	   Thread.sleep(2000);
    	   dob.sendKeys(db);
       }
       
       public void Gender() throws InterruptedException
       {
    	   gen.click();
    	   Thread.sleep(2000);
       }
       
       public void clickSave() throws InterruptedException
       {
    	   save.click();
    	   Thread.sleep(2000);
       }
       
       
       
}
