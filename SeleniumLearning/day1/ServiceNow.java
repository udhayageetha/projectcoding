package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow {

	public static void main(String[] args) throws InterruptedException {
		//Importing chromeDriver
		WebDriverManager.chromedriver().setup();

		//Launch Browser
		DesiredCapabilities desc=new DesiredCapabilities();
		desc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ChromeDriver driver=new ChromeDriver(desc);
		//Launch url
		driver.get("https://dev114366.service-now.com/navpage.do");
		//driver.navigate().to("https://dev114366.service-now.com/navpage.do"); 
		//Maximize Browser

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("Udhaya12");
		driver.findElement(By.id("sysverb_login")).click();
		driver.findElement(By.id("filter")).sendKeys("incident");
		driver.findElement(By.xpath("(//div[@class='sn-widget-list_v2 sn-widget-list_dense']//div[text()='All'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[@class='navbar-title list_title ']/following-sibling::button")).click();
		driver.findElement(By.xpath("//button[@id='lookup.incident.caller_id']/span")).click();
		

	}

}
