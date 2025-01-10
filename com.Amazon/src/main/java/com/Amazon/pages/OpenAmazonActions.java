package com.Amazon.pages;

import org.openqa.selenium.WebDriver;

import com.Amazon.utilities.CommonTestDataUtils;



public class OpenAmazonActions extends BaseActions{

	private WebDriver driver;
	private CommonTestDataUtils testDta = new CommonTestDataUtils();
	private String testCaseName = null;
	
	public OpenAmazonActions(WebDriver driver, String testcaseName) {
		this.driver = driver;
		this.testCaseName = testcaseName;

	}
	
	public void openAmazon() {
		loadAUT(driver);
	}
}
