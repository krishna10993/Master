package util;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertHandle {

	static public String HandleAlert(WebDriver driver){
		Alert alert = driver.switchTo().alert();
		String actual = alert.getText();
		alert.accept();
		return actual;
	}
	
	void HandleConfirmationALert(){
		
	}
	
	void HandlePrompt(){
		
	}
	
	
}
