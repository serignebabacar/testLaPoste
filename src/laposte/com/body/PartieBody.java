package laposte.com.body;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import laposte.com.communs.Communs;

public class PartieBody {
	public void testSearch(WebDriver driver) {
		//
	}

	public void testNosMeilleursProduits(WebDriver driver) {
		System.out.println(
				Communs.isEqualText(driver.findElements(By.xpath("//cx-carousel/h3")).get(0), "Nos Meilleurs Ventes"));
	}

	public void testNouveautes(WebDriver driver) {
		System.out.println(Communs.isEqualText(driver.findElements(By.xpath("//cx-carousel/h3")).get(1), "Nouveautés"));
	}
}
