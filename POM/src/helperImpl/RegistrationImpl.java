package helperImpl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helper.Registration;
import util.Elements;

public class RegistrationImpl implements Registration{
	private WebDriver driver;
	
	/*@FindBy(css="a[da-qid='inventory']")
	WebElement username;*/
	
	public RegistrationImpl(WebDriver driver) {
		this.driver=driver;
	}
	@Override
	public void login(String uname, String pwd) {
		enterUserName(uname);
		enterPwd(pwd);
		clickOnSubmit();
	}
	
	private void enterUserName(String uname){
		Elements.getElement(driver, "cssSelector", "#unameSignin").sendKeys(uname);
	}
	
	private void enterPwd(String pwd){
		Elements.getElement(driver, "cssSelector", "#pwdSignin").sendKeys(pwd);
	}
	
	private void clickOnSubmit(){
		Elements.getElement(driver, "cssSelector", "#btnsubmitdetails").click();
	}
	
	
	@Override
	public void signup(String uname, String pwd, String city, int pincode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String forgotPwd(String uname) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
