package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class MainSteps2 {
	WebDriver driver;
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
//		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
//		 driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://admin-demo.nopcommerce.com/login"); 
	}

	@When("User enter Email as{string} and Password as{string}")
	public void user_enter_email_as_email_and_password_as_password(String username, String password) {
		WebElement user  = driver.findElement(By.xpath("//input[@type = 'email']"));
		user.clear();
		user.sendKeys(username);		
		WebElement pwd  = driver.findElement(By.xpath("//input[@type = 'password']"));
		pwd.clear();
		pwd.sendKeys(password);
	}

	@When("Click on login")
	public void click_on_login() {
		WebElement login  = driver.findElement(By.xpath("//button[@type = 'submit']"));
		login.click();  
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String string) {
		String actualTitle = driver.getTitle();
		System.out.println("Title is="+actualTitle);
	     
	}

}
