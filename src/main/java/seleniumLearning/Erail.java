package seleniumLearning;



import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement fromstation = driver.findElementById("txtStationFrom");
		fromstation.clear();
		fromstation.sendKeys("ms");
		fromstation.sendKeys(Keys.TAB);
		
		WebElement tostation = driver.findElementById("txtStationTo");
		tostation.clear();
		tostation.sendKeys("mdu");
		tostation.sendKeys(Keys.TAB);
		
		driver.findElementById("chkSelectDateOnly").click();
		
		Thread.sleep(2);
		
     List<WebElement> allrows = driver.findElementsByXPath("//table[@class= 'DataTable TrainList TrainListHeader']//tr");
    int rowcount = allrows.size();
    
    List<String> trainname = new ArrayList<String>();
    
    
		
	
    
    for (int i = 1; i <= rowcount; i++) {
    	String fulltrainnames = driver.findElementByXPath("//table[@class= 'DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]").getText();
    	trainname.add(fulltrainnames);
    	
		
	}
    Set<String> settrainname = new LinkedHashSet<String>(trainname);
    
    for (String temp : trainname) {
    	if(!settrainname.add(temp)){
System.out.println(temp);
	}
 
    //if(trainname.size() != settrainname.size()){
    //System.out.println("There are duplicate train names");
    //}else {
		//System.out.println("There are no duplicate train names");
	}
	
	}

}



	
		
	     
		


