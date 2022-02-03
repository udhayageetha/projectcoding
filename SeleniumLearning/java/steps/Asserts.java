package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import cucumber.api.cli.Main;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Asserts {

 
		public static void main(String[] args) throws InterruptedException
		{
		WebDriverManager.chromedriver().setup();

		//Launch Browser
		ChromeDriver driver=new ChromeDriver();

		//Launch url
		driver.get("http://leaftaps.com/opentaps/");

		//Maximize Browser

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Login using credentials

		WebElement userName=driver.findElement(By.id("username"));


		userName.sendKeys("DemoCSR");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		//Click the CRM link

		driver.findElement(By.linkText("CRM/SFA")).click();

		//Click on Leads tab

		driver.findElement(By.linkText("Leads")).click();
	
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = driver.findElement(By.className("x-paging-info")).getText();
	/*	if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		*/
		
		Assert.assertEquals(text, "No records to display");
		
		SoftAssert asserta=new SoftAssert();
		asserta.assertAll();
		
}
}







