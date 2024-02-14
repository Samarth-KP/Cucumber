package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {
	
	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("on login page");
	}
	
	@When("I enter valid credentials")
	public void i_enter_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("on login page");
	}
	@When("I click the login button")
	public void i_click_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("on login page");
	}
	@Then("I should be redirected to the dashboard")
	public void i_should_be_redirected_to_the_dashboard() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("on login page");
	}
	@Then("I should see a welcome message")
	public void i_should_see_a_welcome_message() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("on login page");
	}
	
}
