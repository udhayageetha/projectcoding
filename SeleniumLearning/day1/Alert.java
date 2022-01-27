package week4.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		//Importing chromeDriver
		WebDriverManager.chromedriver().setup();

		//Launch Browser
		ChromeDriver driver=new ChromeDriver();

		//Launch url
		driver.get("http://www.leafground.com/pages/Alert.html");

		//Maximize Browser

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("result")).getText());
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		Thread.sleep(2000);
		org.openqa.selenium.Alert alertValue=driver.switchTo().alert();
		alertValue.sendKeys("geetha");
		alertValue.accept();
		System.out.println(driver.findElement(By.id("result1")).getText());
		driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
		driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//button[text()='Sweet Alert']")).click();
        driver.findElement(By.xpath("//button[text()='OK']")).click();
       driver.switchTo().alert().accept();
	}

}
