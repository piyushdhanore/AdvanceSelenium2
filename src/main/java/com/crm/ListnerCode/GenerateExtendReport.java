package com.crm.ListnerCode;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class GenerateExtendReport  implements ITestListener{

public 	ExtentSparkReporter spark;
public	ExtentReports report;
public	ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		String name = result.getMethod().getMethodName();
		test=report.createTest(name);
		System.out.println(name);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name = result.getMethod().getMethodName();
		System.out.println("On test Success");
		test.log(Status.PASS,name+ " is passed ");
	}

	@Override
	public void onTestFailure(ITestResult result) {
	  String name = result.getMethod().getMethodName();
	   System.out.println("On test failure");
	   test.log(Status.FAIL,name+" is failed");
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String name = result.getMethod().getMethodName();
		System.out.println("On test skipped");
		test.log(Status.SKIP,name+ " is skipped ");
	}

	@Override
	public void onStart(ITestContext context) {
		 report= new ExtentReports();
		File path= new File("./ExtentReport/TestRun.html");
		 spark= new ExtentSparkReporter(path);
		spark.config().setDocumentTitle("SeleniumBatch");
		spark.config().setReportName("Dipti");
		spark.config().setTheme(Theme.STANDARD);
		//attach the spark report to extent report
		report.attachReporter(spark);
		report.setSystemInfo("Os", "Window-10");
		report.setSystemInfo("Browser", "Chrome");
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}

}
	


