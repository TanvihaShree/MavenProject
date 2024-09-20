package seleniumProject.Project1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 
{
	@Test()
	public void method()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/s?");
		driver.manage().window().maximize();
		WebElement serch=driver.findElement(By.id("twotabsearchtextbox"));
		serch.sendKeys("shoes");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//serch.sendKeys(Keys.ENTER);
	
		List<WebElement> lst= driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count =lst.size();
		System.out.println(count);
		lst.get(count-7).click();
	}

}
