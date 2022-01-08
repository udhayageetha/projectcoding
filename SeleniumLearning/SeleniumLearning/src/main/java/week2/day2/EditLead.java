package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.xpath("//label[text()='First name:']/following::input[@name='firstName'][3]")).sendKeys("ud");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//a[1]")).click();
		String title=driver.findElement(By.xpath("//div[text()='View Lead']")).getText();
		if(driver.getTitle().contains("View Lead"))
		{
			System.out.println("Title matches");
		}else
			System.out.println("Title not match");
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		WebElement compName=driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
		compName.clear();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("CTS");
		String upValue=compName.getAttribute("Value");
		System.out.println("Sendkeys value:" +upValue);
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String disValue=driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
        disValue.replaceAll("\\D", "");
		System.out.println("changed company Name:" +disValue);
		if(upValue.contains(disValue))
		{
			System.out.println("Both Company Name match");
		}else
			System.out.println("Both company name not match");

		driver.close();

	}

}
