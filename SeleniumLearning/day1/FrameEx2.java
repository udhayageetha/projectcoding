package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameEx2 {

	public static void main(String[] args) throws IOException {
		//Importing chromeDriver
		WebDriverManager.chromedriver().setup();

		//Launch Browser
		ChromeDriver driver=new ChromeDriver();

		//Launch url
		driver.get("http://leafground.com/pages/frame.html");

		//Maximize Browser

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame(0);
		WebElement eleSnap=driver.findElement(By.xpath("//button[@id='Click']"));
		eleSnap.click();
		String text = eleSnap.getText();
		System.out.println(text);
		TakesScreenshot takeScr=((TakesScreenshot)driver);
		File srcText=eleSnap.getScreenshotAs(OutputType.FILE);
		File destText=new File("./images/fileoutput.png");
		FileUtils.copyFile(srcText, destText);
		driver.switchTo().parentFrame();
		List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
		int size=findElements.size();
		System.out.println(size);
		
		
		
		

	}

}
