package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class WriteDataInExcel {
	@Test
	public void dataToExcel() throws EncryptedDocumentException, IOException {
		File path= new File("D:\\WriteDataInExcel.xlsx");
		FileInputStream fis= new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.createCell(1);
		cell.setCellType(CellType.STRING);
		cell.setCellValue("Welcome..!!");
		FileOutputStream fos= new FileOutputStream("‪D:\\WriteDataInExcel.xlsx");
		wb.write(fos);
		wb.close();
		
	}

}
