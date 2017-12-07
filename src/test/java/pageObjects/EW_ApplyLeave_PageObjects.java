package pageObjects;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EW_ApplyLeave_PageObjects {

	private static WebElement element = null;

	// --------------- submit leave request link locator ----------------------
	public static WebElement lnk_SubmitLeaveRequest(WebDriver driver) {
		element = driver.findElement(By
				.xpath("//a[contains(text(),'Submit Leave Request')]"));
		return element;
	}

	// --------------- leave request heading locator ----------------------
	public static WebElement lbl_LeaveRequest(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='appContainer']/h3"));
		return element;
	}

	// --------------- leave type drop down locator ----------------------
	public static List<WebElement> ddn_LeaveType(WebDriver driver) {
		List<WebElement> myElements = driver.findElements(By.id("ddlLeaveType"));
		return myElements;
	}

	// --------------- start date text box locator ----------------------
	public static WebElement txtbox_StartDate(WebDriver driver) {
		element = driver.findElement(By.id("txtStartDate"));
		return element;
	}

	// --------------- end date text box locator ----------------------
	public static WebElement txtbox_EndDate(WebDriver driver) {
		element = driver.findElement(By.id("txtEndDate"));
		return element;
	}

	// --------------- end date text box locator ----------------------
	public static WebElement txtarea_Remarks(WebDriver driver) {
		element = driver.findElement(By.id("txtRemarks"));
		return element;
	}

	// --------------- half day radio button locator ----------------------
	public static WebElement rad_HalfDay(WebDriver driver) {
		element = driver.findElement(By.id("chkHalfDay"));
		return element;
	}

	// --------------- full day radio button locator ----------------------
	public static WebElement rad_FullDay(WebDriver driver) {
		element = driver.findElement(By.id("chkFullDay"));
		return element;
	}

	// --------------- save as draft button locator ----------------------
	public static WebElement btn_SaveAsDraft(WebDriver driver) {
		element = driver.findElement(By.id("btnSave"));
		return element;
	}

	// --------------- draft saved message button locator ----------------------
	public static WebElement toast_DraftSaved(WebDriver driver) {
		element = driver.findElement(By
				.xpath("//body[@id='dashboard']/div/span[3]"));
		return element;
	}
}
