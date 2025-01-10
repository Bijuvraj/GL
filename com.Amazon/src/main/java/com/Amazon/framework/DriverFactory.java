package com.Amazon.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	private static String testcaseName;

	public DriverFactory() {
		setDriver();
	}

	private final void setDriver() {
		WebDriverManager.chromedriver().setup();
		driver.set(new ChromeDriver());

	}

	public static WebDriver getCurrentDriver() {
		return driver.get();
	}

	public static void closeBrowser() {
		// driver.get().close();
		//driver.get().quit();
		// driver.get().quit();
	}
}
