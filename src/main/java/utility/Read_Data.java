package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Read_Data {
	
	public static String readPropertyFile(String value) throws IOException {
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\SwagLabs\\src\\main\\java\\config\\config.properties");
		
		prop.load(file);
		return prop.getProperty(value);
	
	}

}
