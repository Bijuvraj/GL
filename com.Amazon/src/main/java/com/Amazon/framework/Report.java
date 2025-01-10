package com.Amazon.framework;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Report {


	// public static ExtentTest test;
	public static ExtentReports report;
	public static ThreadLocal<ExtentTest> test1 = new ThreadLocal<ExtentTest>();

	public static void startReporting() {

//		try {
//			FileUtils.cleanDirectory(new File(System.getProperty("user.dir") + "\\Screenshots"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		report = new ExtentReports(
				System.getProperty("user.dir") + "\\test-output\\extentReport\\ExtentReportResults.html");

	}

	public static void startTest(String testcaseName) {
		test1.set(report.startTest(testcaseName));
		// test1.get()
		// test = report.startTest(testcaseName);
	}

	public static void endTest() {
		report.endTest(test1.get());
	}

	public static void endReporting() {
		report.flush();
	}

	public static void log(LogStatus logStatus, String msg) {

		test1.get().log(logStatus, msg);
		// test.log(logStatus, msg);
	}

	public static void log(LogStatus logStatus, String msg, String screenshotpath) {
		System.out.println(screenshotpath);
		test1.get().log(logStatus, msg, test1.get().addScreenCapture(screenshotpath));

	}

}
