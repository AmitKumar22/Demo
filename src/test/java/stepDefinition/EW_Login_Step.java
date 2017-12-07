package stepDefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;

import utilityCommon.CommonMethods;
import businessLogic.EW_Login;
import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class EW_Login_Step {

	public WebDriver driver;
	EW_Login login;

	@Given("^Launch browser and open application$")
	public void launch_browser_and_open_application(DataTable arg1)
			throws Exception {
		login = new EW_Login();
		List<List<String>> data = arg1.raw();
		CommonMethods.launchBrowser(data.get(1).get(0), data.get(1).get(1));
	}

	@When("^User enter comp URL \"([^\"]*)\"$")
	public void user_enter_comp_URL(String compURL) throws Exception {
		login.enterCompUrl(compURL);
	}

	@And("^User enter user name \"([^\"]*)\"$")
	public void user_enter_user_name(String userName) throws Exception {
		login.enterUserName(userName);
	}

	@And("^User provide password \"([^\"]*)\"$")
	public void user_provide_password(String passWord) throws Exception {
		login.enterPassword(passWord);
	}

	@And("^User click on Login button$")
	public void user_click_on_Login_button() throws Exception {
		login.clickLogin();
	}

	@Then("^User verify the Error message \"([^\"]*)\"$")
	public void user_verify_the_Error_message(String errMsg) throws Exception {
		login.verifyErrorMsg(errMsg);
	}

	@Then("^Close opened browser$")
	public void close_opened_browser() throws Exception {
		CommonMethods.closeBrowser();
	}

	@When("^User enter comp URL, userName and passWord$")
	public void user_enter_comp_URL_userName_and_passWord(DataTable arg1)
			throws Exception {
		List<List<String>> data = arg1.raw();
		System.out.print(data.get(1).get(0));
		login.enterCompUrl(data.get(1).get(0));
		login.enterUserName(data.get(1).get(1));
		login.enterPassword(data.get(1).get(2));
	}

	@Then("^User verify logged in user loggedInUser$")
	public void user_verify_logged_in_user_loggedInUser(DataTable arg1)
			throws Exception {
		//login = new EW_Login(driver);
		List<List<String>> data = arg1.raw();
		login.verifyLoggedInUser(data.get(1).get(0));
	}
}
