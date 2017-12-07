package businessLogic;

import pageObjects.EW_Login_PageObjects;
import utilityCommon.CommonMethods;

public class EW_Login extends CommonMethods {

	public EW_Login enterCompUrl(String compURL) {
		try {
			CommonMethods.waitForMilliSeconds("2");
			EW_Login_PageObjects.txtbox_CompURL(driver).sendKeys(compURL);
		} catch (Exception ex) {
			System.out.print(ex.getMessage());
		}
		return new EW_Login();
	}

	public EW_Login enterUserName(String userName) {
		try {
			CommonMethods.waitForMilliSeconds("2");
			EW_Login_PageObjects.txtbox_UserName(driver).sendKeys(userName);
		} catch (Exception ex) {
			System.out.print(ex.getMessage());
		}
		return new EW_Login();
	}

	public EW_Login enterPassword(String passWord) {
		try {
			CommonMethods.waitForMilliSeconds("2");
			EW_Login_PageObjects.txtbox_Password(driver).sendKeys(passWord);
		} catch (Exception ex) {
			System.out.print(ex.getMessage());
		}
		return new EW_Login();
	}

	public EW_Login clickLogin() {
		try {
			CommonMethods.waitForMilliSeconds("2");
			EW_Login_PageObjects.btn_Login(driver).click();
		} catch (Exception ex) {
			System.out.print(ex.getMessage());
		}
		return new EW_Login();
	}

	public EW_Login verifyErrorMsg(String errMsg) {
		try {
			CommonMethods.waitForMilliSeconds("2");
			CommonMethods.verifyText(EW_Login_PageObjects.txt_Message(driver),
					errMsg);

		} catch (Exception ex) {
			System.out.print(ex.getMessage());
		}
		return new EW_Login();
	}

	public EW_Login verifyLoggedInUser(String string) {
		try {
			CommonMethods.waitForMilliSeconds("2");
			CommonMethods.verifyText(
					EW_Login_PageObjects.txt_LoggedUserName(driver), string);

		} catch (Exception ex) {
			System.out.print(ex.getMessage());
		}
		return new EW_Login();
	}
}
