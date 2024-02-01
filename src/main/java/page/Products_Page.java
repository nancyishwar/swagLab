package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;

public class Products_Page extends TestBase {

	@FindBy(xpath = "//span[@class='title']")
	private WebElement productLabel;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement backpack;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']")
	private WebElement bikeLight;
	
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	private WebElement cartCount;
	
	@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")
	private WebElement removebackpack;
	
	@FindBy(xpath="//a[text()='Twitter']")
	private WebElement twitterLogo;
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement dropdownlist;
	
	public Products_Page() {
		PageFactory.initElements(driver, this);
	}
	public String verifyTitleProductLabel() {
		return productLabel.getText();
		
	}
	public String addToCart() {
		backpack.click();
		bikeLight.click();
		return cartCount.getText();	
	}
	public String remove() {
		addToCart();
		removebackpack.click();
		return cartCount.getText();
	}
	
	public boolean verifyTwitterLogo() {
		return twitterLogo.isDisplayed();
		
	}
	
	public void dropdownSelect() {
		Select s=new Select(dropdownlist);
		s.selectByVisibleText("Price (low to high)");
	}
	
}
