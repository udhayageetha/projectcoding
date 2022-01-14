package week3.day2;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		//Importing chromeDriver
				WebDriverManager.chromedriver().setup();

				//Launch Browser
				ChromeDriver driver=new ChromeDriver();

				//Launch url
				driver.get( "http://www.ajio.com/");

				//Maximize Browser

				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.name("searchVal")).sendKeys("bags");
				driver.findElement(By.name("searchVal")).sendKeys(Keys.ENTER);
				driver.findElement(By.xpath("//input[@id='Men']//following-sibling::label")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
				Thread.sleep(2000);
				WebElement element=driver.findElement(By.xpath("//div[@id='products']//div[@class='length']"));
				String countItems=element.getText();
				System.out.println(countItems);
				List<WebElement>brandList=driver.findElements(By.className("brand"));
				for(WebElement brandValue:brandList)
				{
					String text=brandValue.getText();	
					System.out.println(text);
					}
				List<WebElement>bagList=driver.findElements(By.className("nameCls"));
				for(WebElement brandValuebag:bagList)
				{
					String text=brandValuebag.getText();	
					System.out.println(text);
					}
	}
	}

