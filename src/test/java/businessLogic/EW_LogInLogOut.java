package businessLogic;

import pageObjects.EW_LogInLogOut_PageObjects;
import utilityCommon.CommonMethods;

public class EW_LogInLogOut extends CommonMethods {

	public EW_LogInLogOut clickUserImage() {
		try {
			CommonMethods.waitForMilliSeconds("5");
			EW_LogInLogOut_PageObjects.img_LoggedUser(driver).click();
		} catch (Exception ex) {
			System.out.print(ex.getMessage());
		}
		return new EW_LogInLogOut();
	}

	public EW_LogInLogOut clickLogOut() {
		try {
			CommonMethods.waitForMilliSeconds("2");
			EW_LogInLogOut_PageObjects.lnk_LogOut(driver).click();
		} catch (Exception ex) {
			System.out.print(ex.getMessage());
		}
		return new EW_LogInLogOut();
	}

	public EW_LogInLogOut verifyLoginPageText(String verifyText) {
		try {
			CommonMethods.verifyText(
					EW_LogInLogOut_PageObjects.img_LoggedUser(driver),
					verifyText);
		} catch (Exception ex) {
			System.out.print(ex.getMessage());
		}
		return new EW_LogInLogOut();
	}
}
