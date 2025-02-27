package WebPages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {

	String url = "https://www.daraz.com.bd/chairs/rfl/";
	WebDriver driver;

	@BeforeSuite
	public void startChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // Maximize the screen
	}

	@BeforeClass
	public void openUrl() {
		driver.get(url);
	}

	@Test(priority =0)
	public void sendKeys() throws InterruptedException {
		WebElement xpathLocator = driver.findElement(By.xpath("(//*[name()='svg'])[1]"));
		xpathLocator.click();
		Thread.sleep(500);
		
		driver.navigate().back();
		Thread.sleep(500);

		driver.navigate().forward();
		Thread.sleep(500);
		driver.navigate().back();
		Thread.sleep(500);

		driver.navigate().forward();
		Thread.sleep(500);
		driver.navigate().refresh();
		Thread.sleep(5000);

		
		
	}


	@AfterSuite
	public void closeChromeBrowser() {
		driver.quit();
	}

}