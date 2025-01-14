package com.crm.ListnerCode;

import org.testng.IRetryAnalyzer;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class NetworkRetry implements IRetryAnalyzer {
	int strt=0, end=2;
	@Override
	public boolean retry(ITestResult result) {
		
		if (strt<end) {
			strt++;
			return true;
		}
		return false;
	}
	
	

}
