package seleniumProject.Project1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 extends LoginandQuit
{
@Test
public void registernewuser()
{
	Homepage home=new Homepage(driver);
	home.account(driver);
	Assert.assertEquals(driver.getTitle(), "Amazon Registration");
	RegistrationPage register=new RegistrationPage(driver);
	register.register();
	
}

}
