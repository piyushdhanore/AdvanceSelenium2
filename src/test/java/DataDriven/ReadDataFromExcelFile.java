package DataDriven;

import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadDataFromExcelFile {
	@Test
	public void readData() throws EncryptedDocumentException, IOException {
		 File path =new File("D:\\SelBook1.xlsx");
		 FileInputStream fis =new  FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		
	 Sheet sheet = wb.getSheet("Sheet1");
//		 String s1 =sheet.getRow(0).getCell(0).toString();
//		 String s2 =sheet.getRow(0).getCell(1).toString();
//		 System.out.println(s1);
//    	 System.out.println(s2);
		 int row= sheet.getPhysicalNumberOfRows();
		 int colum=sheet.getRow(0).getPhysicalNumberOfCells();
		//nt row=2,colum=2;
		 for(int i=0;i<row;i++) {
			 for(int j=0;j<colum;j++) {
				 String s = sheet.getRow(i).getCell(j).toString();
			 System.out.println(s);
		 }
		 }
	}

}
