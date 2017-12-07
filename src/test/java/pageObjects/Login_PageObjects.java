package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_PageObjects {
	private static WebElement element = null;

	// --------------- User name text box locator ----------------------
	public static WebElement txtbox_UserName(WebDriver driver) {
		element = driver.findElement(By.name("username"));
		return element;
	}

	// --------------- Client text box locator ----------------------
	public static WebElement txtbox_ClientName(WebDriver driver) {
		element = driver.findElement(By.name("client"));
		return element;
	}

	// --------------- Password locator ----------------------
	public static WebElement txtbox_Password(WebDriver driver) {
		element = driver.findElement(By.name("password"));
		return element;
	}

	// --------------- Login button locator ----------------------
	public static WebElement btn_Login(WebDriver driver) {
		element = driver.findElement(By.xpath("//button"));
		return element;
	}

	// --------------- Toast message locator ----------------------
	public static WebElement toast_Message(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='toast-container']/div"));
		return element;
	}
}
