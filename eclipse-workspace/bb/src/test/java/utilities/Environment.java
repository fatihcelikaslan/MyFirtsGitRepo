package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import utilities.ConfigurationReader;

public class Environment {
	static {
		Properties properties = null;
		String environment = ConfigurationReader.getProperty("environment");
		try {
			FileInputStream input = new FileInputStream(environment + ".properties");
			properties = new Properties();
			properties.load(input);
			input.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		DB_HOST = ConfigurationReader.getProperty("db_host");
		DB_USERNAME = ConfigurationReader.getProperty("db_username");
		DB_PASSWORD = ConfigurationReader.getProperty("db_password");
//		DB_USERNAME = properties.getProperty("db_username");
//		DB_PASSWORD = properties.getProperty("db_password");
	}
	public static final String DB_USERNAME;
	public static final String DB_PASSWORD;
	public static final String DB_HOST;
	
	
}
