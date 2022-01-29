package com.main;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.util.ExtentReporter;

public class MyListeners  implements ITestListener{
	ExtentReports extent;
	ExtentTest test;
	
	@Override
	public void onStart(ITestContext context) {
		System.out.println("This is Starting of "+ context.getName());
		 extent = ExtentReporter.createReport();
		 test = extent.startTest(context.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("My Test "+result.getName()+"is Successful");
		test.log(LogStatus.PASS, result.getName() + " is passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("My Test "+result.getName()+"is Fail");
		test.log(LogStatus.FAIL, result.getName() + " is fail");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("My Test "+result.getName()+"is Skipped");
		test.log(LogStatus.SKIP, result.getName() + " is Skipped");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("This is End ");
		extent.endTest(test);
		extent.flush();
	}

}
