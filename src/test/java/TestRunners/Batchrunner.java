package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ={"src/test/resources/Features"},
		glue= {"StepDefs"},
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","junit:target/JUNITReports/report.xml",
				"json:target/JSONReports/report.json",
				 "html:target/HTMLReports/report.html",
				 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
					"timeline:test-output-thread/"},
		tags= {"@sanity, @regression"}
		
		
		)

public class Batchrunner {

}


