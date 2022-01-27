package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesExamples {

	public static void main(String[] args) {
		//Importing chromeDriver
				WebDriverManager.chromedriver().setup();

				//Launch Browser
				ChromeDriver driver=new ChromeDriver();

				//Launch url
				driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");

				//Maximize Browser

				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.switchTo().frame("frame1");
				driver.findElement(By.xpath("//body//input")).sendKeys("frames");
				driver.switchTo().frame("frame3");
				driver.findElement(By.xpath("//input[@id='a']")).click();
				driver.switchTo().defaultContent();
				driver.switchTo().parentFrame();
				driver.switchTo().frame("frame2");
				WebElement dpEle=driver.findElement(By.id("animals"));
				Select selDwn=new Select(dpEle);
				selDwn.selectByIndex(2);
				

	}

}
