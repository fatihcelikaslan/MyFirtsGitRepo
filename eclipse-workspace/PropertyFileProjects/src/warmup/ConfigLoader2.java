package warmup;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader2 {
	
	private static Properties pro;
	
	static {
		
		Properties pro = new Properties();

		try {
			FileInputStream fis = new FileInputStream("./config.properties");
			pro.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static String getMyValue(String key) {

		String value = pro.getProperty(key);
		return value;
	}

}
