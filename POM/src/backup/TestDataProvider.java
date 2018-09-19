package backup;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider {
	int count = 1;
	@Test(dataProvider="ExcelReadData")
	public void login(String uname, String pwd){
		System.out.println(uname + ":" + pwd);
		System.out.println(count++);
	}
	
	@DataProvider(name="ExcelReadData")
	public String[][] readExcelData() throws IOException{
		
		File file = new File("D://LoginTestData.xlsx");
		FileInputStream input = new FileInputStream(file);
		Workbook mybook = new XSSFWorkbook(input);
		
		Sheet datasheet = mybook.getSheet("Data");
		int totalRows = datasheet.getLastRowNum()+1;
		int totalCols = datasheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[totalRows][totalCols];
		
		for(int i=0;i<totalRows;i++){
			Row row = datasheet.getRow(i);
			for(int j=0;j<totalCols;j++){
				data[i][j] = row.getCell(j).getStringCellValue();
			}
		}
		
		return data;
		
	}
	
	
}
