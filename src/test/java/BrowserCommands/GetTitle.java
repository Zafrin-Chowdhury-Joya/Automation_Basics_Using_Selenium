package BrowserCommands;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitle {
			protected static String url = "https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php";
			String browserName= System.getProperty("browser","chrome");
			WebDriver driver;
			
			
			@BeforeSuite
			public void CrossBrowser()
			{
			if (browserName.equals("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver =new ChromeDriver();
				driver.manage().window().maximize();
			}
				
			else if  (browserName.equals("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver =new FirefoxDriver();
				driver.manage().window().maximize();
			}	
			else 
			{
				WebDriverManager.edgedriver().setup();
				driver =new EdgeDriver();
				driver.manage().window().maximize();
				
			}
			
		}
		  
		  @Test(priority=0)
		  public void OpenUrl() throws InterruptedException
		  {
			  driver.get(url);
			  Thread.sleep(400);
		  }
		  @Test(priority=1)
		  public void compareTitle()
		  {
			  String ActualTitle = driver.getTitle();
			  String ExpectedTitle = "Selenium Practice - Student Registration Form";
			  if (ActualTitle.equals(ExpectedTitle))
			  {
				 System.out.println("Right URl is : " + ActualTitle);
			  }
			  else 
			  {
				  System.out.println("URL is not matched"); 
			  }
			  
		  }
		  
		  
		  
		  @AfterSuite
		  public void closeBrowser()
		  {
			  driver.close();
		  }
	}
