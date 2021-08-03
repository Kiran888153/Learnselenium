package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchRingaa {

	public static void main(String[] args) {
		// to setup the path for webdriver
		WebDriverManager.chromedriver().setup();
		
		//to find the path of webdriver
		
		System.getProperty("webdriver.chrome.driver");
		
		
		//to open the U
		ChromeDriver driver = new ChromeDriver();
		
		// to maximize the window
		driver.manage().window().maximize();
		
		
		//to launch the URL
		driver.get("http://livetestsite.ga");
		
		driver.findElementByClassName("caret").click();
		
		
		driver.findElementByLinkText("Login").click();
				
		driver.findElementByName("username").sendKeys("9176331366");
		
		driver.findElementById("password").sendKeys("Dangerous-34");
		
		driver.findElementByClassName("button").click();
		
		

	}

}
