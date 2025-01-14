package ShopperStack;

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
import org.testng.annotations.Test;

public class shopperstackTestCase2 {

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
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			Thread.sleep(8000);
			driver.get("https://www.shoppersstack.com/");
			Thread.sleep(8000);
	}
	@BeforeMethod
	public void beforeMethod(String email,String pass) throws InterruptedException, EncryptedDocumentException, IOException {
		Thread.sleep(2000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(2000);
		FileInputStream fis= new FileInputStream("D:\\Book2.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		String s1=sheet.getRow(0).getCell(0).toString();
		String s2=sheet.getRow(0).getCell(0).toString();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pass);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
	}
	@Test
	
	public void testCase() throws InterruptedException {
		driver.findElement(By.xpath("//div[text()='A']")).click();
		driver.findElement(By.xpath("//li[text()='My Profile']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Edit Profile')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("First Name")).clear();
		driver.findElement(By.id("First Name")).sendKeys("Anuja");
		driver.findElement(By.id("Last Name")).clear();
		driver.findElement(By.id("Last Name")).sendKeys("wale");
		driver.findElement(By.id(":r9:")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id(":r9:")).sendKeys("12/12/2024");
		driver.findElement(By.id("Phone Number")).sendKeys("9876543210");
		driver.findElement(By.id("State")).click();
		driver.findElement(By.id("Delhi")).click();
		driver.findElement(By.id("City")).click();
		driver.findElement(By.id("Imphal")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
	}
	
	
	@AfterMethod
	public void 
	afterMethod() {
		
		driver.findElement(By.xpath("//div[text()='A']")).click();
		driver.findElement(By.xpath("//li[text()='Logout']")).click();
		
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
//	
//	public static Object[][] ssLogin() throws EncryptedDocumentException, IOException {
//		Object [][] obj = new Object[2][2];
//		FileInputStream fis= new FileInputStream("D:\\Book2.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sheet = wb.getSheet("Sheet1");
//		obj[0][0]=sheet.getRow(0).getCell(0).toString();
//		obj[0][1]=sheet.getRow(0).getCell(1).toString();
////		obj[1][0]=sheet.getRow(1).getCell(0).toString();
////		obj[1][1]=sheet.getRow(1).getCell(1).toString();
//		
//        return obj;
//	}
//	public Object[][] sender() throws EncryptedDocumentException, IOException{
//		return  ssLogin();
//		
//	}

}
