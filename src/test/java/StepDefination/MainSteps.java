package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MainSteps {
	WebDriver driver;
	@Given("User is on facebook login page")
	public void user_is_on_facebook_login_page() {
		System.out.println("1");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://admin-demo.nopcommerce.com/login"); 
	
		      	}
	@When("User enter valid Email and Password in Facebook")
	public void user_enter_valid_email_and_password_in_facebook () {
		System.out.println("2");
		      	}
	@Then("User is able to navigate")
	public void user_is_able_to_navigate() {
		System.out.println("3");
		  
	}


}
