package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	WebDriver driver;
	Select select;
	Actions actions;
	JavascriptExecutor js;

	public PageUtility(WebDriver driver) {
		this.driver = driver;
		js = (JavascriptExecutor) driver;
	}

	public void select_ByIndex(WebElement element, int index) {
		select = new Select(element);
		select.selectByIndex(index);
	}

	public void select_ByValue(WebElement element, String value) {
		select = new Select(element);
		select.selectByValue(value);
	}

	public void slect_ByVisibleText(WebElement element, String Text) {
		select = new Select(element);
		select.selectByVisibleText(Text);
	}

	public void mouse_Move(WebElement element) {
		actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
	}

	public void mouseMoveAndClick(WebElement element) {
		actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
		actions.click().build().perform();
	}

	public void javaScriptClick(WebElement element) {
		js.executeScript("arguments[0].click();", element);
	}

	public void scrollAndClick(WebElement element) {
		int y = 0;
		while (!isClicked(element)) {
			js.executeScript("window.scrollBy(0," + y + ")");
			y = y + 3;
		}
	}

	public void clickBack_Space(WebElement element) {
		element.sendKeys(Keys.BACK_SPACE);
	}

	public boolean isClicked(WebElement element) {
		try {
			element.click();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public void scrollDownandClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
		//js.executeScript("arguments[0].scrollIntoView();", element);
	}
}
