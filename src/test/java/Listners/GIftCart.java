package Listners;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.ListnerCode.DWSBaseClass;

@Listeners(com.crm.ListnerCode.DwsLogin.class)

public class GIftCart  extends DWSBaseClass{
	@Test
	public void GiftCart() throws EncryptedDocumentException, IOException {
		driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();
		driver.findElement(By.xpath("//input[@value='Add to cart'][1]")).click();
		
		FileInputStream fis= new FileInputStream("D:\\Book2.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		 String recipName = sheet.getRow(0).getCell(0).toString();
		 String recipEmail = sheet.getRow(1).getCell(0).toString();
		 String yourName = sheet.getRow(2).getCell(0).toString();
		String yourEmail = sheet.getRow(3).getCell(0).toString();
		String msg = sheet.getRow(4).getCell(0).toString();
		String qty = sheet.getRow(5).getCell(0).toString();
		
		driver.findElement(By.id("giftcard_1_RecipientName")).sendKeys(recipName);
		driver.findElement(By.id("giftcard_1_RecipientEmail")).sendKeys(recipEmail);
		driver.findElement(By.id("giftcard_1_SenderName")).sendKeys(yourName);
		driver.findElement(By.id("giftcard_1_SenderEmail")).sendKeys(yourEmail);
		driver.findElement(By.id("giftcard_1_Message")).sendKeys(msg);
		
		driver.findElement(By.cssSelector("input[value='1']")).clear();
		driver.findElement(By.cssSelector("input[value='1']")).sendKeys(qty);
			
		
		
	}

}
