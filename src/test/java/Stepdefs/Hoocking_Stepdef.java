package Stepdefs;

import org.junit.Assert;

import com.aventstack.extentreports.Status;

import Base.ExtentManager;
import Base.ExtentTestManager;
import Base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.AssertionFailedError;

public class Hoocking_Stepdef extends TestBase {
	
	protected Scenario scenario; 
	static String scname;
	
	{
//		Assert.fail();
		System.out.println("this is hook initialse block");
		
	}
	@Before()
	public void setup3(Scenario sc)
	{
//		Assert.fail();
		System.out.println("This is setup 3");
		System.out.println("Scenario Name ="+sc.getName());
		System.out.println("Scenario ="+sc);
		System.out.println("Scenario ID ="+sc.getId());
		System.out.println("Scenario Line ="+sc.getLine());
		System.out.println("Scenario Status in Before ="+sc.getStatus());
		System.out.println("Scenario URI ="+sc.getUri());
		System.out.println("Scenario Tags ="+sc.getSourceTagNames());
		this.scenario = sc;
		scname = sc.getName();
		ExtentTestManager.startTest(scname);
		ExtentTestManager.getTest().log(Status.INFO,"Scenario started = "+scname);
	}
	
	@Before(order = -2)
	public void setup()
	{
//		Assert.fail();
		System.out.println("This is setup 1");
	}
	
	
	
	@Before(order = 200)
	public void setup2()
	{
		//Assert.fail();
		System.out.println("This is setup 2");
	}
	
	@After()
	public void ctearup(Scenario sc)
	{
		System.out.println("This is tearup 1");
		System.out.println("Scenario Status in After ="+sc.getStatus());
		if(sc.isFailed())
		{
			ExtentTestManager.logFail("Scenario Failed");
			ExtentTestManager.addScreenShotsOnFailure();
		}else
		{
			ExtentTestManager.logPass("Sceanrio Passed");
			System.out.println("SYSTEM ENV =" +System.getenv());
		}
		ExtentManager.getReporter().flush();
		if(driver != null)
		   driver.close();
		
	}
	
	@After(order = -100)
	public void aatearup()
	{
		//Assert.fail();
		System.out.println("This is tearup 3");
	}
	
	@After(order = 50000)
	public void atearup2()
	{
		//Assert.fail();
		System.out.println("This is tearup 2");
	}
	
	
	
	@Given("user is first")
	public void user_is_first() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.print("This is first given");
	}

	@When("title of login page is first")
	public void title_of_login_page_is_first() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.print("This is first when");
	}

	@Then("user clicks on login button first")
	public void user_clicks_on_login_button_first() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.print("This is first then");
	}

	@Given("user is second")
	public void user_is_second() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.print("This is second given");
	}

	@When("title of login page is second")
	public void title_of_login_page_is_second() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.print("This is seocnd when");
	}

	@Then("user clicks on login button second")
	public void user_clicks_on_login_button_second() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.print("This is second then");
	}

	@Given("user is third")
	public void user_is_third() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.print("This is third given");
	}

	@When("title of login page is third")
	public void title_of_login_page_is_third() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.print("This is third when");
	}

	@Then("user clicks on login button third")
	public void user_clicks_on_login_button_third() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.print("This is third then");
	}


}
