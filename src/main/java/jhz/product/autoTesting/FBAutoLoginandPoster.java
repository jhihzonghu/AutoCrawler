package jhz.product.autoTesting;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class FBAutoLoginandPoster {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "https://www.facebook.com/");
		selenium.start();
	}

	@Test
	public void testFBAutoLoginandPoster() throws Exception {
		selenium.open("/");
		selenium.type("id=email", "bonejuehu0408@gmail.com");
		selenium.type("id=pass", "need.student");
		selenium.click("id=u_0_l");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=u_0_11");
		selenium.type("id=u_0_11", "test123");
		selenium.click("xpath=(//button[@value='1'])[7]");
		// selenium.();
		// selenium.();
		// selenium.();
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
