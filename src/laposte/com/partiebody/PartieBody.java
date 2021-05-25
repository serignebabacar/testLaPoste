package laposte.com.partiebody;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import laposte.com.communs.Communs;

public class PartieBody {
	private String xpathInputSearch = "//input[@aria-label='search']";
	private String xpathTextLeBody = "//cx-carousel/h3";
	private String xpathtextResultatResearch = "//div[@class='results-number']";

	public void testSearch(WebDriver driver) throws InterruptedException {
		Communs.find(driver, By.xpath(xpathInputSearch)).sendKeys("TIMBRE");
		Communs.find(driver, By.xpath(xpathInputSearch)).sendKeys(Keys.RETURN);
		// driver.findElement(By.xpath(xpathInputSearch)).sendKeys("TIMBRE");
		// driver.findElement(By.xpath(xpathInputSearch)).sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath(xpathtextResultatResearch)).getText().endsWith("résultats"));
		driver.get(Communs.URL);
	}

	public void testNosMeilleursProduits(WebDriver driver) {

		System.out.println(Communs.isEqualText(driver.findElements(By.xpath(xpathTextLeBody)).get(0),
				"Nos Meilleurs Ventes"));
	}

	public void testNouveautes(WebDriver driver) {
		System.out.println(Communs.isEqualText(driver.findElements(By.xpath(xpathTextLeBody)).get(1), "Nouveautés"));
	}
}
