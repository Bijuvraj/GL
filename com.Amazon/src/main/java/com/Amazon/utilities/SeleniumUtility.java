package com.Amazon.utilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.github.javafaker.Faker;

public class SeleniumUtility {

	public static String testcaseName = null;

	public void jsactionClick(ElementFormatter element, WebDriver driver) {
		Actions action = new Actions(driver);
		// WebElement webElement=getWebElement(element,driver);
		// action.moveToElement(getWebElement(element,driver)).click();

		Actions ob = new Actions(driver);
		ob.click(getWebElement(element, driver));
		Action action1 = ob.build();
		action1.perform();
	}

	/**
	 * Method to click on a webelement
	 * 
	 * @param element
	 * @param driver
	 */

	public void clickonElement(ElementFormatter element, WebDriver driver) {

		WebDriverWait wait = seleniumWait(driver);
		wait.until(ExpectedConditions.elementToBeClickable(getWebElement(element, driver)));
		getWebElement(element, driver).click();

	}

	public void scrollDown(WebDriver driver, ElementFormatter el) {
		WebElement element = getWebElement(el, driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,600)", "");
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	
	public WebDriverWait seleniumWait(WebDriver driver) {
        return new WebDriverWait(driver, Duration.ofSeconds(40));
}

	/**
	 * Method to click on a webelement
	 * 
	 * @param element
	 * @param driver
	 */
	public void clickonElement(WebElement element, WebDriver driver) {

		WebDriverWait wait = seleniumWait(driver);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();

	}

	/**
	 * Method to type a value in a text field
	 * 
	 * @param element
	 * @param value
	 * @param driver
	 */
	public void type(ElementFormatter element, String value, WebDriver driver) {

		getWebElement(element, driver).sendKeys(value);
	}
	
	public void enter(ElementFormatter element, String value, WebDriver driver) {
		type(element, value, driver);
		
	}
	
	public void clear(ElementFormatter element,  WebDriver driver) {
		getWebElement(element, driver).clear();
	}

	/**
	 * Method to get the web element
	 * 
	 * @param element
	 * @param driver
	 * @return
	 */
	public WebElement getWebElement(ElementFormatter element, WebDriver driver) {

		String type = element.getElementType();

		switch (type) {
		case "XPATH": {
			return driver.findElement(By.xpath(element.getElementValue().trim()));
		}
		case "ID": {
			return driver.findElement(By.id(element.getElementValue().trim()));
		}
		}
		return null;

	}

	public List<WebElement> getWebElements(ElementFormatter element, WebDriver driver) {

		String type = element.getElementType();

		switch (type) {
		case "XPATH": {
			return driver.findElements(By.xpath(element.getElementValue().trim()));
		}
		case "ID": {
			return driver.findElements(By.id(element.getElementValue().trim()));
		}
		}
		return null;

	}

	public void driverWait(WebElement ele, WebDriver driver) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		    // Wait for the element to be visible
		 wait.until(ExpectedConditions.visibilityOfAllElements(ele));
	}

