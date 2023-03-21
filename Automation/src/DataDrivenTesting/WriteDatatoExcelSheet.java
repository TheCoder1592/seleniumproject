package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDatatoExcelSheet {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	String filepath="./testData/ExcelData.xlsx";
	FileInputStream fis=new FileInputStream(filepath);
	Workbook workbook = WorkbookFactory.create(fis);
	
	workbook.getSheet("Sheet1").createRow(4).createCell(0).setCellValue("Akash");
	FileOutputStream fos=new FileOutputStream(filepath); //again converted byte code to excel
	workbook.write(fos);
	
}
}
