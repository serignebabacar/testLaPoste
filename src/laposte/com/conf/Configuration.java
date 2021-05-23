package laposte.com.conf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import laposte.com.communs.Communs;

public class Configuration {
	public static WebDriver configuration() {
		System.setProperty("webdriver.chrome.driver",
				"/home/babacar/Téléchargements/chromedriver_linux64/chromedriver");
		WebDriver driver   = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(Communs.URL);
		return driver;
		
	}

}
