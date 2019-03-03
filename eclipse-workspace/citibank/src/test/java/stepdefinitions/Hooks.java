package stepdefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Hooks {
	
	@Before
	public void setUp() {
		Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Driver.getDriver().manage().window().fullscreen();
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
		Driver.getDriver().manage().deleteAllCookies();
	}
	@After
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		}
			Driver.closeDriver();
	}

}
