package laposte.com.partietop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import laposte.com.communs.Communs;

public class PartieTop {
	By xpathLinkLogin = By.xpath("//a[@href='/login']");
	By xpathLinkFindStor = By.xpath("//a[@href='/store-finder']");
	By xpathLinkBrands = By.xpath("//cx-icon[@class='cx-icon fas fa-angle-down']");
	private String xptathLink = "//div/nav/cx-generic-link/a[@role='link']";
	WebDriver driver;

	public PartieTop(WebDriver driver) {
		this.driver = driver;
	}

	public void testBrands() {
		driver.get(Communs.URL);
		driver.findElements(xpathLinkBrands).get(1).click();
		Actions builder = new Actions(driver);
		moveToElement(driver, builder, xptathLink, 0, 10);
	}

	private void moveToElement(WebDriver driver, Actions builder, String xptath, int indice, int length) {
		List<WebElement> elements = driver.findElements(By.xpath(xptath));
		for (int i = indice; i < length; i++) {
			WebElement webElement = elements.get(i);
			builder.moveToElement(webElement).build().perform();
		}
	}

	public void testLinkFindStore() throws InterruptedException {
		driver.findElement(xpathLinkFindStor).click();

	}

	public void testLogin() {
		driver.findElement(xpathLinkLogin).click();
	}
}
