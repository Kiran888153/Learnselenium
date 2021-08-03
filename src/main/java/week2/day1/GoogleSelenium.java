package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSelenium {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.findElementByName("q").sendKeys("selenium",Keys.ENTER);
		
		

	}

}
