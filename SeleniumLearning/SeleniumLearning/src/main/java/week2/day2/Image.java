package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {

	public static void main(String[] args) {
		//Importing chromeDriver
				WebDriverManager.chromedriver().setup();

				//Launch Browser
				ChromeDriver driver=new ChromeDriver();

				//Launch url
				driver.get( "http://leafground.com/pages/Image.html");

				//Maximize Browser

				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath("//label[@for='home']/following::img[1]")).click();
				driver.navigate().back();
				WebElement imagBroken=driver.findElement(By.xpath("//label[text()='Am I Broken Image?']/following::img[1]"));
				String jpg=imagBroken.getAttribute("src");
				driver.navigate().to(jpg);
				String message=driver.findElement(By.xpath("//html[@lang='en']//h1")).getText();
				System.out.println(message);
				if(message.equals("HTTP Status 404 – Not Found"))
				{

					System.out.println("Broken image");
				}else
					System.out.println("Normal image");
				driver.navigate().back();
				driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following::img[1]")).click();
				

	}

}
