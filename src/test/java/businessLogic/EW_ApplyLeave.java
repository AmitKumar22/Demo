package businessLogic;

import pageObjects.EW_ApplyLeave_PageObjects;
import utilityCommon.CommonMethods;

public class EW_ApplyLeave extends CommonMethods {

	public static EW_ApplyLeave clickSumbitLeaveRequest() {
		try {
			CommonMethods.waitForMilliSeconds("2");
			EW_ApplyLeave_PageObjects.lnk_SubmitLeaveRequest(driver).click();
		} catch (Exception ex) {
			System.out.print(ex.getMessage());
		}
		return new EW_ApplyLeave();
	}

	public static EW_ApplyLeave verifyLeaveApplyLabel(String txt) {
		try {
			CommonMethods.waitForMilliSeconds("2");
			CommonMethods.verifyText(
					EW_ApplyLeave_PageObjects.lbl_LeaveRequest(driver), txt);
		} catch (Exception ex) {
			System.out.print(ex.getMessage());
		}
		return new EW_ApplyLeave();
	}

	public static EW_ApplyLeave selectLeaveFromDropDown(String leaveType) {
		try {
			CommonMethods.waitForMilliSeconds("5");
			CommonMethods.selectValueFromDropDown(
					EW_ApplyLeave_PageObjects.ddn_LeaveType(driver), leaveType);
		} catch (Exception ex) {
			System.out.print(ex.getMessage());
		}
		return new EW_ApplyLeave();
	}

	public static EW_ApplyLeave enterStartDate(String fromDate) {
		try {
			CommonMethods.waitForMilliSeconds("2");
			EW_ApplyLeave_PageObjects.txtbox_StartDate(driver).sendKeys(
					fromDate);
			EW_ApplyLeave_PageObjects.txtarea_Remarks(driver).click();
		} catch (Exception ex) {
			System.out.print(ex.getMessage());
		}
		return new EW_ApplyLeave();
	}

	public static EW_ApplyLeave enterEndDate(String endDate) {
		try {
			CommonMethods.waitForMilliSeconds("2");
			EW_ApplyLeave_PageObjects.txtbox_EndDate(driver).sendKeys(endDate);
			EW_ApplyLeave_PageObjects.txtarea_Remarks(driver).click();
		} catch (Exception ex) {
			System.out.print(ex.getMessage());
		}
		return new EW_ApplyLeave();
	}

	public static EW_ApplyLeave clickHalfDayRadio() {
		try {
			CommonMethods.waitForMilliSeconds("2");
			EW_ApplyLeave_PageObjects.rad_HalfDay(driver).click();
		} catch (Exception ex) {
			System.out.print(ex.getMessage());
		}
		return new EW_ApplyLeave();
	}

	public static EW_ApplyLeave enterRemarks(String remarks) {
		try {
			CommonMethods.waitForMilliSeconds("2");
			EW_ApplyLeave_PageObjects.txtarea_Remarks(driver).sendKeys(remarks);
		} catch (Exception ex) {
			System.out.print(ex.getMessage());
		}
		return new EW_ApplyLeave();
	}

	public static EW_ApplyLeave clickSaveAsDraftButton() {
		try {
			CommonMethods.waitForMilliSeconds("2");
			EW_ApplyLeave_PageObjects.btn_SaveAsDraft(driver).click();
		} catch (Exception ex) {
			System.out.print(ex.getMessage());
		}
		return new EW_ApplyLeave();
	}

	public static EW_ApplyLeave verifyDraftSavedMsg(String msg) {
		try {
			CommonMethods.waitForMilliSeconds("2");
			CommonMethods.verifyText(
					EW_ApplyLeave_PageObjects.toast_DraftSaved(driver), msg);
			CommonMethods.waitForMilliSeconds("5");
		} catch (Exception ex) {
			System.out.print(ex.getMessage());
		}
		return new EW_ApplyLeave();
	}
}
