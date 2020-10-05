package helper;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CucumberSeleniumTestBase {

	public static WebDriver webDriver;
	public static String browserName = ReadStaticProperyFile.getConfigData("browserName");
	public static String chromeBrowserDriverPath = ReadStaticProperyFile.getConfigData("ChromeBrowserDriverPath");
	public static String edgeBrowserDriverPath = ReadStaticProperyFile.getConfigData("EdgeBrowserDriverPath");
	
	/* Method to setup Browser*/
	public static WebDriver driverSetup() {
		try {
			switch (browserName) {
			
			case "FirefoxBrowser":
				webDriver = new FirefoxDriver();
				break;
			case "ChromeBrowser":
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + chromeBrowserDriverPath);
				webDriver = new ChromeDriver();
				break;
			case "EdgeBrowser":
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + edgeBrowserDriverPath);
				webDriver = new ChromeDriver();
				break;
			default:
				System.out.println("Non of the Browser is  defined");
				break;
			}
		} catch (Exception e) {
			System.out.println("catching exception during browser setup" + e.getMessage());
			e.printStackTrace();
		}
		return webDriver;
	}
	
	
	/* Method to validate the element is displayed or not */
	public static boolean isWebElementVisible(WebElement element) {
		boolean isElementDisplayed = false;
		try {
			isElementDisplayed = element.isDisplayed();
		} catch (NoSuchElementException e) {
			System.out.println("Element is not displayed");
		}
		return isElementDisplayed;
	}
}
