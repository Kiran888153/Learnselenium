package seleniumLearning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> allrows = driver.findElementsByXPath("//table[@id='table_id']//tr");
		int size = allrows.size();
		System.out.println(size);
		
		List<WebElement> allcolumns = driver.findElementsByXPath("//table[@id='table_id']//tr[2]/td");
		int size2 = allcolumns.size();
		System.out.println(size2);
		
		 for (int i = 2; i <= size; i++) {
			 
			 for (int j = 1; j <= size2; j++) {
				 String text = driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td["+j+"]").getText();
				 System.out.println(text);
				 
				 if(text.equals("Babu")) {
					 System.out.println("Row number"+i);
					 System.out.println("Column number"+j);
				 }
			}
			 
		}
		
		
		
          
         
          
	}

}
