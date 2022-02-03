package week5.day2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseClassCreateLead extends ApachePoiReadExcel {
	 public ChromeDriver driver;
	 public String fileName;
	 
	 @BeforeClass
	 public void setUp()
	 {
		fileName="data"; 
	 }
	 

 @Parameters({"url","username","password"})
  @BeforeMethod
  public void beforeMethod(String url,String username,String password) {
	 
	  
	//Importing chromeDriver
			WebDriverManager.chromedriver().setup();

			//Launch Browser
			driver=new ChromeDriver();

			//Launch url
			driver.get("http://leaftaps.com/opentaps/");

			//Maximize Browser

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			//Login using credentials

			WebElement userName=driver.findElement(By.id("username"));


			userName.sendKeys(username);

			driver.findElement(By.id("password")).sendKeys(password);

			driver.findElement(By.className("decorativeSubmit")).click();

			//Click the CRM link

			driver.findElement(By.linkText("CRM/SFA")).click();

			//Click on Leads tab

			driver.findElement(By.linkText("Leads")).click();
			
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }
  @DataProvider(name="fetchData")
	public String[][] fetchData() throws IOException
	{

		return ApachePoiReadExcel.readExcel(fileName); 
		
	}

}
