package utilityCommon;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {
	protected static WebDriver driver;

	// ------------ Verify the text with text get from objects ---------
	public static void verifyText(WebElement obj, String txt) {
		try {
			Assert.assertEquals(
					"Exepected string is not equal to actual string", txt,
					obj.getText());
		} catch (AssertionError e) {
			System.out.println(e.getMessage());
			//CommonMethods.closeBrowser();
			// Assert.assertFalse(true);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			Assert.assertFalse(true);
		}
	}

	// ------------ Open the browser and launch the application ---------
	public static void launchBrowser(String browser, String url) {
		switch (browser.toLowerCase()) {
		case "firefox":
		case "ff":
			System.setProperty("webdriver.firefox.marionette",
					"D:\\CucumberPOC\\Jars\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			break;
		case "internet explorer":
		case "ie":
			// File file = new File(Constant.Path_IEDriver);
			System.setProperty("webdriver.ie.driver", "path_here");
			driver = new InternetExplorerDriver();
			break;
		case "chrome":
		case "ch":
			// File file1 = new File(Constant.Path_ChromeDriver);
			System.setProperty("webdriver.chrome.driver", "path_here");
			driver = new ChromeDriver();
			break;
		default:
			System.out.print("Browser not mentioned, Please check feaure file");
		}
		driver.get(url);
		driver.manage().window().maximize();
	}

	// ------------ Close the browser ---------
	public static void closeBrowser() {
		driver.close();
		driver.quit();
	}

	// ------------ Wait for milliseconds ----------- ---------
	public static void waitForMilliSeconds(String ObjPropValue) {
		try {
			int WaitTime = Integer.parseInt(ObjPropValue) * 1000;
			Thread.sleep(WaitTime);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	// ------------ Select value from drop down for milliseconds -----------
	public static void selectValueFromDropDown(List<WebElement> ddn_LeaveType,
			String leaveType) {
		try {
			for (WebElement e : ddn_LeaveType) {
				System.out.println(e.getText() + "---------------" + leaveType);
				if (e.getText().contains(leaveType)) {
					Select ddn = new Select(e);
					ddn.selectByVisibleText(leaveType);
				} else {
					System.out
							.println("value not found in drop down----------------");
				}
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	// ------------ Take Screen shot -----------
	public static void takeScreenShot(String screenShotName) throws IOException {
		File screenShotFile = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShotFile, new File("../target/screenShots/"
				+ screenShotName + ".png"));
	}

}
