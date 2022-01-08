package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		//Importing chromeDriver
				WebDriverManager.chromedriver().setup();

				//Launch Browser
				ChromeDriver driver=new ChromeDriver();

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

				//Click on Leads tab

				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
				driver.findElement(By.xpath("//span[text()='Email']")).click();
				driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("ab@gmail.com");
				
				driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
				String leadName = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).getText();
                System.out.println(leadName);
                WebElement leadText=driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//a[1]"));
                leadText.click();
                driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
                String titleExpected="Duplicate Lead";
                System.out.println(driver.getTitle());
                if(driver.getTitle().contains(titleExpected))
                {
                	System.out.println("Title matches");
                	
                	
                }else
                	System.out.println("Title not match");
                
                driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
                String captuLead=driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
                if(captuLead.equals(leadName))
                {
                	System.out.println("Both name match");
                }else
                	System.out.println("Both name not match");
                driver.close();
                }
	        
	}

