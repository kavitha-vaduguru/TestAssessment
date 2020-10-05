package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	 WebDriver webDriver;
	 @FindBy(xpath = "//input[@name='q']")
	 private WebElement googleSearchBox;
	 
	 public SearchPage(WebDriver webDriver) {
	 this.webDriver = webDriver;
	 PageFactory.initElements(webDriver, this);
	 }
	 
	public String verifyGoogleSearchHomepage() {
		String webPageTitle = webDriver.getTitle();
		return webPageTitle;
	}
	/* Method to pass Search Data */
	public void provideGoogleSearchInput(String strSearchData) {
		googleSearchBox.sendKeys(strSearchData);
		googleSearchBox.sendKeys(Keys.ENTER);
	}
}