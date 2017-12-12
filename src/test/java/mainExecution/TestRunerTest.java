package mainExecution;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import com.cucumber.listener.Reporter;
//import com.cucumber.listener.ExtentCucumberFormatter;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/feature/1 (3).feature", glue = { "stepDefinition" }, plugin = {
		"json:target/cucumber.json", "com.cucumber.listener.ExtentCucumberFormatter:target/report.html" })
public class TestRunerTest {

	@AfterClass
	public static void teardown() {
		Reporter.loadXMLConfig(new File("src/test/java/extent-config.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Win 8");
		Reporter.setTestRunnerOutput("Sample test runner output message");
	}
}