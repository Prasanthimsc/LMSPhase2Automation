package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features",
		glue={"steps"},
		dryRun=false,
		monochrome=true,
		stepNotifications=false,

		plugin= {"pretty","html:target/HtmlReports.html",
				"json:target/cucumber-report/cucumber.json"
				}
		)
public class Test {

}
