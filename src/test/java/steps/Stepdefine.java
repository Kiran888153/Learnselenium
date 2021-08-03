package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefine {
public ChromeDriver driver;
	
	@Given("Open the chrome browser")
	public void openbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}
	
	@And("load the url")
    public void enterURL() {
    	driver.get("http://leaftaps.com/opentaps/control/main");

	}
    @And("enter the username as DemoSalesManager")
    public void enterusername() {
    	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

	}
    
    @And("enter the password as crmsfa")
    public void enterpassword() {
    	driver.findElement(By.id("password")).sendKeys("crmsfa");

	}
    
    @When("click on login")
    public void clicklogin() {
    	driver.findElement(By.className("decorativeSubmit")).click();

	}
    @Then("homepage should get displayed")
    public void homepagedisplay() {
		System.out.println("Homepage display");

   	}
}
