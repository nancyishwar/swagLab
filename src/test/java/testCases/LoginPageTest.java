package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import page.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage login;
	@BeforeMethod
	
	public void setup() throws IOException {
		initialization();
		login = new LoginPage();
	
	}
	
	@Test
	public void  verifyTitlOfPageTest() {
		
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitlOfPage();
		Assert.assertEquals(expTitle, actTitle);
	}
	
	@Test
	public void verifyCurrentURL() {
		String expUrl = "https://www.saucedemo.com/";
		String actUrl = login.verifyCurrentURL();
		Assert.assertEquals(expUrl, actUrl);
	}

@Test 
public void verifyLoginApplicationUrlTest() throws IOException, InterruptedException {
	String exploginT = "https://www.saucedemo.com/inventory.html";
	String actloginT = login.verifyLoginApplicationUrl();
	Assert.assertEquals(exploginT, actloginT);
}

@AfterMethod

public void closebrowser() {
	driver.close();
}
}
