package laposte.com.communs;

import org.openqa.selenium.WebElement;

public class Communs {
	public static String URL = "https://jsapps.c4a0pho0ft-laposteaz1-s1-public.model-t.cc.commerce.ondemand.com/";

	public void click(WebElement webEelement) {
		webEelement.click();
	}

	public boolean isDisplayElement(WebElement webElement) {
		return webElement.isDisplayed();
	}
}
