package TestNGBasic;

import java.awt.Window;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	protected WebDriver driver;
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("DataBase Connection");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("pre-condition for testcase runner");
	}
	@BeforeClass
	public void beforeClass() {
		 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demowebshop.tricentis.com/");
		
	}
	@BeforeMethod
	public void beforeMethod() {
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("diptichougule4@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Dipti@04");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		
	}
	@AfterMethod
	public void afterMethod() {
		driver.findElement(By.className("ico-logout")).click();
		
	}
	@AfterClass
	public void afterClass() {
		driver.close();
	}
		
	@AfterTest
	public void afterTest() {
		System.out.println("POst condition for test Runner");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("data bese dissconnection");
	}
	
}
