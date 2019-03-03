package tests;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRead {

	public static void main(String[] args) throws Exception {
		
		String excelPath = "/Users/fcelikaslan/Desktop/mockexcel.xlsx";
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook workBook = WorkbookFactory.create(fis);
		Sheet workSheet = workBook.getSheetAt(1);
		Row row = workSheet.getRow(1);
		Cell cell = row.getCell(1);
		
		System.out.println(cell.toString());
		
		int rowsCount = workSheet.getPhysicalNumberOfRows();
		System.out.println(rowsCount);
		//System.out.println(workSheet.getLastRowNum());
		
		for( int rowNum = 1; rowNum<rowsCount; rowNum++) {
			row = workSheet.getRow(rowNum);
			cell = row.getCell(0);
			System.out.println(rowNum + "---" + cell.toString());
		}
	System.out.println("-----------------------");
		for( int rowNum = 1; rowNum<rowsCount; rowNum++) {
			row = workSheet.getRow(rowNum);
			cell = row.getCell(1);
			System.out.println(rowNum + "---" + cell.toString());
		}
		
		Cell stevenJobId = workSheet.getRow(1).getCell(2);
		System.out.println(stevenJobId);
		
		Cell ninaLastName = workSheet.getRow(2).getCell(1);
		System.out.println("Neena Last Name :" + ninaLastName);
		
		for (int i = 0; i < workSheet.getPhysicalNumberOfRows(); i++) {
			Row myRow = workSheet.getRow(i);
			if(myRow.getCell(0).toString().equals("Nancy")){
				System.out.println("Nancy works as :" + myRow.getCell(2).toString());
				break;
			}
			
			
			
		}
		
		
		
		
		workBook.close();
		fis.close();
	}
	

}
