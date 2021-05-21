package laposte.com.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import laposte.com.blacktopparti.BlackTopParti;
import laposte.com.conf.Configuration;

public class Main {
	static WebDriver driver;

	public static void main(String[] args) {
		
		Configuration.configuration();
		driver = new ChromeDriver();
		BlackTopParti blackTopParti = new BlackTopParti();
		blackTopParti.testFindStore(driver);
	//	driver.close();
	}

}
