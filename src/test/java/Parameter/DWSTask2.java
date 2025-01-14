package Parameter;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DWSTask2  extends BasicDemowebShop{
	@Test
	public void test2() throws EncryptedDocumentException, IOException {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		WebElement targeted_ele = driver.findElement(By.cssSelector("input[value='Add to cart']"));
		js.executeScript("arguments[0].ScrollIntoView(true)", targeted_ele);
		targeted_ele.click();
		FileInputStream fis= new FileInputStream("D:\\Book2.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		 Sheet sheet = wb.getSheet("Sheet2");
		 
		 String s1 =sheet.getRow(0).getCell(0).toString();
		 String s2 =sheet.getRow(1).getCell(0).toString();
		 String s3 =sheet.getRow(2).getCell(0).toString();
		 String s4 =sheet.getRow(3).getCell(0).toString();
		 String s5 =sheet.getRow(4).getCell(0).toString();

		 
		driver.findElement(By.cssSelector("input[class='recipient-name']")).sendKeys(s1);
		driver.findElement(By.cssSelector("input[class='recipient-email']")).sendKeys(s2);
		driver.findElement(By.cssSelector("input[class='sender-name']']")).sendKeys(s3);
		driver.findElement(By.cssSelector("input[class='sender-email']")).sendKeys(s4);
		driver.findElement(By.cssSelector("textarea[class='message']")).sendKeys(s5);
		
		
		
	}

}
