package week3.day2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearntoTakeScreenshot {

	

	

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://google.co.in/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		
		//to take screenshot
		//File source = driver.getScreenshotAs(OutputType.FILE);
		
		//create target file
		File target = new File("./snaps/google.png");
		
		//to move the source to target
		FileUtils.copyFile(source, target);
		
		
						
		 

	}

}
