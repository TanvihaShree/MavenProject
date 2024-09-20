package seleniumProject.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	WebDriver driver;
	@FindBy(id="ap_email")
	WebElement usrname;
	
	@FindBy(id="continue")
	WebElement cntbtn;
	
	@FindBy(id="ap_password")
	WebElement pasword;
	
	@FindBy(id="signInSubmit")
	WebElement psigninbt;
	
	
	public void username()
	{

		usrname.sendKeys("rbhavani432@gmail.com");
	}
	
	public void continuebt()
	{

		cntbtn.click();
	}
	
	public void password()
	{

		pasword.sendKeys("Tejas@78");
	}
	
	public void psignIn()
	{

		psigninbt.click();
	}
	
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
