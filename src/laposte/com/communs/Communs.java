package laposte.com.communs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Communs {
	public static String URL = "https://jsapps.c4a0pho0ft-laposteaz1-s1-public.model-t.cc.commerce.ondemand.com/";

	public static void click(WebElement webEelement) {
		webEelement.click();
	}

	public boolean isDisplayElement(WebElement webElement) {
		return webElement.isDisplayed();
	}
	public static WebElement find(WebDriver driver,By locator) {
		return driver.findElement(locator);
	}
	public static boolean isEqualText(WebElement element,String text) {
		return element.getText().equals(text);
	}
}
