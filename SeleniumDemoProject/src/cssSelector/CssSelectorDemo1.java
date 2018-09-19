package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorDemo1 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationbykrishna.com/");
		System.out.println("On automationbykrishna");
		driver.findElement(By.cssSelector("a#demotable")).click();
		System.out.println("On demo pages");
		Thread.sleep(5000);
		driver.close();
		System.out.println("Browser closed");
	}

}
