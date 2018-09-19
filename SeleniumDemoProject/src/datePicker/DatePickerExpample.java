package datePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePickerExpample {

	
	 public static void main(String args[]) throws InterruptedException {
	    	FirefoxDriver driver = new FirefoxDriver();
	    	driver.get("https://www.goibibo.com/");
	    	System.out.println("On test page");
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"searchWidgetCommon\"]/div/div[3]/div[1]/div[1]/div/i")).click();
	    	System.out.println("after click");
	    	int totalMonths = driver.findElements(By.xpath("//div[@class='DayPicker-Caption']")).size();
	    	System.out.println("after test entered");
	  
				String monthName1 = driver.findElement(By.xpath("//div[@class='DayPicker-Month'][1]/div[@class='DayPicker-Caption'][1]")).getText();
				String monthName2 = driver.findElement(By.xpath("//div[@class='DayPicker-Month'][2]/div[@class='DayPicker-Caption'][1]")).getText();
				if(monthName1.contains("October") || monthName2.contains("October")){
					System.out.println("In if");
					driver.findElement(By.xpath("//div[@class='DayPicker-Month']/div[text()='October 2018']//following-sibling::div//div[starts-with(@id,'fare_2018')][text()='19']")).click();
				}
				else {
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id=\"searchWidgetCommon\"]//span[contains(@class,'next')]")).click();
					driver.findElement(By.xpath("//div[@class='DayPicker-Month']/div[text()='October 2018']//following-sibling::div//div[starts-with(@id,'fare_2018')][text()='19']")).click();
					System.out.println("Date Selected");
				}
			
	    }
}
