package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepsDefinitionsexamples {
	public ChromeDriver driver;

@Given("login the leaftaps application")
public void loginTheLeaftapsApplication() {
	
	
}
@Given("enter {string} and {string}")
public void enterUsernameAndPassword(String username,String password) {
	//Login using credentials

	WebElement userName=driver.findElement(By.id("username"));


	userName.sendKeys(username);

	driver.findElement(By.id("password")).sendKeys(password);
   
}
@Given("click login button")
public void clickLoginButton() {
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
}
@Given("click leads button")
public void clickLeadsButton() {
	driver.findElement(By.linkText("Leads")).click();
	
}
@Given("click create lead link")
public void clickCreateLeadLink() {
	driver.findElement(By.linkText("Create Lead")).click();
}
@When("enter {string} and {string} and {string}")
public void enterCompanyNameLastnameFirstname(String companyname,String firstname,String lastname) {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
    
}
@When("click submit button")
public void clickSubmitButton() {
	driver.findElement(By.name("submitButton")).click();
   
}
@Then("createlead should be created.")
public void createleadShouldBeCreated() {
   
}

}