package WebElement_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class LocateByClassName extends BasicUrlOpen{
	@BeforeClass
	public void OpenUrl()
	{
		driver.get("https://www.daraz.com.bd/#?");
	}
	@Test
	public void LocateById() throws InterruptedException
	{
		WebElement email1 = driver.findElement(By.className("white"));
		email1.click();
		WebElement email = driver.findElement(By.className("iweb-input"));
		email.sendKeys("zafrinchowdhury.045@gmail.com");
		Thread.sleep(100);
		
	}

}
