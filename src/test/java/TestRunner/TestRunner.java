package TestRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features/Login.feature",
//		features = ".", 
                  glue = {"Stepdefs"},
//                  tags = {"@abc" ,"@test"},
//                 tags = {"not @ignore"},
                     plugin = { "pretty", "html:target/cucumber-html-reports", 
              		  "json:target/cucumber.json"},
                  dryRun =  false )
public final class TestRunner {
 
}
