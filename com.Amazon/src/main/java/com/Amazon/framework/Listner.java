package com.Amazon.framework;

import org.testng.ITestResult;

public class Listner {

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
	//	Report.log(LogStatus.PASS, result.getMethod().getMethodName());
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	//	Report.log(LogStatus.FAIL, result.getThrowable().toString());
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
	//	Report.log(LogStatus.FAIL, result.getThrowable().toString());
	}
}
