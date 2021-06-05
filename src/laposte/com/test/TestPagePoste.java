package laposte.com.test;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import laposte.com.conf.Configuration;
import laposte.com.partiebody.PartieBody;
import laposte.com.partiefooter.PartieFooter;
import laposte.com.partietop.PartieTop;

public class TestPagePoste {
	WebDriver driver;
	PartieTop partieTop;
	PartieBody partieBody;
	PartieFooter partieFooter;

	@BeforeMethod
	public void init() {
		driver = Configuration.configuration();

		partieTop = new PartieTop(driver);
		partieBody = new PartieBody(driver);
		partieFooter = new PartieFooter(driver);
	}

	@Test(priority = 2)
	public void testFindStore() throws InterruptedException {
		partieTop.testLinkFindStore();
		assertTrue(driver.getTitle().equals("StoreFinder"));
	}

	@Test(priority = 1)
	public void testLogin() {
		partieTop.testLogin();
	}

	@AfterMethod
	public void close() {
		driver.close();
	}
}
