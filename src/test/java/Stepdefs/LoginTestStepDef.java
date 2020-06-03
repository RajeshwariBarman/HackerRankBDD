package Stepdefs;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.ExtentTestManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestStepDef extends Base.TestBase {

	// WebDriver driver ;


	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() {

		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajeshwari\\Downloads\\chromedriver_win32_latest\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.hackerrank.com/dashboard");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ExtentTestManager.logInfo("Browser is launched");

	}

	@When("^title of login page is Hacker rank$")
	public void title_of_login_page_is_Hacker_rank() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User is in the title page");
		String title = driver.getTitle();
		System.out.println(title);
		ExtentTestManager.logInfo("Title of the page ="+title);
		ExtentTestManager.addScreenShots();
	}

	@Then("^user enters \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_enters_and(String uname, String pass, String search) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("TEST DATA " + search);
		driver.findElement(By.xpath("//button[text() = 'Log In']")).click();
		driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys(pass);
		ExtentTestManager.logInfo("User Name is passed = "+uname);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//span[@class = 'ui-text' and text() = 'Log In']")).click();
		try {
			driver.findElement(By.xpath("//a/span[text() = 'rajeshwariBarman']")).isDisplayed();
			System.out.println("Logged in Sucessfully");
			ExtentTestManager.logPass("Login is passed");
			ExtentTestManager.addScreenShots();

			
		} catch (Exception e) {
			System.out.println("Logged in is not Sucessfull");
			// result.onTestFail();;
			Assert.fail();
		}

		// System.out.println("After the catch Even after exception is getting
		// printed");
	}

	@Then("^user search \"(.*)\" in tab$")
	public void user_search_in_tab(String search) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("in the search item method  " + search);
		Thread.sleep(4000);
		// System.out.println("The CSS VALUE "+driver.findElement(By.xpath("//i["
		// + "@class = 'dropdown-icon ui-icon-notification']")).getCssValue("display"));
		driver.findElement(By.xpath("//input[@placeholder ='Search']")).sendKeys(search);
		ExtentTestManager.logPass("Item is searched = "+search);
		ExtentTestManager.addScreenShots();
		Thread.sleep(4000);
//		driver.close();
	}

	@Then("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
		ExtentTestManager.logInfo("Site is  launched");
		ExtentTestManager.addScreenShots();
//		driver.close();
	}

}
