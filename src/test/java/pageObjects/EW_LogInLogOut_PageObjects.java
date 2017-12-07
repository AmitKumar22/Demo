package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EW_LogInLogOut_PageObjects {
	private static WebElement element = null;
	
	// --------------- logged in user image locator ----------------------
	public static WebElement img_LoggedUser(WebDriver driver) {
		element = driver.findElement(By.id("userImage"));
		return element;
	}
	
	// --------------- Logout link menu locator ----------------------
	public static WebElement lnk_LogOut(WebDriver driver) {
		element = driver.findElement(By.linkText("Log Out"));
		return element;
	}
	
	// --------------- Login page text heading locator ----------------------
	public static WebElement txt_LoginPage(WebDriver driver) {
		element = driver.findElement(By.id("ctl00_ContentPlace_lbLoginText"));
		return element;
	}
}
