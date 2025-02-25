package org.abdul.TestUtils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {

	ExtentReports extent;

	public static ExtentReports getReporterObject() {

		// Extend report, ExtendSparkReporter

		String path = System.getProperty("user.dir") + "//ExtentReports//eReport.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Mobile Automation Results");
		reporter.config().setDocumentTitle("Test Results");

		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Abdul Sajeed");

		return extent;
	}

}
