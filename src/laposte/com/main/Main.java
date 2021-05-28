package laposte.com.main;

import org.openqa.selenium.WebDriver;

import laposte.com.conf.Configuration;
import laposte.com.partiebody.PartieBody;
import laposte.com.partiefooter.PartieFooter;
import laposte.com.partietop.PartieTop;

public class Main {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		PartieTop partieTop = new PartieTop();
		PartieBody partieBody = new PartieBody();
		PartieFooter partieFooter = new PartieFooter();
		scenario1(partieTop, partieBody, partieFooter);
		scenario2(partieTop, partieFooter,partieBody);
		scenario3(partieTop, partieBody);
		scenario4(partieTop, partieFooter);
		scenario5(partieTop, partieBody, partieFooter);
	}

	private static void scenario1(PartieTop partieTop, PartieBody partieBody, PartieFooter partieFooter)
			throws InterruptedException {
		driver = Configuration.configuration();
		partieTop.testLogin(driver);
		partieTop.testLinkFindStore(driver);
		partieBody.testNosMeilleursProduits(driver);
		partieBody.testNouveautes(driver);
		partieFooter.testFooter(driver);
		driver.close();
	}

	private static void scenario2(PartieTop partieTop, PartieFooter partieFooter, PartieBody partieBody)
			throws InterruptedException {
		driver = Configuration.configuration();
		partieFooter.testFooter(driver);
		partieBody.testNosMeilleursProduits(driver);
		partieBody.testNouveautes(driver);
		partieTop.testLogin(driver);
		partieTop.testLinkFindStore(driver);
		driver.close();
	}

	private static void scenario3(PartieTop partieTop, PartieBody partieBody) throws InterruptedException {
		driver = Configuration.configuration();
		partieTop.testLogin(driver);
		partieTop.testLinkFindStore(driver);
		partieBody.testNosMeilleursProduits(driver);
		partieBody.testNouveautes(driver);
		driver.close();

	}

	private static void scenario4(PartieTop partieTop, PartieFooter partieFooter) throws InterruptedException {
		driver = Configuration.configuration();
		partieTop.testLogin(driver);
		partieTop.testLinkFindStore(driver);
		partieFooter.testFooter(driver);
		driver.close();
	}
	private static void scenario5(PartieTop partieTop,PartieBody partieBody, PartieFooter partieFooter) throws InterruptedException {
		driver = Configuration.configuration();
		partieFooter.testFooter(driver);
		partieBody.testNosMeilleursProduits(driver);
		partieBody.testNouveautes(driver);
		partieTop.testLogin(driver);
		partieTop.testLinkFindStore(driver);
		driver.close();
	}
}
