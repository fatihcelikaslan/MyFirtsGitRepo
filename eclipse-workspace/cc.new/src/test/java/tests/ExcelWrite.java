package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.*;

public class ExcelWrite {

	public static void main(String[] args) throws Exception {
		String testDataPath = "./src/test/resources/testdata/mockexcel.xlsx";
		
		FileInputStream fis = new FileInputStream(testDataPath);
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.getRow(2);
		Cell job = sheet.getRow(2).getCell(2);
		job.setCellValue("QA Lead");
		
		FileOutputStream outStream = new FileOutputStream(testDataPath);
		wb.write(outStream);
		
		outStream.close();
		wb.close();
		fis.close();
	}

}
