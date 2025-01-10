package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	WebDriver driver;
	WebDriverWait wait;

	public WaitUtility(WebDriver driver) {
		this.driver = driver;
	}

	 public static void waitForClickable(WebDriver driver, WebElement element, long time) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
	        wait.until(ExpectedConditions.elementToBeClickable(element));
	    }

	public void waitForInVisibility(WebElement element, long time) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.invisibilityOf(element));
	}

	public void waitForSelected(WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}

	public void waitForVisibility(WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
	}

	public void waitForLoadingWindow(WebElement element, long time) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
