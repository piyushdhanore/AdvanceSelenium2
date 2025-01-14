package com.crm.ListnerCode;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CaptureFailedScreenshot  extends BaseClassDWS implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		LocalDateTime data = LocalDateTime.now();
		String time = data.toString().replace(":", "-");
		TakesScreenshot ts= (TakesScreenshot) driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File("./ScreenShot/dws"+time+".png");
		try {
			FileHandler.copy(from, to);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
