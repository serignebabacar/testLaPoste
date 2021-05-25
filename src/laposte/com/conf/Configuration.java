package laposte.com.conf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import laposte.com.communs.Communs;

public class Configuration {
	public static final String PROPERTY_WEBDRIVER_CHROME_DRIVER = "webdriver.chrome.driver";
	public static final String PATH_DRIVER_GOOGLE_CHROME = "/home/babacar/Téléchargements/chromedriver_linux64/chromedriver";

	public static WebDriver configuration() {
		System.setProperty(PROPERTY_WEBDRIVER_CHROME_DRIVER, PATH_DRIVER_GOOGLE_CHROME);
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(Communs.URL);
		return driver;

	}

}
