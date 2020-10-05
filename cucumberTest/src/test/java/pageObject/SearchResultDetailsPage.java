package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.CucumberSeleniumTestBase;

public class SearchResultDetailsPage {
	 WebDriver webDriver;
	 
	 public SearchResultDetailsPage(WebDriver webDriver) {
	 this.webDriver = webDriver;
	 PageFactory.initElements(webDriver, this);
	 }
	 
	 @FindBy(xpath = "//div[@class='logo-desktop-only']//div[@class='logo container-fluid']")
		private WebElement jpMorganLogo;
	 
	 /* This Method is used to verify logo on the page */
		public boolean verifyWebPageLogo() {
			return CucumberSeleniumTestBase.isWebElementVisible(jpMorganLogo);
		}

}