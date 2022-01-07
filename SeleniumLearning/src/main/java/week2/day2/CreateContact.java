package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {

		//Importing chromeDriver
		WebDriverManager.chromedriver().setup();

		//Launch Browser
		ChromeDriver driver=new ChromeDriver();

		//Launch url
		driver.get("http://leaftaps.com/opentaps/control/login");

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
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("geet");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("anb");
		driver.findElement(By.name("departmentName")).sendKeys("contact");
		WebElement descValue=driver.findElement(By.id("createContactForm_description"));
		descValue.sendKeys("created");
		String descText=descValue.getAttribute("value");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("cap@gmail.com");

		WebElement stateDn=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select selStDn=new Select(stateDn);
		selStDn.selectByVisibleText("New York");


		//click create contact button
		//driver.manage().deleteAllCookies();
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']/preceding-sibling::a")).click();
		WebElement descValue1=driver.findElement(By.id("updateContactForm_description"));
		descValue1.clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("fill");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		WebElement descChanged=driver.findElement(By.id("sectionHeaderTitle_contacts"));
		System.out.println("Result of update page:" +descChanged.getText());

	}

}
