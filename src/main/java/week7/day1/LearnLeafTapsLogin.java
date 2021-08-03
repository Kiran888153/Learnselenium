package week7.day1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnLeafTapsLogin {

	
	@Test
	public void runloginProperties() throws IOException {
		//to setup the properties file
		FileInputStream fis = new FileInputStream("./src/main/resources/config.properties");
		
		
		//to create object for properties
		Properties prop = new Properties();
		
		//to load the properties file
		prop.load(fis);
		
		//to read a particular value from  properties file
		prop.getProperty("username");
		
	  
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("Password"));
		driver.findElement(By.className("decorativeSubmit")).click();
		
		

	}

}
