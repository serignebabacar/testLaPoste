package laposte.com.main;

import org.openqa.selenium.WebDriver;

import laposte.com.conf.Configuration;
import laposte.com.partiebody.PartieBody;
import laposte.com.partiefooter.PartieFooter;
import laposte.com.partietop.PartieTop;

public class Main {
	static WebDriver driver;
	static PartieTop partieTop;
	static PartieBody partieBody;
	static PartieFooter partieFooter;

	public static void main(String[] args) throws InterruptedException {
		scenario1();
		scenario2();
		scenario3();
		scenario4();
		scenario5();
	}

	private static void scenario1() throws InterruptedException {
		getInstanceDriver();
		instanciationParties();
		partieTop.testLogin();
		partieTop.testLinkFindStore();
		partieBody.testNosMeilleursProduits();
		partieBody.testNouveautes();
		System.out.println(partieFooter.getTextFooter().equals("MIEUX NOUS CONNAÎTRE"));
		driver.close();
	}

	private static void instanciationParties() {
		partieTop = new PartieTop(driver);
		partieBody = new PartieBody(driver);
		partieFooter = new PartieFooter(driver);
	}

	private static void scenario2() throws InterruptedException {
		getInstanceDriver();
		instanciationParties();
		System.out.println(partieFooter.getTextFooter().equals("MIEUX NOUS CONNAÎTRE"));
		partieBody.testNosMeilleursProduits();
		partieBody.testNouveautes();
		partieTop.testLogin();
		partieTop.testLinkFindStore();
		driver.close();
	}

	private static void scenario3() throws InterruptedException {
		getInstanceDriver();
		instanciationParties();
		partieTop.testLogin();
		partieTop.testLinkFindStore();
		partieBody.testNosMeilleursProduits();
		partieBody.testNouveautes();
		driver.close();

	}

	private static void scenario4() throws InterruptedException {
		getInstanceDriver();
		instanciationParties();
		partieTop.testLogin();
		partieTop.testLinkFindStore();
		System.out.println(partieFooter.getTextFooter().equals("MIEUX NOUS CONNAÎTRE"));
		driver.close();
	}

	private static void getInstanceDriver() {
		driver = Configuration.configuration();
	}

	private static void scenario5() throws InterruptedException {
		getInstanceDriver();
		instanciationParties();
		System.out.println(partieFooter.getTextFooter().equals("MIEUX NOUS CONNAÎTRE"));
		partieBody.testNosMeilleursProduits();
		partieBody.testNouveautes();
		partieTop.testLogin();
		partieTop.testLinkFindStore();
		driver.close();
	}
}
