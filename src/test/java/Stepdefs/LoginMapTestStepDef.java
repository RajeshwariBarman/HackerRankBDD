//package Stepdefs;
//
//
//import java.util.List;
//import java.util.Map;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//
//public class LoginMapTestStepDef {
//	
//WebDriver driver ; 
//	
//	@Given("^user is already on Login Page$")
//	public void user_is_already_on_Login_Page() {
//	    // Write code here that turns the phrase above into concrete actions
//		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajeshwari\\Downloads\\chromedriver_win32_latest\\chromedriver.exe");
//		 driver = new ChromeDriver();
//		 driver.get("https://www.hackerrank.com/dashboard");
//		 driver.manage().window().maximize();
//		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//	    
//	}
//
//	@When("^title of login page is Hacker rank$")
//	public void title_of_login_page_is_Hacker_rank() {
//	    // Write code here that turns the phrase above into concrete actions
//		 String title  = driver.getTitle();
//		 System.out.println(title);
//	}
//	
//	
//	
//	@Then("^user enters username and password$")
//	public void user_enters_username_and_password(io.cucumber.datatable.DataTable data1) {
// 
//		List<Map<String,String>> dat  = data1.asMaps(String.class , String.class);
//		
//		for(int i = 0 ; i < dat.size() ; i++)
//		{
//			driver.findElement(By.xpath("//button[text() = 'Log In']")).click();
//			driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys(dat.get(i).get("user"));
//			driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys(dat.get(i).get("pass"));
//			
//		}
//		
//	}
//	
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button() {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.xpath("//span[@class = 'ui-text' and text() = 'Log In']")).click();
//	}
//
//	@Then("^user search item in tab$")
//	public void user_search_item_in_tab(io.cucumber.datatable.DataTable dataTable) {
//
//	}
//
//}
