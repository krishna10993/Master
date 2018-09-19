package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataFromExcel {
	Workbook mybook = null;
	Sheet datasheet = null;
	void setup(String path, String sheetName){
		
	}
	public TestDataFromExcel(String path, String sheetName) throws IOException {
		File file = new File(path);
		FileInputStream input = new FileInputStream(file);
		mybook = new XSSFWorkbook(input);
		datasheet = mybook.getSheet(sheetName);
	}
	
	public TestDataFromExcel(String path, int sheetIndex) throws IOException {
		File file = new File(path);
		FileInputStream input = new FileInputStream(file);
		mybook = new XSSFWorkbook(input);
		datasheet = mybook.getSheetAt(sheetIndex);
	}
	
	public int totalRows(){
		int totalRows = datasheet.getLastRowNum()+1;
		return totalRows;
	}
	
	public int totalColumns(int rowIndex){
		int totalCols = datasheet.getRow(rowIndex).getLastCellNum();
		return totalCols;
	}
	
	public String getData(int rowIndex, int columnIndex){
		return datasheet.getRow(rowIndex).getCell(columnIndex).getStringCellValue();
	}
	
	public String[][] getData(){
		int totalRows = totalRows();
		int totalCols = totalColumns(0);
		String[][] data = new String[totalRows][totalCols];
		
		for(int i=0;i<totalRows;i++){
			for(int j=0;j<totalCols;j++){
				data[i][j] = getData(i, j);
			}
		}
		return data;
	}
	
	
	
	
	
	
	
	
	
}
