package helperImpl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.NavigationMenu;
import util.Elements;

public class NavigateMenuImpl implements NavigationMenu {

	WebDriver driver;
	public NavigateMenuImpl(WebDriver driver) {
		this.driver = driver;
	}
	
	@Override
	public void navigateToRegistration() {
		WebElement e = Elements.getElement(driver, "xpath", "//a[@id='registration2']");
		e.click();
	}

	@Override
	public void navigateToDemoTables() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void navigateToBasicElements() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void navigateToIframeDemo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void navigateToAdvanceFeatures() {
		// TODO Auto-generated method stub
		
	}

}
