package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {

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

		//Click Create Contact 

		driver.findElement(By.linkText("Create Contact")).click();

		//Type FirstName

		WebElement contactFirstName=driver.findElement(By.id("firstNameField"));
		contactFirstName.sendKeys("Geetha");
		System.out.println("Contact Tab FirstName:"+contactFirstName.getAttribute("value"));

		//Type LastName

		driver.findElement(By.id("lastNameField")).sendKeys("Anbu");

		//click create contact button

		driver.findElement(By.className("smallSubmit")).click();

		//Get Title
		String browserTitle=driver.getTitle();
		System.out.println("Title of Browser:"+browserTitle);

		//close the browser
		driver.close();


	}

}
