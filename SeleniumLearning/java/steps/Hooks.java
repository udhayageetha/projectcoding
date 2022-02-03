package steps;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends BaseClass{
    @Before
	public void precondition()
	{
    	//Importing chromeDriver
    	WebDriverManager.chromedriver().setup();

    	//Launch Browser
    	driver=new ChromeDriver();

    	//Launch url
    	driver.get( "http://leaftaps.com/opentaps/");

    	//Maximize Browser

    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       
	}
    @After
	public void postcondition()
	{
		driver.close();
	}
}
