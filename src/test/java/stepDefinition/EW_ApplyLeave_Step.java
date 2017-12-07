package stepDefinition;

import businessLogic.EW_ApplyLeave;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class EW_ApplyLeave_Step {

	@When("^User click on Submit leave request link$")
	public void user_click_on_Submit_leave_request_link() throws Exception {
		EW_ApplyLeave.clickSumbitLeaveRequest();
	}

	@Then("^Apply leave form open with label apply leave \"([^\"]*)\"$")
	public void apply_leave_form_open_with_label_apply_leave(String label) throws Exception {
		EW_ApplyLeave.verifyLeaveApplyLabel(label);
	}

	@When("^User select \"([^\"]*)\" from drop down$")
	public void user_select_from_drop_down(String leaveType) throws Exception {
		EW_ApplyLeave.selectLeaveFromDropDown(leaveType);
	}

	@And("^User select \"([^\"]*)\" from calender$")
	public void user_select_from_calender(String fromDate) throws Exception {
		EW_ApplyLeave.enterStartDate(fromDate);
	}

	@And("^User select \"([^\"]*)\" from calender1$")
	public void user_select_from_calender1(String endDate) throws Exception {
		EW_ApplyLeave.enterEndDate(endDate);
	}

	@And("^User select \"([^\"]*)\" from radio buttons$")
	public void user_select_from_radio_buttons(String fullOrHalfLeave)
			throws Exception {
		if(fullOrHalfLeave=="HalfDay")
		EW_ApplyLeave.clickHalfDayRadio();
		else
		EW_ApplyLeave.clickHalfDayRadio();
	}

	@And("^User enter \"([^\"]*)\" in text area$")
	public void user_enter_in_text_area(String remarks) throws Exception {
		EW_ApplyLeave.enterRemarks(remarks);
	}

	@And("^Click on Save draft button$")
	public void click_on_Save_draft_button() throws Exception {
		EW_ApplyLeave.clickSaveAsDraftButton();
	}

	@Then("^Users leave should be saved as draft \"([^\"]*)\"$")
	public void users_leave_should_be_saved_as_draft(String msg)
			throws Exception {
		EW_ApplyLeave.verifyDraftSavedMsg(msg);
	}
}
