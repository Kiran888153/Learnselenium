package testcase;


import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import week5.day1.Readexcel;
import week5.day1.TestNGbaseclass;

public class CreateLead extends TestNGbaseclass {
	
   @Test(dataProvider="senddata")
	public void runCreatelead (String compname, String fname, String Lname, String phnum) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(compname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(Lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phnum);
		driver.findElement(By.name("submitButton")).click();
		
}
   @DataProvider(name="senddata", indices=0)
   public String[][] senddata() throws IOException {
	 Readexcel re = new Readexcel();
	 String[][] data = re.dataExcel();
	   
	   return data;
	   
	   
	   
	   

   
   
   }
   
   
   
   
   
   
   
   
}






