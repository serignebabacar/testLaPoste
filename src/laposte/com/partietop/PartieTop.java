package laposte.com.partietop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import laposte.com.communs.Communs;

public class PartieTop {
	private String linkFindStore = "https://jsapps.c4a0pho0ft-laposteaz1-s1-public.model-t.cc.commerce.ondemand.com/store-finder";
	private String xpathFindStore = "//a[@href='/store-finder']";

	public void testBrands(WebDriver driver) {
		driver.get(Communs.URL);
		Communs.click(driver.findElements(By.xpath("//cx-icon[@class='cx-icon fas fa-angle-down']")).get(0));
		Actions builder = new Actions(driver);
		moveToElement(driver, builder, "//div/nav/cx-generic-link/a[@role='link']", 0, 10);
	}

	public void moveToElement(WebDriver driver, Actions builder, String xptath, int indice, int length) {
		List<WebElement> elements = driver.findElements(By.xpath(xptath));
		for (int i = indice; i < length; i++) {
			WebElement webElement = elements.get(i);
			builder.moveToElement(webElement).build().perform();
		}
	}

	public void testDigitalCameras(WebDriver driver) {

		driver.findElements(By.xpath("//cx-icon[@class='cx-icon fas fa-angle-down']")).get(3).click();
		Actions builder = new Actions(driver);
		moveToElement(driver, builder, "//cx-generic-link/a[@role='link']", 16, 2);
	}

	public void testLinkFindStore(WebDriver driver) {
		// Communs.click(Communs.find(driver,By.xpath(xpathFindStore)));
		driver.findElement(By.xpath("//a[@href='/store-finder']")).click();
		driver.navigate().back();
	}

	public void testLogin(WebDriver driver) {
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		System.out.println(driver.getTitle().equals("Se connecter à La Poste"));
		driver.navigate().back();
	}
}
