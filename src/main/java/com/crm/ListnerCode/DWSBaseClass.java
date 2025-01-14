package com.crm.ListnerCode;

import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import Properties.DwsCredientials;


public class DWSBaseClass {
	 public WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("DataBase Connection");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("pre-condition for testcase runner");
	}
	
	
	@BeforeClass
	public void beforeClass() throws InterruptedException, IOException {
		  driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Thread.sleep(1000);
			
			String getUrl = DwsCredientials.dwsUrl("url");
			driver.get(getUrl);
			
	}
	
	
	@BeforeMethod
	public void beforeMethod() throws EncryptedDocumentException, IOException, InterruptedException {
		
		driver.findElement(By.cssSelector("a[class='ico-login']")).click();
	    Thread.sleep(2000);	
	   
	   String getUsername = DwsCredientials.dwsUsername("username");
	  String getPassword =  DwsCredientials.dwsPassword("password");
		driver.findElement(By.id("Email")).sendKeys(getUsername);
		driver.findElement(By.id("Password")).sendKeys(getPassword);
	   driver.findElement(By.cssSelector("input[value='Log in']")).click();
		
	}
	
	@AfterMethod
	public void 
	afterMethod() {
		
        driver.findElement(By.cssSelector("a[class='ico-logout']")).click();
		
	}
	@AfterClass
	public void afterClass() {
//		driver.close();
		System.out.println("after class" );
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
