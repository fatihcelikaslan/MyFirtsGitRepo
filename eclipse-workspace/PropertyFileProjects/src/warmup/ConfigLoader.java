package warmup;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {

	public static void main(String[] args) {
		
		Properties pro = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream("./config.properties");
			pro.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(pro.getProperty("VA"));
		System.out.println(pro.getProperty("South Carolina"));
		
		Properties pro2 = new Properties();
		try {
			FileInputStream fis2 = new FileInputStream("./config2.properties");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(pro2.getProperty("Mercedes"));
	}

}
