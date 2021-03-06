package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.ReadStaticProperyFile;

public class SearchResultPage {
	 WebDriver webDriver;
	 
	 public SearchResultPage(WebDriver webDriver) {
	 this.webDriver = webDriver;
	 PageFactory.initElements(webDriver, this);
	 }
	 
	 @FindBy(xpath = "//a[@href='https://www.jpmorgan.com/']")
		private WebElement LinkClick;
	 By verifyImage = By.xpath("//div[@class='logo-desktop-only']//div[@class='logo container-fluid']");

public String verifyHomepage() {
	String pageTitle = webDriver.getTitle();
	return pageTitle;
}

/* This Method is used to click link on the result page */
public void clickOnWebLink() {
	LinkClick.click();
	WebDriverWait wait = new WebDriverWait(webDriver,
			Integer.parseInt(ReadStaticProperyFile.getConfigData("pageloadTimeout")));
	wait.until(ExpectedConditions.presenceOfElementLocated(verifyImage));
}
}