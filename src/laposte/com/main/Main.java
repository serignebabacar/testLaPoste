package laposte.com.main;

import org.openqa.selenium.WebDriver;

import laposte.com.conf.Configuration;
import laposte.com.partiebody.PartieBody;
import laposte.com.partiefooter.PartieFooter;
import laposte.com.partietop.PartieTop;

public class Main {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = Configuration.configuration();

		PartieTop partieTop = new PartieTop();
		PartieBody partieBody = new PartieBody();
		PartieFooter partieFooter = new PartieFooter();

		partieTop.testBrands(driver);
		// blackTopParti.testLinkFindStore(driver);
		partieTop.testLogin(driver);

		partieBody.testNosMeilleursProduits(driver);
		partieBody.testNouveautes(driver);

		partieFooter.testFooter(driver);

		driver.close();
		driver.quit();
	}

}
