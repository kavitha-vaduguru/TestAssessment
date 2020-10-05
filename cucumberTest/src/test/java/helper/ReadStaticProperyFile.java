package helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadStaticProperyFile {

	/* Method to read the static values from property file */
	
	public static String getConfigData(String strConfigKey){

		String configKey = null;
		try {
			String filepath = System.getProperty("user.dir") + "\\src\\test\\resources\\cucumberselenium.properties";
			File file = new File(filepath);
			FileInputStream fileInput = new FileInputStream(file);
			Properties prop = new Properties();
			prop.load(fileInput);
			configKey = prop.getProperty(strConfigKey);
		} catch (Exception e) {
			System.out.println("Catching exception while reading the file" +e.getMessage());
			e.printStackTrace();
		}
		return configKey;
	}
}
