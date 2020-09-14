package stepDefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import junit.framework.Assert;

public class LoginStepDefinition {
	WebDriver driver;

@Given("^User launch Browser$")
public void user_launch_Browser() throws Throwable {
	  System.setProperty("webdriver.chrome.driver", "/usr/lib/chromium-browser/chromedriver");
	  driver= new ChromeDriver();
	  
}

@When("^user launch application$")
public void user_launch_application() throws Throwable {
	driver.get("https://freecrm.com/");
}

@When("^User Click on Login Button$")
public void user_Click_on_Login_Button() throws Throwable {
	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/ul/li[1]")).click();
}

@When("^User enter User email as \"([^\"]*)\"$")
public void user_enter_User_email_as(String email) throws Throwable {
	driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[1]/div/input")).sendKeys(email);
}

@When("^User enter password as \"([^\"]*)\"$")
public void user_enter_password_as(String password) throws Throwable {
	Thread.sleep(3000);
    	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
}

@Then("^Validate Application login successfull$")
public void validate_Application_login_successfull() throws Throwable {
   driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[3]")).click();
   Thread.sleep(5000);
}



}
