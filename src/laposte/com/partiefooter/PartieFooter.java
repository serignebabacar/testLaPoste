package laposte.com.partiefooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import laposte.com.communs.Communs;

public class PartieFooter {
	
	private static  String xpathLabelSapCommerceCloud = "//h5[@aria-label='SAP Commerce Cloud']";

	public void testFooter(WebDriver driver) {
		System.out.println(Communs.isEqualText(driver.findElement(By.xpath(xpathLabelSapCommerceCloud)),
				"SAP COMMERCE CLOUD"));
	}
}
