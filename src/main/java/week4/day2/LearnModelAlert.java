package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnModelAlert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//button[text()='Alert Box']").click();
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		
		
		driver.findElementByXPath("//button[text()='Confirm Box']").click();
		driver.switchTo().alert().accept();
		
	

	}

}
