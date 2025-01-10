package com.Amazon.testcase;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Amazon.framework.BaseTest;
import com.Amazon.framework.DriverFactory;
import com.Amazon.pages.OpenAmazonActions;


public class OpenAmazonTest extends BaseTest {

	@Test
	public void openAmazon(Method method) {
		DriverFactory driverFactory = new DriverFactory();
		WebDriver driver = driverFactory.getCurrentDriver();
		String testcaseName = method.getName();
		
		OpenAmazonActions openAmazonActions =new OpenAmazonActions(driver, testcaseName);
		openAmazonActions.loadAUT(driver);
	}
}
