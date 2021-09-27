package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",
				 glue = "stepDefinitions",
				 dryRun = false,   
				 monochrome = true,
				 tags = "@Smoke",
				 strict = false, 
				 plugin = {"pretty", 
						 "html:target/cucumber-default-reports",
						 "rerun:target/FailedTests.txt", 
						 "json:target/cucumber.json"} 
					)
public class SmokeRunner {
	

}
