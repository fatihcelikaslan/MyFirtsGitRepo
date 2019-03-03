package stepdefinitions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import cucumber.api.java.en.Given;

public class ExcelTests {
	
	@Given("User enters some excel codes")
	public void user_enters_some_excel_codes() throws Exception {
		
		File excelFile = new File("src/test/resources/test_data/test.xlsx");
		
		Workbook wb = WorkbookFactory.create(excelFile);
		System.out.println(wb.getNumberOfSheets());
//		 Sheet sh = wb.getSheet("data");
		Sheet sh = wb.getSheetAt(0);
		Row row1 = sh.getRow(1);
		Cell c1 = row1.getCell(1);
		System.out.println("cell 1 : " + c1);
		c1.setCellValue("MY OWN VALUE");
		FileOutputStream fos = new FileOutputStream("myown.xlsx");
		wb.write(fos);
		fos.close();
		wb.close();

	}

}
