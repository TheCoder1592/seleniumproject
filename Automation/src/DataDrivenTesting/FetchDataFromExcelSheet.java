package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcelSheet {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./testData/ExcelData.xlsx");
	Workbook workbook=WorkbookFactory.create(fis);
	Sheet sheet=workbook.getSheet("Sheet1");
	Row row=sheet.getRow(1);
	Cell cell=row.getCell(0);
	String cus1=cell.getStringCellValue();
	
	System.out.println(cus1);
	String cus1mobnum = row.getCell(1).toString();
	System.out.println(cus1mobnum);
	
	String cus3 = sheet.getRow(3).getCell(0).toString();
	System.out.println(cus3);
	
	boolean cus3status = sheet.getRow(3).getCell(2).getBooleanCellValue();
	System.out.println(cus3status);
	
}
}
