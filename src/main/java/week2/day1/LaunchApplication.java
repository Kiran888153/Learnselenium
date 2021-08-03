package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {
		
		//to setup the path
		WebDriverManager.chromedriver().setup();
		
		System.getProperty("webdriver.chrome.driver");
		
		ChromeDriver driver = new ChromeDriver();
		
		//to maximize the browser
		driver.manage().window().maximize();
		
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		
		WebElement username= driver.findElementById("username");
		username.sendKeys("DemoSalesManager");
		
		WebElement password = driver.findElementByName("PASSWORD");
		password.sendKeys("crmsfa");
		
		
		WebElement ClassName = driver.findElementByClassName("decorativeSubmit");
		ClassName.click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		
		driver.findElementByLinkText("Leads").click();
		
		Thread.sleep(3000);
		
		driver.findElementByLinkText("Create Lead").click();
		
		Thread.sleep(3000);
		
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		
		driver.findElementById("createLeadForm_firstName").sendKeys("Kiran");
		
		driver.findElementById("createLeadForm_lastName").sendKeys("Barrghav");
		
		//locate the parent element which is having select tag
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		
		//create an object for select class
		Select dropdown = new Select(source);
		
		dropdown.selectByVisibleText("Direct Mail");
		
		
		WebElement marketingcampaign = driver.findElementById("createLeadForm_marketingCampaignId");
		
		Select dropdown1 = new Select(marketingcampaign);
		
		dropdown1.selectByVisibleText("Car and Driver");
		
		
		
		
		
		driver.findElementByName("submitButton").click();
		
		
				
				
		
		
				
		
		
			
			
			
			
			
		
		
		
		
		
		
		
		

	}
}
