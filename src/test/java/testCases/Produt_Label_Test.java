package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import page.LoginPage;
import page.Products_Page;

public class Produt_Label_Test extends TestBase {

	Products_Page product;
	LoginPage login;

	@BeforeMethod
	public void setup() throws IOException {
		initialization();
		login = new LoginPage();
		product = new Products_Page();
		login.verifyLoginApplicationUrl();

	}

	@Test
	public void verifyTitleProductLabelTest() {
		String expText = "Products";
		String actText = product.verifyTitleProductLabel();
		Assert.assertEquals(expText, actText);
	}

	@Test
	public void addToCartTest() throws InterruptedException {
		String expText = "2";
		String actText = product.addToCart();
		Assert.assertEquals(expText, actText);
	}

	@Test
	public void removeTest() throws InterruptedException {

		String expText = "1";
		String actText = product.remove();
		Assert.assertEquals(expText, actText);
	}

	@Test
	public void verifyTwitterLogoTest() {
		boolean expText = product.verifyTwitterLogo();
		Assert.assertEquals(expText, true);

	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
