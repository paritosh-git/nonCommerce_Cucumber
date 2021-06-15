package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//Feature file/", glue = "stepDefinition", format = { "pretty",
		"html:test-output" }, dryRun = false, monochrome = true, tags = { "@sanity" }

)
public class TestRun {

}
