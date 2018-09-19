package autoFill;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Goibio {
	
		
public static void main(String[] args) throws InterruptedException {
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://www.redbus.in/");
	System.out.println("On test page");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='src']")).click();
	System.out.println("after click");
	driver.findElement(By.xpath("//*[@id='src']")).sendKeys("Ahe");
	System.out.println("After sendkeys");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='src']/div/div[2]/div/ul/li[1]")).click();
	System.out.println("after test entered");
	Thread.sleep(30000);
	System.out.println("Done");

}


}
