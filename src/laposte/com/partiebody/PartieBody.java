package laposte.com.partiebody;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import laposte.com.communs.Communs;

public class PartieBody {
	private String xpathtextResultatResearch = "//div[@class='results-number']";
	By xpathtInputSearch = By.xpath("//input[@aria-label='search']");
	By xpathResult = By.xpath(xpathtextResultatResearch);
	By xpathTextBody = By.xpath("//cx-carousel/h3");
	WebDriver driver;

	public PartieBody(WebDriver driver) {
		this.driver = driver;
	}

	public void testSearch() throws InterruptedException {
		driver.findElement(xpathtInputSearch).sendKeys("TIMBRE");
		driver.findElement(xpathtInputSearch).sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		System.out.println(driver.findElement(xpathResult).getText().endsWith("résultats"));
		driver.get(Communs.URL);
	}

	public void testNosMeilleursProduits() {

		System.out.println(driver.findElements(xpathTextBody).get(0).getText().equals("Nos Meilleurs Ventes"));
	}

	public void testNouveautes() {
		System.out.println(driver.findElements(xpathTextBody).get(1).getText().equals("Nos Nouveautés"));
	}
}
