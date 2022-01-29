package com.util;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentReporter {
	
	public static ExtentReports extent;
	public static ExtentReports createReport() {
		extent = new ExtentReports("/home/shailthesweeter/eclipse-workspace/simplelearn-maven/report/MyFirstReport.html");
		return extent;
	}
	

}
