package seleniumProject.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	WebDriver driver;
	
	@FindBy(xpath="//span[.='Hello, sign in']")
	WebElement AccountAndlist;
	
	@FindBy(linkText="Start here.")
	WebElement starthere;
	
	@FindBy(xpath="(//span[.='Sign in'])[1]")
	WebElement SignIn;
	
	@FindBy(id="ap_email")
	WebElement usrname;
	
	@FindBy(id="continue")
	WebElement cntbtn;
	
	@FindBy(id="ap_password")
	WebElement pasword;
	
	@FindBy(id="signInSubmit")
	WebElement psigninbt;
	
	@FindBy(xpath="//button[.='Manage Profiles']")
	WebElement managepflbtn;
	
	@FindBy(xpath="//span[.='Hello, Bhavani']")
	WebElement userprofile;
	
	
	public void account(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(AccountAndlist).perform();
		
	}
	
	public void accountandstartHere()
	{
		
		starthere.click();
	}
	
	public void accountandsign()
	{

		SignIn.click();
	}
	
	public void manageprofile()
	{

		managepflbtn.click();
	}
	
	public void useraccount(WebDriver driver)
	{
		Actions a2=new Actions(driver);
		a2.moveToElement(userprofile).perform();
		
	}
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	

}
