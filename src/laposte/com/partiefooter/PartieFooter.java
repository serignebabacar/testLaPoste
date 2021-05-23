package laposte.com.partiefooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import laposte.com.communs.Communs;

public class PartieFooter {
	public void testFooter(WebDriver driver) {
		System.out.println(Communs.isEqualText(driver.findElement(By.xpath("//h5[@aria-label='SAP Commerce Cloud']")),
				"SAP COMMERCE CLOUD"));
	}
}
