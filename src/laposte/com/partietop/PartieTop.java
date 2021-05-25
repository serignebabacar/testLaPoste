package laposte.com.partietop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import laposte.com.communs.Communs;

public class PartieTop {
	private String urlFindStore = "https://jsapps.c4a0pho0ft-laposteaz1-s1-public.model-t.cc.commerce.ondemand.com/store-finder";
	private String xpathLinkFindStore = "//a[@href='/store-finder']";
	private String xpathLinkBrands="//cx-icon[@class='cx-icon fas fa-angle-down']";
	private String xptathLink = "//div/nav/cx-generic-link/a[@role='link']";
	private String xpathLinkLogin = "//a[@href='/login']";
	public void testBrands(WebDriver driver) {
		driver.get(Communs.URL);
		Communs.click(driver.findElements(By.xpath(xpathLinkBrands)).get(0));
		Actions builder = new Actions(driver);
		moveToElement(driver, builder, xptathLink, 0, 10);
	}

	private  void moveToElement(WebDriver driver, Actions builder, String xptath, int indice, int length) {
		List<WebElement> elements = driver.findElements(By.xpath(xptath));
		for (int i = indice; i < length; i++) {
			WebElement webElement = elements.get(i);
			builder.moveToElement(webElement).build().perform();
		}
	}


	public void testLinkFindStore(WebDriver driver) throws InterruptedException {
		 Communs.click(Communs.find(driver,By.xpath(xpathLinkFindStore)));
		//driver.findElement(By.xpath(xpathLinkFindStore)).click();
		Thread.sleep(2000);
		 System.out.println(driver.getTitle().equals("StoreFinder"));
		driver.navigate().back();
	}

	public void testLogin(WebDriver driver) {
		Communs.click(Communs.find(driver, By.xpath(xpathLinkLogin)));		
		//driver.findElement(By.xpath(xpathLinkLogin)).click();
		System.out.println(driver.getTitle().equals("Se connecter à La Poste"));
		driver.navigate().back();
	}
}
