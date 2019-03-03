package runners;

import cucumber.api.CucumberOptions;

@CucumberOptions(
		
		plugin = {"pretty", 
				"html:target/cucumber-report",
				"json:target/cucumber.json"
				
				
		},
		
		tags="smoke",
		features="src/test/resources/features",
		glue="stepdefinitions"
		,dryRun=true
		
		
		
		)







public class Runner {

}
