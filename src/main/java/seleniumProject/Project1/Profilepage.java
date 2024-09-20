package seleniumProject.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profilepage 
{
	WebDriver driver;
	
	@FindBy(xpath="(//span[@class='a-declarative'])/button")
	WebElement editpr;
	@FindBy(linkText="View")
	WebElement viewlink;
	@FindBy(id="editProfileNameInputId")
	WebElement editname;
	@FindBy(xpath="(//input[@class='a-button-input'])[5])")
	WebElement cntbtn;
	@FindBy(xpath="(//h3[@class='accordion-header'])[3]")
	WebElement agebtn;
	@FindBy(xpath="//button[.='Add']")
	WebElement addbtn;
	@FindBy(xpath="//button[.='30-34']")
	WebElement age;
	
	public void editicon()
	{
		editpr.click();
	}
	
	public void viewLink()
	{
		viewlink.click();
	}
	
	public void editName()
	{
		String s1="Bhavani";
		editname.sendKeys(s1+"R");
	}
	
	public void continuebtn()
	{
		cntbtn.click();
	}
	
	public void age()
	{
		agebtn.click();
	}
	
	public void ageadd()
	{
		addbtn.click();
	}
	
	public void selectage()
	{
		age.click();
	}
	
	public Profilepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
