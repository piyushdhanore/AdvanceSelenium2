package com.crm.ListnerCode;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TakeScreenShotWithExtentReport  extends BaseClassDWS implements ITestListener {
  public ExtentSparkReporter spark;
  public ExtentReports report;
  public ExtentTest test;
  
	
	@Override
	public void onTestStart(ITestResult result) {
		String name = result.getMethod().getMethodName();
	   test =report.createTest(name);
	   test.log(Status.INFO, "Welcome to world.!!");
	   test.log(Status.INFO, "Hello world..!!");
	   	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		 test.log(Status.PASS, "test case is passed.!!");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "test case is failed.!!");
		TakesScreenshot ts= (TakesScreenshot) driver;
		String from = ts.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(from);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "test case is skipped.!!");
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		File path= new File("./ExtentReport/SS.png");
		 spark=new ExtentSparkReporter(path);
		 spark.config().setDocumentTitle("ReportWithScreenshot");
		 spark.config().setReportName("Dipti");
		 spark.config().setTheme(Theme.STANDARD);
		 report=new ExtentReports();
		 report.setSystemInfo("OS", "Window-10");
		 report.setSystemInfo("Browser", "chrome");
		 report.attachReporter(spark);
		
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
		
	}

}
