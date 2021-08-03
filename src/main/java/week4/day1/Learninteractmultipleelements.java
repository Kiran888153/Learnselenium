package week4.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learninteractmultipleelements {

	public static void main(String[] args) {
		// To setup the path of Webdriver
		WebDriverManager.chromedriver().setup();
		
		//to open browser
		ChromeDriver driver = new ChromeDriver();
		
		//to apply URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// to maximize the window
		driver.manage().window().maximize();
		
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//to interact with multiple elements
		List<WebElement> elements = driver.findElementsByXPath("//input[@class='inputLogin']");
		//WebElement firstelement = elements.get(0);
		//firstelement.sendKeys("demosalesmanager");
		
		
		//for (int i = 0; i < elements.size(); i++) {
			//String allelements = elements.get(i).getAttribute("name");
			//System.out.println(allelements);
		
		for (WebElement allelements : elements) {
			String repeatelement = allelements.getAttribute("name");
			System.out.println(repeatelement);
			
		}
			
			
		}
		
	
		
		
		
		

	}


