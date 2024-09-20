package seleniumProject.Project1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase3 extends LoginandQuit
{
	@Test
	public void editprofile()
	{
		Homepage page=new Homepage(driver);
		page.account(driver);
		page.accountandsign();
		Assert.assertEquals(driver.getTitle(), "Amazon Sign In");
		Loginpage page1=new Loginpage(driver);
		page1.username();
		page1.continuebt();
		page1.password();
		page1.psignIn();
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		page.useraccount(driver);
		page.manageprofile();
		Profilepage page3=new Profilepage(driver);
		page3.editicon();
		page3.viewLink();
		page3.editName();
		page3.continuebtn();
		page3.age();
		page3.ageadd();
		page3.selectage();
		
		
	}

}
