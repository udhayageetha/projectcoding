package week2.day2;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) {
		//Importing chromeDriver
		WebDriverManager.chromedriver().setup();

		//Launch Browser
		ChromeDriver driver=new ChromeDriver();

		//Launch url
		driver.get( "http://leafground.com/pages/checkbox.html");

		//Maximize Browser

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//label[contains(text(),'Select the languages')]//following::input")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Select the languages')]//following::input[3]")).click();
		WebElement selChebox=driver.findElement(By.xpath("//label[contains(text(),'Confirm Selenium is chec')]//following::input"));
		if(selChebox.isSelected())
		{
			System.out.println("Checkbox is selected");;
		}else
			System.out.println("Checkbox is not selected");
        WebElement selected=driver.findElement(By.xpath("//label[contains(text(),'DeSelect only check')]//following::input[2]"));
        if(selected.isSelected())
        {
        	selected.click();
        	System.out.println("checkbox is deselected");
        }
        
        List<WebElement> elements=driver.findElements(By.xpath("//label[contains(text(),'Select all below checkboxe')]//following::input"));
        int size=elements.size();
        for(int i=0;i<size;i++)
        {
        elements.get(i).click();
        }
        
        }
        
	}


