package Parameter;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BasicDemowebShop {
	
	WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("DataBase Connection");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("pre-condition for testcase runner");
	}
	
	@Parameters("url")
	@BeforeClass
	public void beforeClass(String url) throws InterruptedException {
		  driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			Thread.sleep(2000);
			driver.get(url);
			
	}
	
	@Parameters({"username","password"})
	@BeforeMethod
	public void beforeMethod(String username,String password) throws EncryptedDocumentException, IOException, InterruptedException {
		
		driver.findElement(By.cssSelector("a[class='ico-login']")).click();
	    Thread.sleep(2000);	
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
	driver.findElement(By.cssSelector("input[value='Log in']")).click();
		
	}
	
	
	
	@AfterMethod
	public void 
	afterMethod() {
		
        driver.findElement(By.cssSelector("a[class='ico-logout']")).click();
		
	}
	@AfterClass
	public void afterClass() {
		driver.close();
	}
		
	@AfterTest
	public void afterTest() {
		System.out.println("Post condition for test Runner");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("data base dissconnection");
	}

}
