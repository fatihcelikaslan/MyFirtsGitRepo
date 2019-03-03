package excelpractice;

import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WorkingExcel {
	public static void main(String[] args) throws Exception {
		File excelFile = new File("MOCK_EXCEL.xlsx");
		Workbook wb = WorkbookFactory.create(excelFile);
		System.out.println(wb.getNumberOfSheets());
//		Sheet sh = wb.getSheet("data");
		Sheet sh = wb.getSheetAt(0);
		Row row1 = sh.getRow(0);
		Cell c1 = row1.getCell(1);
		System.out.println(c1);
		
		int colCountInFirstRow = row1.getLastCellNum();
		System.out.println("Columns are: "+ colCountInFirstRow);
		
		int rowCount = sh.getLastRowNum();
		System.out.println("Rows are: "+rowCount);
		
		int nonEmptyRowCount = sh.getPhysicalNumberOfRows();
		System.out.println("Non Empty Rows are :"+ nonEmptyRowCount);
		
		for (int i = 0; i < nonEmptyRowCount; i++) {
			System.out.print("ROW NUMBER: "+ (i+1)+"->");
			
			Row row = sh.getRow(i);
			
			for (int j = 0; j < colCountInFirstRow; j++) {
				Cell cell = row.getCell(j);
				System.out.print( cell+"--");
			}
			System.out.println();
			
		}
		
		wb.close();
	}

}
