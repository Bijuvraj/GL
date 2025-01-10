package com.Amazon.pages;

import org.openqa.selenium.WebDriver;

import com.Amazon.utilities.PropertyUtilities;
import com.Amazon.utilities.SeleniumUtility;



public class BaseActions extends SeleniumUtility {


	public static void loadAUT(WebDriver driver) {

		driver.get(PropertyUtilities.getPropertyValue("Url"));
		driver.manage().window().maximize();
	}

	public final String testcaseName = null;

}
