package page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import utility.Read_Data;

public class LoginPage extends TestBase{
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement login_button;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyTitlOfPage() {
		return driver.getTitle();
		
	}
	
	public String verifyCurrentURL() {
		return driver.getCurrentUrl();
		
	}
	
	public String verifyLoginApplicationUrl() throws IOException {
		
		username.sendKeys(Read_Data.readPropertyFile("username"));
		password.sendKeys(Read_Data.readPropertyFile("password"));
		login_button.click();
		return driver.getCurrentUrl();
		
	}

}
