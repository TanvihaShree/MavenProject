package seleniumProject.Project1;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Testcase2 extends LoginandQuit
{
	@Test
	public void loginSucc()
	{
		Homepage page=new Homepage(driver);
		page.account(driver);
		page.accountandsign();
		Assert.assertEquals(driver.getTitle(), "Amazon Sign In");
		Loginpage login=new Loginpage(driver);
		login.username();
		login.continuebt();
		login.password();
		login.psignIn();
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		
	}

}
