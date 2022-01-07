package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase2 {

	public static void main(String[] args) {
	
		//Importing chromeDriver
				WebDriverManager.chromedriver().setup();

				//Launch Browser
				ChromeDriver driver=new ChromeDriver();

				//Launch url
				driver.get("http://leaftaps.com/opentaps/");

				//Maximize Browser

				driver.manage().window().maximize();

				//Login using credentials

				WebElement userName=driver.findElement(By.id("username"));

				userName.sendKeys("DemoSalesManager");

				driver.findElement(By.id("password")).sendKeys("crmsfa");

				driver.findElement(By.className("decorativeSubmit")).click();

				//Click the CRM link

				driver.findElement(By.linkText("CRM/SFA")).click();

				//Click Contacts tab

				driver.findElement(By.linkText("Contacts")).click();
				
				//Find Contacts
				
				driver.findElement(By.linkText("Find Contacts")).click();
				
				//Email
				
				driver.findElement(By.linkText("Email")).click();
				
				//Enter Email Address
				
				driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
				
				//Find Contacts button
				
				driver.findElement(By.className("x-btn-text")).click();
				
				//close the browser
				
				driver.close();
				

	}

}
