package seleniumLearning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToselectMultipleoptionboxes {
	

	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> elements = driver.findElementsByXPath("//label[text()='Select all below checkboxes ']/following::input");
		
		for (WebElement allelements : elements) {
			allelements.click();
			
		}
		}
		
	
}


