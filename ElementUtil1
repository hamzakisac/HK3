package SeleniumMethods;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
	
	/**
	 * This method is used to launch Browsers
	 * @param driver
	 * @param browserName
	 * @return
	 */
	public static WebDriver launchBrowser(WebDriver driver, String browserName) {
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/hamzakisac/Documents/Drivers/chromedriver");
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/hamzakisac/Documents/Drivers/geckodriver");
			driver = new FirefoxDriver();
		} else {
			System.out.println("Browser is not available : " + browserName);
		}
		return driver;

	}
	
	/**
	 * 
	 * @param driver
	 * @param url
	 */
	public static void launchURL(WebDriver driver, String url) {
		driver.get(url);
	}

	/**
	 * This method is used to get Page Title
	 * @param driver
	 * @return
	 */

	public static String getPageTitle(WebDriver driver) {
		return driver.getTitle();
	}
	
	/**
	 * This method is used to get an Element
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static WebElement getElement(WebDriver driver, By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}
	
	/**
	 * This method i used to click on an Element
	 * @param driver
	 * @param locator
	 */
	public static void clickOn(WebDriver driver, By locator) {
		driver.findElement(locator).click();
	}

	/**
	 * This method is used to handle alert
	 * 
	 * @param driver
	 * @return
	 */

	public static String getAlertText(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		return text;
	}
	/**
	 * This method is used to locate an element
	 * @param driver
	 * @param locator
	 * @param key
	 */
	public static void Locator(WebDriver driver,By locator, String key) {
		driver.findElement(locator).sendKeys(key);;
			
	}
	
	/**
	 * This method is used to find locator and send keys
	 * @param driver
	 * @param locator
	 * @param key
	 * @return
	 */
	public static void sendElement(WebDriver driver,By locator, String key) {
		driver.findElement(locator).sendKeys(key);;
			
	}
	
	/**
	 * This method is used to select dropDown Elements by TEXT
	 * @param element
	 * @param value
	 */
	public static void selectDropDownValueByText(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	
	/**
	 * This method is used to Select by INDEX 
	 * @param element
	 * @param index
	 */
	public static void selectDropDownByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	/**
	 * This method is used to select dropDown Elements without Select Class
	 * @param driver
	 * @param byXpathLocator
	 */
	public static void  manualSelecting(WebDriver driver, By byXpathLocator) {
		
		List<WebElement> dayList = driver.findElements(byXpathLocator);
		System.out.println(dayList.size());
		
		for (int i = 0; i < dayList.size(); i++) {
			String text = dayList.get(i).getText();
			//System.out.print(text + " ");
			if (text.equals("15")) {
				dayList.get(i).click();
				break;
			}
		}
	}
	
	/**
	 * This method is used to get dropDownOptions as Text
	 * @param element
	 */
	public static void dropDownOptions(WebElement element) {
		Select select = new Select(element);
		
		List<WebElement> dayOptions = select.getOptions();
		System.out.println(dayOptions.size());
		for (int i = 0; i < dayOptions.size(); i++) {
			System.out.println(dayOptions.get(i).getText());
			
		}
		
	}
	

	
	
	
	
	
	
	
	
	

}
