package seleniumProject.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage 
{
	WebDriver driver;
	@FindBy(id="ap_customer_name")
	WebElement name;
	@FindBy(id="ap_phone_number")
	WebElement phone;
	@FindBy(id="ap_password")
	WebElement psw;
	@FindBy(id="continue")
	WebElement vernumber;
	
	public void register()
	{
		name.sendKeys("bhavaninagesh78@gmail.com");
		phone.sendKeys("9740246629");
		psw.sendKeys("Tanvi@78");
		vernumber.click();
	}
	
	
	public RegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
