package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
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

public class AllInOneShoppeStack {
	WebDriver driver;
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("DataBase Connection");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("pre-condition for testcase runner");
	}
	@BeforeClass
	public void beforeClass() throws InterruptedException {
		  driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Thread.sleep(7000);
			driver.get("https://www.shoppersstack.com/");
			Thread.sleep(7000);
	}
	@BeforeMethod
	public void beforeMethod(String gmail,String password) {
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys(gmail);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("LogOut Operation");
		
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
	
	public static Object[][] ssLogin() throws EncryptedDocumentException, IOException {
		Object [][] obj = new Object[2][2];
		FileInputStream fis= new FileInputStream("D:\\Book2.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		obj[0][0]=sheet.getRow(0).getCell(0).toString();
		obj[0][1]=sheet.getRow(0).getCell(1).toString();
		obj[1][0]=sheet.getRow(1).getCell(0).toString();
		obj[1][1]=sheet.getRow(1).getCell(1).toString();
		
        return obj;
	}
	

}
