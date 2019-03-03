package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(  
		
		plugin = {
				"pretty",
				"html:target/default-cucumber-reports",
				"json:target/cucumber.json"
				
		},
		tags="@temp",
		features="src/test/resources/com/features/ui_features",
//		features="src/test/resources/com/mypage2/db/features",
		glue="step_definitions"
//		,dryRun=true
		
		
		
		)
public class CukesRunner {

}
