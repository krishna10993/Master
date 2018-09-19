package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import helper.NavigationMenu;
import helper.Registration;
import helperImpl.NavigateMenuImpl;
import helperImpl.RegistrationImpl;
import util.AlertHandle;
import util.Initialization;
import util.ScreenCapture;
import util.TestDataFromExcel;


public class LoginTest {
	WebDriver driver;
	@BeforeClass
	public void browserStart(){
		driver = Initialization.start();		
	}
	
	
	@Test(dataProvider="ExcelReadData")
	public void login(String uname, String pwd, String expected) throws InterruptedException{
		//String expected = "Success!";
		NavigationMenu navigate = new NavigateMenuImpl(driver);
		navigate.navigateToRegistration();
		
		Registration reg = new RegistrationImpl(driver);
		reg.login(uname, pwd);
		
		String actual= AlertHandle.HandleAlert(driver);
		Assert.assertEquals(expected, actual);
		
	}
	
	@AfterMethod
	public void checkStatus(ITestResult result) throws IOException{
		String fileName = result.getName();
		if(ITestResult.FAILURE == result.getStatus())
			ScreenCapture.takesnapshot(driver, fileName);
	}
	
	@AfterClass
	public void tearDown(){
		driver.close();
	}
	
	
	@DataProvider(name="ExcelReadData")
	public String[][] readExcelData() throws IOException{
		
		/*File file = new File("D://LoginTestData.xlsx");
		FileInputStream input = new FileInputStream(file);
		Workbook mybook = new XSSFWorkbook(input);*/
		
		/*Sheet datasheet = mybook.getSheet("Data");
		int totalRows = datasheet.getLastRowNum()+1;*/
		TestDataFromExcel testdataFromExcel = new TestDataFromExcel("D://LoginTestData.xlsx","Data");
		//int totalRows = testdataFromExcel.totalRows();
		//int totalCols = testdataFromExcel.totalColumns(0);
		//int totalCols = datasheet.getRow(0).getLastCellNum();
		
		/*String[][] data = new String[totalRows][totalCols];
		
		for(int i=0;i<totalRows;i++){
			for(int j=0;j<totalCols;j++){
				data[i][j] = testdataFromExcel.getData(i, j);
			}
		}*/
		
		String[][] data = testdataFromExcel.getData();
		
		return data;
		
	}
}
