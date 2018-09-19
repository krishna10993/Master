package backup;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Temp {

	public static void main(String[] args) throws IOException {
		File file = new File("D://LoginTestData.xlsx");
		FileInputStream input = new FileInputStream(file);
		Workbook mybook = new XSSFWorkbook(input);
		
		Sheet datasheet = mybook.getSheet("Data");
		int totalRows = datasheet.getLastRowNum();
		System.out.println(totalRows);
	}
}
