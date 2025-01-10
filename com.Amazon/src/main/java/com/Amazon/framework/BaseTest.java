package com.Amazon.framework;

import java.io.File;
import java.lang.reflect.Method;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Amazon.utilities.PropertyUtilities;
import com.relevantcodes.extentreports.LogStatus;

public class BaseTest {

	@BeforeSuite(alwaysRun=true)
	public void init() {
		PropertyUtilities pro = new PropertyUtilities();
		Report.startReporting();


	}

	@AfterSuite(alwaysRun=true)
	public void after() {
		Report.endReporting();
	}

	@BeforeClass(alwaysRun=true)
	public void test01(ITestContext i) {
		System.out.println("Class name " + this.getClass().getSimpleName());
	}

	@BeforeMethod(alwaysRun=true)
	public void getMethodName(Method method) {
		System.out.println("Test case " + method.getName() + " Starts execution");
		Report.startTest(method.getName());

	}

	@AfterMethod(alwaysRun=true)
	public void finishTest(ITestResult result) {
		
		System.out.println("Test case " + result.getMethod().getMethodName() + " Ends execution");
		String destination="";

		if (ITestResult.FAILURE == result.getStatus()) {
			
			
			TakesScreenshot ts = (TakesScreenshot) DriverFactory.getCurrentDriver();
			File source = ts.getScreenshotAs(OutputType.FILE);
			destination=System.getProperty("user.dir")+"\\Screenshots\\" + result.getName() +".jpeg";
			File screenshot=new File(destination);

			try {
				FileHandler.copy(source, screenshot);
				System.out.println("Screenshot taken");
				
			} catch (Exception e) {
				System.out.println("Exception while taking screenshot " + e.getMessage());
			}
			Report.log(LogStatus.FAIL, result.getName(),destination);
		}
		
		Report.endTest();
		DriverFactory.closeBrowser();
	}
}
