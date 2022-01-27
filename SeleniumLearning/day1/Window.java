package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window {

	public static void main(String[] args) throws InterruptedException {
		//Importing chromeDriver
				WebDriverManager.chromedriver().setup();

				//Launch Browser
				ChromeDriver driver=new ChromeDriver();

				//Launch url
				driver.get("http://www.leafground.com/pages/Window.html");

				//Maximize Browser

				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				String windowHandle = driver.getWindowHandle();
				driver.findElement(By.xpath("//button[text()='Open Home Page']")).click();
				Thread.sleep(5000);
				driver.switchTo().window(windowHandle);
				driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
				driver.manage().window().maximize();
				Set<String>childWindow=driver.getWindowHandles();
				List<String> listwindow=new ArrayList<String>(childWindow);
				System.out.println(listwindow.size());
				for(String windowChild:listwindow)
				{
					int i = 0;
					System.out.println(listwindow.get(i));
					if(!windowChild.equals(windowHandle))
					{
						driver.switchTo().window(windowChild).close();
					}
				driver.switchTo().window(windowHandle);	
				}
				
				driver.findElement(By.xpath("//button[text()='Wait for 5 seconds']")).click();
						

	}

}
