package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learnwindowhandling {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//String title = driver.getTitle();

		//System.out.println(title);
		
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		driver.findElementById("home").click();
		
		//String title2 = driver.getTitle();
		//System.out.println(title2);
		
		Set<String> windowHandles2= driver.getWindowHandles();
		System.out.println("****");
		String Secondwindow = null;
		
		
		for (String eachref : windowHandles2) {
			if(!eachref.equals(windowHandle)) {
				String secondwindow = eachref;
				System.out.println(secondwindow);
		}
		
		//System.out.println("*****");
		
		//List<String> listhandles = new ArrayList<String>(windowHandles2);
		  //System.out.println(listhandles.get(1));
		
		
		
		
		
		
		
	}
	
		
	}
	
}


