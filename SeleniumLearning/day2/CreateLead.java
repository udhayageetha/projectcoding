package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClassCreateLead{
    
	@Test(dataProvider="fetchData")
	public void createLead(String cName,String firstName,String lastName) {
	
		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.name("submitButton")).click();
		
}
	
		
	}






