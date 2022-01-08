package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSignup {

	public static void main(String[] args) {
		//Importing chromeDriver
		WebDriverManager.chromedriver().setup();

		//Launch Browser
		ChromeDriver driver=new ChromeDriver();

		//Launch url
		driver.get( "https://en-gb.facebook.com/");

		//Maximize Browser

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//form//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Udhaya");
		driver.findElement(By.name("lastname")).sendKeys("Anbu");
		driver.findElement(By.xpath("//div[contains(text(),'Mobile number or email')]/following::input")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("abcd");
		WebElement dropDwn=driver.findElement(By.xpath("//select[@id='day']"));
		Select selDn=new Select(dropDwn);
		selDn.selectByIndex(30);
		WebElement dropDwn1=driver.findElement(By.xpath("//select[@id='month']"));
		Select selDn1=new Select(dropDwn1);
		selDn1.selectByValue("11");
		WebElement dropDwn2=driver.findElement(By.xpath("//select[@id='year']"));
		Select selDn2=new Select(dropDwn2);
		selDn2.selectByVisibleText("1989");
		driver.findElement(By.xpath("//input[@class='_8esa']/preceding-sibling::label[text()='Female']")).click();
	}

}
