package utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


import constants.Constants;

public class ScreenShot {
	static TakesScreenshot takescreenshot;

	public static void takeScreenShot(WebDriver driver, String imageName) {
		try {
			String timeStamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());
			takescreenshot = (TakesScreenshot) driver;
			File screenshot = takescreenshot.getScreenshotAs(OutputType.FILE);
			String destination = Constants.SCREENSHOT_FILE_PATH + imageName + "_+" + timeStamp + ".png";
			File finalDestination = new File(destination);
			FileHandler.copy(screenshot, finalDestination);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
