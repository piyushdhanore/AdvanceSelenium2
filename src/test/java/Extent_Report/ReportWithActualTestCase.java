package Extent_Report;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.ListnerCode.BaseClassDWS;
import com.crm.POM.DwsLoginPage;

@Listeners(com.crm.ListnerCode.GenerateExtendReport.class)
public class ReportWithActualTestCase extends BaseClassDWS {
	@Test
	public void DSWCorrectData() {
	
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		DwsLoginPage dws= new DwsLoginPage(driver);
		dws.username("admin01@gmail.com");
		dws.password("admin01");
		dws.login_button();
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}
	@Test
	public void DSWInCorrectData() throws InterruptedException {
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		DwsLoginPage dws= new DwsLoginPage(driver);
		Thread.sleep(1000);
		dws.username("admin01@gmail.com");
		dws.password("admin02");
		dws.login_button();
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		assertEquals("true", "tru");
	}
	
	@Test(dependsOnMethods = "DSWInCorrectData")
	public void redBus() {
		driver.get("https://www.redbus.in/");
		assertEquals("qsp", "qsps");
	}

}
