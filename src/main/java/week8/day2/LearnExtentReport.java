package week8.day2;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {
	
	public static void main(String[] args) {
		//create physical HTML file
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/results.html");
		
		//create extent report to cpture the data
		ExtentReports extent = new ExtentReports();
		
		//capture the actual data to the physical file
		extent.attachReporter(reporter);
		
		//steps to create testcases
		ExtentTest test = extent.createTest("loginandlogout, login test for leaftaps");
		test.assignAuthor("Kiran");
		test.assignCategory("Functional");
		
		
		//update the status for test steps
		test.pass("Enter the username as demosalesmanager");
		test.pass("Enter the password as crmsfa");
		test.pass("Click Login button");
		
		//last mandatory step
		extent.flush();
		
		
		
		
		
		
	}

}
