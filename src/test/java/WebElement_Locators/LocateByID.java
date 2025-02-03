package WebElement_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class LocateByID extends BasicUrlOpen{
	@BeforeClass
	public void OpenUrl()
	{
		driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
	}
	@Test
	public void LocateById() throws InterruptedException
	{
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("zafrinchowdhury.045@gmail.com");
		Thread.sleep(100);
		
	}

}
