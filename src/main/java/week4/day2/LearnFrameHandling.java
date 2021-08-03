package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrameHandling {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement element = driver.findElementByXPath("//div[@id='wrapframe']/iframe");
		
		driver.switchTo().frame(element);
		
		driver.findElementById("Click").click();
		
		driver.switchTo().defaultContent();
		
		WebElement secondelement = driver.findElementByXPath("(//div[@id='wrapframe']/iframe)[2]");
		
		driver.switchTo().frame(secondelement);
		
		driver.switchTo().frame("frame2");
		
		driver.findElementByTagName("button").click();
	}

}
