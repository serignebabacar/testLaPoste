package laposte.com.main;

import org.openqa.selenium.WebDriver;

import laposte.com.blacktopparti.PartieTop;
import laposte.com.body.PartieBody;
import laposte.com.conf.Configuration;
import laposte.com.footer.PartieFooter;

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
