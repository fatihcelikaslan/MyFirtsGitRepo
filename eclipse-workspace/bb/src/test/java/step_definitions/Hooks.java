package step_definitions;

import java.util.concurrent.TimeUnit;

import org.junit.Ignore;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.DBUtils;
import utilities.Driver;

public class Hooks {
	
	BrowserUtils bu = new BrowserUtils();
//	@Ignore
	@Before
	public void setUp() {
		Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		Driver.getDriver().manage().window().fullscreen();
		Driver.getDriver().get(ConfigurationReader.getProperty("url1"));
//		bu.setSpeed(100000);
	}
	@Ignore
	@Before("@db")
	public void setUpDBConnection() {
		DBUtils.createConnection();
	}
	@Ignore
	@After("@db")
	public void tearDownDBConnection() {
		DBUtils.destroy();
	}
	@Ignore
	@After
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		}
			Driver.closeDriver();
	}

}
