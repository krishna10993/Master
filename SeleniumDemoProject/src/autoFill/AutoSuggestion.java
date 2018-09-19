package autoFill;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/webhp");
		System.out.println("On test page");
		Thread.sleep(3000);
		driver.findElement(By.id("lst-ib")).click();
		System.out.println("after click");
		driver.findElement(By.id("lst-ib")).sendKeys("Python");
		System.out.println("after test entered");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//b[contains(text(),' tutorial')]")).click();
		System.out.println("Done");
	
	}
	
}
