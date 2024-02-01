package base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Read_Data;

public class TestBase {

	
	public static WebDriver driver;
	public void initialization() throws IOException {
		
		String browser = Read_Data.readPropertyFile("Browser");
		if(browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
	
		driver.get(Read_Data.readPropertyFile("url"));
		
		
	}
}
