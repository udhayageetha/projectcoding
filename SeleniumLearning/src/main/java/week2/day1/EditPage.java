package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditPage {

	public static void main(String[] args) throws InterruptedException {
		//Importing chromeDriver
		WebDriverManager.chromedriver().setup();

		//Launch Browser
		ChromeDriver driver=new ChromeDriver();

		//Launch url
		driver.get("http://leafground.com/pages/Edit.html");

		//Maximize Browser

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement emailValu=driver.findElement(By.id("email"));

		emailValu.sendKeys("abc@gmail.com");

		WebElement appendText=driver.findElement(By.xpath("//input[@value='Append ']"));

		appendText.clear();
		appendText.sendKeys("geet",Keys.ENTER);
		WebElement getText=driver.findElement(By.xpath("//input[@value='TestLeaf']"));
		System.out.println("Default text:" +getText.getAttribute("value"));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		System.out.println(driver.findElement(By.xpath("//label[contains(text(),'Confirm that edit field is di')]/following-sibling::input")).isEnabled());
		driver.close();


	}

}
