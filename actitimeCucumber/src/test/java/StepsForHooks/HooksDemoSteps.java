package StepsForHooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.LoginPage;

public class HooksDemoSteps {
	
	WebDriver driver;
	LoginPage login;
	
	@Before
	public void browserSetup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@After
	public void tearDown() {
		driver.quit();

	}
	
	
	@Given("user A is on the login page")
	public void user_is_on_the_login_page() {
		
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("User is on the login page");
	}

	@When("user A enters username and password")
	public void user_enters_admin_and_manager() {
		login = new LoginPage(driver);
		login.usernameTextField.sendKeys("admin");
		login.passwordTextField.sendKeys("manager");
		System.out.println("user enters username and password");
	}

	@And("user A clicks on login button")
	public void clicks_on_login_button() {
		login.loginButton.click();
		System.out.println("user clicks on the login button");
	}

	@Then("user A is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		Thread.sleep(5000);
		String actualTitle = driver.getTitle();
		Assert.assertTrue(actualTitle.contains("Enter"));
		System.out.println("user is navigated to the home page");
	}

}