	public boolean isElementVisible(ElementFormatter element, WebDriver driver) {
		
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40)); // Waiting for 40 seconds
        WebElement webElement = getWebElement(element, driver);
        wait.until(ExpectedConditions.visibilityOf(webElement));
        return webElement.isDisplayed();
}

	/**
	 * @param elemnt
	 * @param option
	 * @param driver
	 */
	public void selectFromDopDown(ElementFormatter elemnt, String opt, WebDriver driver) {
		Select select = new Select(getWebElement(elemnt, driver));
		int index = 0;

		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++) {
			if (options.get(i).getText().equalsIgnoreCase(opt)) {
				index = i;
				break;
			}
		}
		select.selectByIndex(index);

	}

	/**
	 * Method to select checkbox
	 * 
	 * @param element
	 * @param driver
	 */
	public void selectCheckBox(ElementFormatter element, WebDriver driver) {
		getWebElement(element, driver).click();
	}

	/**
	 * Method to validate the checkbox is selected
	 * 
	 * @param element
	 * @param driver
	 * @return
	 */
	public boolean isCheckBoxSelected(ElementFormatter element, WebDriver driver) {
		return getWebElement(element, driver).isSelected();
	}

	/**
	 * Method to validate wheather element is enabled or not
	 * 
	 * @param element
	 * @param driver
	 * @return
	 */
	public boolean isWebelementActive(ElementFormatter element, WebDriver driver) {
		return getWebElement(element, driver).isEnabled();
	}

	public void enterDate(ElementFormatter element, String date, WebDriver driver) {

		type(element, date, driver);
		getWebElement(element, driver).sendKeys(Keys.TAB);

	}

	public void waitForcefully(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	public String getTextDisplayed(ElementFormatter elem, WebDriver driver) {
		WebElement element = getWebElement(elem, driver);
		return element.getText();
	}
	
	public String getTitle(WebDriver driver) {
		return driver.getTitle();
	}
	
	public void click(ElementFormatter elemen, WebDriver driver) {
		getWebElement(elemen, driver).click();
	}
	
	public void typedate(ElementFormatter element, String date, WebDriver driver) {
		type(element, date, driver);
		getWebElement(element, driver).sendKeys(Keys.TAB);
	}
	
	public static String getRandomFirstName() {
		Faker faker = new Faker();
		return faker.name().firstName();
	}

	public static String getRandomMobileNumber() {
		Faker faker = new Faker();
		return faker.phoneNumber().cellPhone();
	}
	
	public static String getRandomAddress() {
		Faker faker = new Faker();
		return faker.address().streetAddress();
	}
	
	public static String getRandomCity() {
		Faker faker = new Faker();
		return faker.color().name();
	}
	public static String getRandomState() {
		Faker faker = new Faker();
		return faker.university().name();
	}
	
	public static String getRandonNumber() {
		Faker faker= new Faker();
		return faker.number().digit();
	}
	public static String getRandomNumbers() {
		Faker faker= new Faker();
		return faker.bothify("#####").toString();
	}
	
	public static String getRandomDate() {
		Faker faker= new Faker();
		return faker.date().toString();
	}

	/*public void chooseDate(String date,WebDriver driver)

	{

		String split[]=date.split("-");

		String day = split[0];

		String year = split[2];

		int m = Integer.parseInt(split[1]);

		int y = Integer.parseInt(split[2]);

		String month="";

		switch (m) {

				case 01:

					month = "January";

					break;

				case 2:

					month = "February";

					break;

				case 3:

					month = "March";

					break;

				case 4:

					month = "April";

					break;

				case 5:

					month = "May";

					break;

				case 6:

					month = "June";

					break;

				case 7:

					month = "July";

					break;

				case 8:

					month = "August";

					break;

				case 9:

					month = "September";

					break;

				case 10:

					month = "October";

					break;

				case 11:

					month = "November";

					break;

				case 12:

					month = "December";

					break;

				default:

					break;

				}

			

		click(AddEmployeeLocators.ADD_EMPLOYEE_JOINING_DATE,driver);

		String month_Year=month+" "+year;

		while(true)

		{

			String currentmonth = getTextDisplayed(AddEmployeeLocators.CURRENT_MONTH_AND_YEAR_IN_DOJ_CALENDER, driver);

			if(currentmonth.equals(month_Year))

			{

				break;

			}

			else if (y==2025)

			{

				if(m<2)

				{

					click(AddEmployeeLocators.PREVIOUS_BTN_IN_DOJ_CALENDER,driver);

				}

				else 

				{

					click(AddEmployeeLocators.NEXT_BTN_IN_DOJ_CALENDER,driver);

				}

			}

			else if (y< 2025)

			{

				click(AddEmployeeLocators.PREVIOUS_BTN_IN_DOJ_CALENDER,driver);

			}

			else if(y>2025)

			{

				click(AddEmployeeLocators.NEXT_BTN_IN_DOJ_CALENDER,driver);

			}

			}

		WebElement elemen = driver.findElement(By.xpath("//td[text()='"+day+"'and@class='day']"));

		elemen.click();

		}*/
}
