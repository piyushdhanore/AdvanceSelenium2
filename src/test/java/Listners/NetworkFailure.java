package Listners;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class NetworkFailure {
	
	@Test(retryAnalyzer =com.crm.ListnerCode.NetworkRetry.class )
	public void m1() {
		WebDriver driver= new ChromeDriver();
		assertEquals("dipu", "dipti");
	}

}
