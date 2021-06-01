package laposte.com.partiefooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PartieFooter {
	WebDriver driver;
	
	By xpathLabelSapCommerceCloud = By.xpath("//h5[@aria-label='Mieux nous connaître ']");

	public PartieFooter(WebDriver driver) {
		this.driver = driver;
	}

	public String getTextFooter() {
		return driver.findElement(xpathLabelSapCommerceCloud).getText();
	}
}
