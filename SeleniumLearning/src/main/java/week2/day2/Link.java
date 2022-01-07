package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {

	public static void main(String[] args) {
		//Importing chromeDriver
		WebDriverManager.chromedriver().setup();

		//Launch Browser
		ChromeDriver driver=new ChromeDriver();

		//Launch url
		driver.get( "http://leafground.com/pages/Link.html");

		//Maximize Browser

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement homePage1=driver.findElement(By.xpath("//a[contains(text(),'Go to Home')]"));

		String homeLink1=homePage1.getAttribute("href");
		homePage1.click();
		driver.findElement(By.xpath("//a[@class='wp-categories-link maxheight']//h5[text()='HyperLink']")).click();
		WebElement link=driver.findElement(By.partialLinkText("supposed to go"));
		String linkValue=link.getAttribute("href");
		driver.navigate().to(linkValue);
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@class='example']//a[contains(text(),'Verify am I broke')]")).click();
		String message=driver.findElement(By.xpath("//html[@lang='en']//h1")).getText();
		System.out.println(message);
		if(message.equals("HTTP Status 404 – Not Found"))
		{

			System.out.println("Broken link");
		}else
			System.out.println("Normal link");
		driver.navigate().back();
		WebElement homePage2=driver.findElement(By.linkText("Go to Home Page"));
		String homeLink2=homePage2.getAttribute("href");
		if(homeLink1.equals(homeLink2))
		{
			homePage2.click();
			System.out.println("Both Links are same link");

		}else
			System.out.println("Both links are not same");
		int size=driver.findElements(By.tagName("a")).size();
		System.out.println(size);
	}

}


