package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {

	public static void main(String[] args) {
		//Importing chromeDriver
		WebDriverManager.chromedriver().setup();

		//Launch Browser
		ChromeDriver driver=new ChromeDriver();

		//Launch url
		driver.get( "http://leaftaps.com/opentaps/control/login");

		//Maximize Browser

		driver.manage().window().maximize();

		//Login using credentials

		WebElement userName=driver.findElement(By.id("username"));
		

		userName.sendKeys("DemoSalesManager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		//Click the CRM link

		driver.findElement(By.linkText("CRM/SFA")).click();

		//Click on Leads tab

		driver.findElement(By.linkText("Leads")).click();

		//Click Create Lead button

		driver.findElement(By.xpath("//div[@class='frameSectionBody']//ul//li[2]/a")).click();

		//Lead Company Name

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Capgemini India");

		//Lead FirstName

		WebElement firstNameValue=driver.findElement(By.id("createLeadForm_firstName"));
		firstNameValue.sendKeys("Geetha");
		String fNameText=firstNameValue.getAttribute("value");
		System.out.println("FirstName:"+fNameText);
		//Lead Last Name

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Anbu Chandru");

		//Dropdown

		WebElement eleDwn=driver.findElement(By.id("createLeadForm_dataSourceId"));

		Select selDn=new Select(eleDwn);

		int size=selDn.getOptions().size();

		selDn.selectByIndex(size-3);

		//fill all fields 

		WebElement markeDn=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select selDMn=new Select(markeDn);
		selDMn.selectByVisibleText("Car and Driver");

		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("UG");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("AN");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mrs");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("7/1/89");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Senior Consultant");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("10000");
		WebElement indusDn=driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select selIndusDn=new Select(indusDn);
		selIndusDn.selectByIndex(5);
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10");

		WebElement ownershipDwn=driver.findElement(By.id("createLeadForm_ownershipEnumId"));

		Select ownDn=new Select(ownershipDwn);
		ownDn.selectByVisibleText("S-Corporation");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("25");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Test");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("!");
		//Contact Information

		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("123");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("991228999");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("20");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("geet");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.google.com");
		//fill primary address

		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("udhai");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("gee");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Thanthonimalai 1-2");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("college");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("karur");
		WebElement stateDropdn= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));

		Select selState=new Select(stateDropdn);
		int size1=selState.getAllSelectedOptions().size();
		selState.selectByValue("AZ");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("12345");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("4567");
		//Create Lead button click

		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		//sectionHeaderTitle_leads
		if(driver.getTitle().contains("View Lead"))
		{
			System.out.println("Title contains View Lead");

		}else
			System.out.println("Title not contains View Lead");

driver.close();
	}

}


























