package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practiceframe {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElementByTagName("button").click();
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Kiran");
		alert.accept();
		
		String text = driver.findElementById("demo").getText();
		if(text.contains("Kiran")){
			System.out.println("Contains Kiran");
		}
		else {
			System.out.println("Not contains Kiran");
		}
		
				
				
				
	
	
		
		
		
	}

}
