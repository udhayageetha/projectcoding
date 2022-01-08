package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundButton {

	public static void main(String[] args) {
		//Importing chromeDriver
				WebDriverManager.chromedriver().setup();

				//Launch Browser
				ChromeDriver driver=new ChromeDriver();

				//Launch url
				driver.get("http://leafground.com/pages/Button.html");

				//Maximize Browser

				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
                
               Point location = driver.findElement(By.id("position")).getLocation();
                
                System.out.println("Location of WebElement" +location);
                
                
                String attribute = driver.findElement(By.id("color")).getAttribute("style");
                		
                System.out.println(attribute);
                		
                		
                		Dimension size = driver.findElement(By.id("size")).getSize();
                		System.out.println(size);
	}

	
}
