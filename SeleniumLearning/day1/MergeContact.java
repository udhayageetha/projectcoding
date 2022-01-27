package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		//Importing chromeDriver
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

				userName.sendKeys("DemoSalesManager");

				driver.findElement(By.id("password")).sendKeys("crmsfa");

				driver.findElement(By.className("decorativeSubmit")).click();

				//Click the CRM link

				driver.findElement(By.linkText("CRM/SFA")).click();

				//Click Contacts tab

				driver.findElement(By.linkText("Contacts")).click();
				driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
				driver.findElement(By.xpath("(//input[@id='ComboBox_partyIdFrom']/following::img)[1]")).click();
				Thread.sleep(5000);
				
				Set<String>childWindow=driver.getWindowHandles();
				List<String> listwindow=new ArrayList<String>(childWindow);
				String childwindow1=listwindow.get(1);
				driver.switchTo().window(childwindow1);
				driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
				Thread.sleep(5000);
				String windowHandle1=listwindow.get(0);
				driver.switchTo().window(windowHandle1);
				driver.findElement(By.xpath("(//input[@id='ComboBox_partyIdFrom']/following::img)[2]")).click();
				Thread.sleep(5000);
				Set<String>childWindow2=driver.getWindowHandles();
				List<String> listwindow2=new ArrayList<String>(childWindow2);
				String childwindow3=listwindow2.get(1);
				driver.switchTo().window(childwindow3);
				driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
				
				String childwindow4=listwindow2.get(0);
				driver.switchTo().window(childwindow4);
				driver.findElement(By.xpath("//a[text()='Merge']")).click();
				driver.switchTo().alert().accept();
				String Expected=driver.findElement(By.id("sectionHeaderTitle_contacts")).getText();
				System.out.println(Expected);
				String actual=driver.getTitle();
				System.out.println(actual);
				actual.split("");
				if(driver.getTitle().contains("View Contact"))
				{
					System.out.println("Title contains View Contact");

				}else
					System.out.println("Title not contains View Contact");

		driver.close();
	}

}
