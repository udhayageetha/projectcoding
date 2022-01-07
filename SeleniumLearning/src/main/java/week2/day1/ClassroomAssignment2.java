package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassroomAssignment2 {

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

		//Click Leads tab

		driver.findElement(By.linkText("Leads")).click();

		//Click Create Lead

		driver.findElement(By.linkText("Create Lead")).click();


		//Pass CompanyName

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Capgemini");

		//Pass FirstName

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Udhayageetha");	

		//Pass LastName


		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Anbumani");

		//select dropdown
		WebElement sourceDrp=driver.findElement(By.id("createLeadForm_dataSourceId"));

		Select drpDown=new Select(sourceDrp);

		drpDown.selectByIndex(5);

		//Submit Lead button

		driver.findElement(By.className("smallSubmit")).click();


		//close driver

		driver.close();


	}

}
