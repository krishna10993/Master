package util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenCapture {

	public static void takesnapshot(WebDriver driver,String fileName) throws IOException{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String timeStamp = getTimeStamp(); 
		FileUtils.copyFile(src, new File(".//screenshot//"+fileName+timeStamp+".png"));
	}
	
	static private String getTimeStamp(){
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyyhhmmss");
		Date date = new Date();
		String nowDate = dateFormat.format(date);
		return nowDate;
	}
	
}
