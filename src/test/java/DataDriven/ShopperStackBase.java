package DataDriven;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ShopperStackBase {
	@Test (dataProvider = "ssLoginCredentials")
	public void receiver(String gmail,String password) throws InterruptedException {
		   WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Thread.sleep(7000);
			driver.get("https://www.shoppersstack.com/");
			Thread.sleep(7000);
			driver.findElement(By.xpath("//button[text()='Login']")).click();
			driver.findElement(By.id("Email")).sendKeys(gmail);
			driver.findElement(By.id("Password")).sendKeys(password);
			driver.findElement(By.xpath("//span[text()='Login']")).click();
			Thread.sleep(2000);
			driver.close();
	}
	@DataProvider(name = "ssLoginCredentials")
	public Object[][] sender() throws EncryptedDocumentException, IOException{
		return  ShopperStackUtility.ssLogin();
		
	}

}
