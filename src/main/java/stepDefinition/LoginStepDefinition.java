package stepDefinition;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;

public class LoginStepDefinition {
	WebDriver driver;
	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() throws Throwable {
	  System.setProperty("webdriver.chrome.driver", "/usr/lib/chromium-browser/chromedriver");
	  driver= new ChromeDriver();
	  driver.get("https://freecrm.com/");
	}
	
	@Given("^I want to write a step with <\"([^\"]*)\"$")
	public void i_want_to_write_astep_with(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^some other precondition$")
	public void some_other_precondition() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I complete action$")
	public void i_complete_action() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^some other action$")
	public void some_other_action() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^yet another action$")
	public void yet_another_action() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^check more outcomes$")
	public void check_more_outcomes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^I want to write a step with <\"([^\"]*)\">$")
	public void i_want_to_write_a_step_with(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I check for the <\"([^\"]*)\"> in step$")
	public void i_check_for_the_in_step(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I verify the <\"([^\"]*)\"> in step$")
	public void i_verify_the_in_step(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
