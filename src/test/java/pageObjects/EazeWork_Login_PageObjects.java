package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EazeWork_Login_PageObjects {

	private static WebElement element = null;

	// --------------- comp url text box locator ----------------------
	public static WebElement txtbox_CompURL(WebDriver driver) {
		element = driver.findElement(By.id("txtEmailAddress"));
		return element;
	}
	
	// --------------- user name text box locator ----------------------
	public static WebElement txtbox_UserName(WebDriver driver) {
		element = driver.findElement(By.id("Login"));
		return element;
	}
	
	// --------------- password text box locator ----------------------
	public static WebElement txtbox_Password(WebDriver driver) {
		element = driver.findElement(By.id("Password"));
		return element;
	}
	
	// --------------- login button locator ----------------------
	public static WebElement btn_Login(WebDriver driver) {
		element = driver.findElement(By.id("ctl00_ContentPlace_btnLogin"));
		return element;
	}
	
	// --------------- toast error message locator ----------------------
	public static WebElement txt_Message(WebDriver driver) {
		element = driver.findElement(By.xpath("//body[@id='dashboard']/div/span[3]"));
		return element;
	}
	
	// --------------- Logged in user name locator ----------------------
	public static WebElement txt_LoggedUserName(WebDriver driver) {
		element = driver.findElement(By.id("userName"));
		return element;
	}
}
