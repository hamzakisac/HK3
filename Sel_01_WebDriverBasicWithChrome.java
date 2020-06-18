package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_01_WebDriverBasicWithChrome {

	public static void main(String[] args) {

		// Set Property

		WebDriverManager.chromedriver().setup();
		//main
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.siliconelabs.com");		//org.openqa.selenium.WebDriverException
														//org.openqa.selenim.InvalidArgumentException

		String title = driver.getTitle();

		System.out.println("Title : " + title);

		if (title.equals("Homepage - SiliconeLabs")) {
			System.out.println("Correct Title : " + title);
		} else {
			System.out.println("Incorrect Title : " + title);
		}

		String currentUrl = driver.getCurrentUrl();
		System.out.println("Currect URL : " + currentUrl);

//		String source = driver.getPageSource();
//		System.out.println(source);

		driver.quit();

	}

}
