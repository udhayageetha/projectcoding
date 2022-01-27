package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3Schools {

	public static void main(String[] args) throws InterruptedException {
		//Importing chromeDriver
		WebDriverManager.chromedriver().setup();

		//Launch Browser
		ChromeDriver driver=new ChromeDriver();

		//Launch url
		driver.get( "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");

		//Maximize Browser

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("geetha");
		alert.accept();
		String text=driver.findElement(By.id("demo")).getText();
		System.out.println(text);
		if(text.contains("geetha"))
		{
			System.out.println("alert text present");
		}else
			System.out.println("text not prsesent");
		driver.close();

	}

}
