package excelpractice;

import java.io.*;
import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelStuff {

	public static void main(String[] args) throws Exception {

//		printAllSheetData();
		
		String [] [] result = getAllSheetData("MOCK_EXCEL.xlsx", "data");
		System.out.println(Arrays.deepToString(result));
	}

	public static void printAllSheetData() throws Exception {
		File excelFile = new File("MOCK_EXCEL.xlsx");
		Workbook wb = WorkbookFactory.create(excelFile);
		Sheet sheet = wb.getSheetAt(0);
		int rowCount = sheet.getPhysicalNumberOfRows();
		int colCount = sheet.getRow(0).getLastCellNum();

		for (int i = 0; i < rowCount; i++) {
			System.out.print("Row number: " + i + "  ");

			for (int j = 0; j < colCount; j++) {
				Cell cell = sheet.getRow(i).getCell(j);
				System.out.print(cell.toString() + "--");

			}
			System.out.println();
		}

		wb.close();
	}

	public static String[][] getAllSheetData(String filePath, String sheetName) throws Exception {
		FileInputStream fis = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(fis);

		// Sheet sheet = wb.getSheetAt(0);
		Sheet sheet = wb.getSheet(sheetName);
		int rowCount = sheet.getPhysicalNumberOfRows();
		int colCount = sheet.getRow(0).getLastCellNum();

		String[][] data = new String[rowCount][colCount];
		
		for (int i = 0; i < rowCount; i++) {
//			System.out.print("Row number: " + i + "  ");

			for (int j = 0; j < colCount; j++) {
				Cell cell = sheet.getRow(i).getCell(j);
				data[i][j] = cell.toString();
//				System.out.print(cell.toString() + "--");

			}
//			System.out.println();
		}
		fis.close();
		wb.close();
		
		return data;
		
	}
	
}
