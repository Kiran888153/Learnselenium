package week4.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	
	

	

	public static void main(String[] args) {
		// to setup the path
		WebDriverManager.chromedriver().setup();
		
		// to open the browser
		ChromeDriver google = new ChromeDriver();
		
		//to launch URL
		google.get("http://leafground.com/pages/table.html");
		
	    google.manage().window().maximize();
	    
	    List<WebElement> row = google.findElementsByXPath("//table[@class='display']//tr");
	    int rowcount = row.size();
	    
	    List<WebElement> column = google.findElementsByXPath("//table[@class='display']//tr[2]/td");
	    int columncount = column.size();
	    
	    for (int i = 2; i < rowcount; i++) {
	    	
	    	
	    	for (int j = 1; j < columncount; j++) {
	    		
	    		String text = google.findElementByXPath("//table[@class='display']//tr["+i+"]/td["+j+"]").getText();
		 	    System.out.println(text);
		 	    
		 	    if(text.equals("Babu"));
		 	    System.out.println("row number"+ i);
		 	    System.out.println("column number"+ j);
				
			}
	    	 
	    	
	    	
		}
	    
	   
	    
	    
			
		}
	    
	    
	    
	  
	    
	    
		
		
		}
		
		

	


