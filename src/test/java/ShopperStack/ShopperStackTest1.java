package ShopperStack;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
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
import org.testng.annotations.Test;

import DataDriven.ShopperStackUtility;

public class ShopperStackTest1 {
	
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
			Thread.sleep(2000);
			driver.get("https://www.shoppersstack.com/");
			Thread.sleep(8000);
	}
	@BeforeMethod
	public void beforeMethod(String email,String pass) throws EncryptedDocumentException, IOException, InterruptedException {
		Thread.sleep(1000);
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement login = driver.findElement(By.xpath("//button[text()='Login']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Login']")));

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
	
	public void testCase() {
		driver.findElement(By.id("men")).click();
		driver.findElement(By.xpath("//a[text()='T-shirts']")).click();
	 List<WebElement> products = driver.findElements(By.xpath("//button[text()='add to cart']"));
	 for (WebElement web : products) {
		 web.click();	
	     } 
	}
	
	
	@AfterMethod
	public void 
	afterMethod() {
		
		driver.findElement(By.xpath("//div[text()='A']"));
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
