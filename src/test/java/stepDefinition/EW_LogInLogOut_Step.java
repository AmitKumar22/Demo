package stepDefinition;

import java.util.List;

import businessLogic.EW_LogInLogOut;
import cucumber.api.DataTable;
import cucumber.api.java.en.*;
public class EW_LogInLogOut_Step {
	EW_LogInLogOut login;

	@Given("^User logged into the application$")
	public void user_logged_into_the_application() throws Exception {
		login = new EW_LogInLogOut();
	}

	@When("^User click on Upper rightside image$")
	public void user_click_on_Upper_rightside_image() throws Exception {
		login = new EW_LogInLogOut();
		System.out.print("Before User Image Clicked");
		login.clickUserImage();
		System.out.print("After User Image Clicked");
	}

	@And("^User click on Logout link from menu$")
	public void user_click_on_Logout_link_from_menu() throws Exception {
		System.out.print("Before Loggedout Clicked");
		login.clickLogOut();
		System.out.print("After Loggedout Clicked");
	}

	@Then("^User should be logged out from application$")
	public void user_should_be_logged_out_from_application(DataTable arg1) throws Exception {
		List<List<String>> data = arg1.raw();
		System.out.print("Before verify login test ");
	    login.verifyLoginPageText(data.get(1).get(0));
	    System.out.print("After verify login test ");
	}
}
