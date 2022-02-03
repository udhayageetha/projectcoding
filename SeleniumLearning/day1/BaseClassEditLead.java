package week5.day1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseClassEditLead {
	 public ChromeDriver driver;
 
  @BeforeMethod
  public void beforeMethod() {
	 
	  
	//Importing chromeDriver
			WebDriverManager.chromedriver().setup();

			//Launch Browser
			driver=new ChromeDriver();

			//Launch url
			driver.get( "http://leaftaps.com/opentaps/control/login");

			//Maximize Browser

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			//Login using credentials

			WebElement userName=driver.findElement(By.id("username"));


			userName.sendKeys("DemoSalesManager");

			driver.findElement(By.id("password")).sendKeys("crmsfa");

			driver.findElement(By.className("decorativeSubmit")).click();

			//Click the CRM link

			driver.findElement(By.linkText("CRM/SFA")).click();

			
  }
			

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
