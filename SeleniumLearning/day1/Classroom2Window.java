package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Classroom2Window {
	public static void main(String[] args) throws InterruptedException {
		//Importing chromeDriver
		WebDriverManager.chromedriver().setup();
        ChromeOptions Co=new ChromeOptions();
        Co.addArguments("--disable-notifications");
		//Launch Browser
		ChromeDriver driver=new ChromeDriver(Co);

		//Launch url
		driver.get( "https://www.irctc.co.in/nget/train-search");

		//Maximize Browser

		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement ok = driver.findElement(By.xpath("//button[text()='OK']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(ok).click().perform();
		driver.findElement(By.xpath("(//label[text()='FLIGHTS'])[2]")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
	    List<String>listWindow=new ArrayList<String>(windowHandles);
	    String string2 = listWindow.get(1);
	    driver.switchTo().window(string2);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentWindow);
		
		
		
	}
}
