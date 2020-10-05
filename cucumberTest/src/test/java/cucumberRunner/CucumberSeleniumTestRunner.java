package cucumberRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import helper.CucumberSeleniumTestBase;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
		"html:target/cucumberHtmlReport" }, features = "src/test/resources/features/GoogleSearchTest.feature", glue = {
				"stepDefinitions" }, dryRun = false, tags = { "@verifyWebPageLogo" })

public class CucumberSeleniumTestRunner extends CucumberSeleniumTestBase {

	@AfterClass
	public static void close() {
		webDriver.quit();
	}

}
