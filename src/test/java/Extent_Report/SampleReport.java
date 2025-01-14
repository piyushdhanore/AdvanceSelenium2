package Extent_Report;

import java.io.File;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleReport {
	@Test
	public void launchReport() {
		ExtentReports report= new ExtentReports();
		File path= new File("./ExtentReport/sample.html");
		ExtentSparkReporter spark= new ExtentSparkReporter(path);
		spark.config().setDocumentTitle("SeleniumBatch");
		spark.config().setReportName("Dipti");
		spark.config().setTheme(Theme.STANDARD);
		//attach the spark report to extent report
		report.attachReporter(spark);
		report.setSystemInfo("Os", "Window-10");
		report.setSystemInfo("Browser", "Chrome");
		//create test case
		ExtentTest test1= report.createTest("TestCase1");
		test1.log(Status.FAIL, "Login Function Error");
		report.flush();
		
	}

}
