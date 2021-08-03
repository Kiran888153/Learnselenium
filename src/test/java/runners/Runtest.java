package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/Login.feature", glue="steps", monochrome = true)
public class Runtest extends AbstractTestNGCucumberTests {
	
	

}
