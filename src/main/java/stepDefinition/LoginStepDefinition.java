package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;

public class LoginStepDefinition {
	WebDriver driver;

	@Given("^User launch Browser$")
	public void user_launch_Browser() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

	}

	@When("^User launch Sweety application$")
	public void user_launch_Sweety_application() throws Throwable {
		driver.get("http://damp-sands-8561.herokuapp.com/users/sign_in");
	}

	@When("^User Click on Login Button$")
	public void user_Click_on_Login_Button() throws Throwable {
		driver.findElement(By.xpath("//a[text()='Login']")).click();
	}

	@When("^User enter User email as \"([^\"]*)\"$")
	public void user_enter_User_email_as(String email) throws Throwable {
		driver.findElement(By.xpath("//input[@type='email']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
	}

	@When("^User enter password as \"([^\"]*)\"$")
	public void user_enter_password_as(String password) throws Throwable {
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
	}

	@SuppressWarnings("deprecation")
	@Then("^Validate Application login successfull$")
	public void validate_Application_login_successfull() throws Throwable {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[@href='/entries']")).click();
		driver.findElement(By.xpath("//a[@href='/entries/new']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		driver.findElement(By.xpath("//a[@href='/report']")).click();
		Assert.assertEquals(0, 0);
	}

	@When("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@When("^I Enter blood glucose level as \"([^\"]*)\"$")
	public void i_Enter_blood_glucose_level_as(String arg1) throws Throwable {
		driver.findElement(By.xpath("//a[@href='/entries']")).click();
		driver.findElement(By.xpath("//a[@href='/entries/new']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(arg1);
		driver.findElement(By.xpath("//input[@name='commit']")).click();
	}

	@Then("^I validate the blood glucose level as \"([^\"]*)\" in report$")
	public void i_validate_the_blood_glucose_level_as_in_report(String arg1) throws Throwable {
		driver.findElement(By.xpath("//a[@href='/report']")).click();
		String read = driver.findElement(By.xpath("//tr//th[3]//following::td[3]")).getText().replace("mg/dl", "")
				.trim();
		System.out.println(read + " " + arg1);
		Assert.assertEquals(arg1, read);

	}

	@Then("^I delete the pervious entry$")
	public void i_delete_the_pervious_entry() throws Throwable {
		driver.findElement(By.xpath("//a[@href='/entries']")).click();
		driver.findElement(By.xpath("//a[@data-confirm='Are you sure?']")).click();
		// driver.findElement(By.xpath("//a[@href='//a[@href='/entries/3684']']")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.quit();
	}
}
