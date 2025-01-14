package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.POM.DwsLoginPage;

public class DwsLogin {
	@Test
	public void login() throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demowebshop.tricentis.com/login");
	Thread.sleep(1000);
	
	DwsLoginPage dws= new DwsLoginPage(driver);
//	dws.username.sendKeys("diptichougule4@gmail.com");
//	dws.password.sendKeys("Dipti@04");
//	Thread.sleep(1000); 
//	dws.login_button.click();
	dws.username("diptichougule4@gmail.com");
	dws.password("Dipti@04");
	dws.login_button();
	
	
	}

}
