package DataDriven;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderBasic {
	@Test(dataProvider   = "loginCredentials")
	public void receiver(String gmail,String pass) throws InterruptedException {
		    WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.className("ico-login")).click();
			driver.findElement(By.id("Email")).sendKeys(gmail);
			driver.findElement(By.id("Password")).sendKeys(pass);
			driver.findElement(By.cssSelector("input[value='Log in']")).click();
			Thread.sleep(2000);
			driver.close();
			
		
	}
	@DataProvider(name = "loginCredentials")
	public Object[][] sender() throws EncryptedDocumentException, IOException{
			
		return DataProviderUtility1.dwsLogin();
		
	}

}
