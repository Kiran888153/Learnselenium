package seleniumLearning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractionwithMultipleElements {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> elements = driver.findElementsByXPath("//input[@class='inputLogin']");
		WebElement Firstelement = elements.get(0);
		Firstelement.sendKeys("demosalesmanager");
		
		 WebElement secondelement = elements.get(1);
		 secondelement.sendKeys("crmsfa");
		 
		 
		 for (WebElement allelements : elements) {
			 String name = allelements.getAttribute("name");
			 System.out.println(name);
			
		}
		

	}

}
