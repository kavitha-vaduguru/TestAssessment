package stepDefinitions;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.ReadStaticProperyFile;
import helper.CucumberSeleniumTestBase;
import pageObject.SearchPage;
import pageObject.SearchResultPage;
import pageObject.SearchResultDetailsPage;

public class GoogleSearchTestStepDef {
	
	WebDriver webDriver;
	
	/* Method to launch google search web page URL */
	
	@Given("^I navigated to the google search webpage$")
	public void launchURL() {
		webDriver = CucumberSeleniumTestBase.driverSetup();
		PageFactory.initElements(webDriver, this);
		String webPageURL = ReadStaticProperyFile.getConfigData("GoogleWebPageURL");
		String env = ReadStaticProperyFile.getConfigData("Testenvironment");
		if (env.equalsIgnoreCase("QA")) {
			System.out.println(webPageURL);
			webDriver.get(webPageURL);
			webDriver.manage().window().maximize();
			int wait = Integer.parseInt(ReadStaticProperyFile.getConfigData("implicitwait"));
			webDriver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
			int pageloadTime = Integer.parseInt(ReadStaticProperyFile.getConfigData("pageloadTimeout"));
			webDriver.manage().timeouts().pageLoadTimeout(pageloadTime, TimeUnit.SECONDS);
		}
	}

	@Then("^I am on the Google search homepage using \"([^\"]*)\"$")
	public void I_am_on_the_Google_search_homepage_using(String strWebsiteName) {
		SearchPage searchPageObject = new SearchPage(webDriver);
		String actualTitle = searchPageObject.verifyGoogleSearchHomepage();
		Assert.assertTrue(actualTitle.contains(strWebsiteName));
	}

	@When("^I have entered the text into google search bar \"([^\"]*)\"$")
	public void i_have_entered_the_text_into_google_search_bar(String strKeyword) throws Exception {
		SearchPage searchPageObject = new SearchPage(webDriver);
		searchPageObject.provideGoogleSearchInput(strKeyword);
	}

	@And("^the result should display in a new page with searchresults$")
	public void the_result_should_in_a_new_page_with_searchresults() throws Exception {
		SearchResultPage clickOnLinkPage = new SearchResultPage(webDriver);
		clickOnLinkPage.clickOnWebLink();
	}

	@Then("^I verify JP Mogan logo is dispalyed on search result page$")
	public void i_verify_JP_Mogan_logo_is_dispalyed_on_search_result_page() throws Exception {
		SearchResultDetailsPage verifyLogoPage = new SearchResultDetailsPage(webDriver);
		boolean isLogoDisplayed = verifyLogoPage.verifyWebPageLogo();
		Assert.assertTrue(isLogoDisplayed);
	}

}
