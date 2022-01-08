package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		//Importing chromeDriver
		WebDriverManager.chromedriver().setup();

		//Launch Browser
		ChromeDriver driver=new ChromeDriver();

		//Launch url
		driver.get( "http://leafground.com/pages/Dropdown.html");

		//Maximize Browser

		driver.manage().window().maximize();
		WebElement editDropdown=driver.findElement(By.id("dropdown1"));
		Select selIndex=new Select(editDropdown);
		selIndex.selectByIndex(3);
		WebElement editDropdown2=driver.findElement(By.name("dropdown2"));
		Select selText=new Select(editDropdown2);
		selText.selectByVisibleText("Loadrunner");
		WebElement editDropdown3=driver.findElement(By.id("dropdown3"));
		Select selValue=new Select(editDropdown3);
		selValue.selectByValue("2");
		WebElement editDropdown4=driver.findElement(By.className("dropdown"));
		Select selIndexOptions=new Select(editDropdown4);
		int size=selIndexOptions.getOptions().size();
		selIndexOptions.selectByIndex(size-3);
		//doubt
		WebElement eleSel=driver.findElement(By.linkText("You can also use sendKeys to select"));
		eleSel.sendKeys("Appium");
		WebElement eleSel2=driver.findElement(By.linkText("Select your programs"));
		Select selMul=new Select(eleSel2);
		selMul.selectByValue("1");


		driver.close();




	}

}
