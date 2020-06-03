package Stepdefs;

import Base.ExtentTestManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Background_Stepdef {
	
	
	@Before
	public void add()
	{
		System.out.println("This is pckg before");
	}
	
	@After
	public void add1()
	{
		System.out.println("This is pckg after");
	}

	@Given("user is first bcg")
	public void user_is_first_bcg() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("given User is the first bcg");
		ExtentTestManager.logInfo("given User is the first bcg");
	   
	}

	@When("title of login page is first bcg")
	public void title_of_login_page_is_first_bcg() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("When User is the first bcg");
		ExtentTestManager.logInfo("When User is the first bcg");
		   
	}

	@Then("user clicks on login button first bcg")
	public void user_clicks_on_login_button_first_bcg() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Then User is the first bcg");
		ExtentTestManager.logInfo("Then User is the first bcg");
		   
	}

	@Given("user is second bcg")
	public void user_is_second_bcg() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Given User is the second");
		ExtentTestManager.logInfo("Given User is the second");
	}

	@When("title of login page is second bcg")
	public void title_of_login_page_is_second_bcg() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("when User is the second");
		ExtentTestManager.logInfo("when User is the second");
	}

	@Then("user clicks on login button second bcg")
	public void user_clicks_on_login_button_second_bcg() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Then User is the second");
	}


	@Given("user is third bcg")
	public void user_is_third_bcg() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Given User is the third");
	}

	@When("title of login page is third bcg")
	public void title_of_login_page_is_third_bcg() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("When User is the third");
	}

	@Then("user clicks on login button third bcg")
	public void user_clicks_on_login_button_third_bcg() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Then User is the third");
	}
}
