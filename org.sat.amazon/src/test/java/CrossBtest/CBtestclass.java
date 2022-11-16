package CrossBtest;



import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import crossbrowser.CBbase;

public class CBtestclass extends CBbase{
	@BeforeClass
	public void BC() throws InterruptedException {
		launchbrowser("chrome");
		Thread.sleep(5000);
		launchbrowser("ME");
		Thread.sleep(5000);
		launchbrowser("firefox");
		
	}
	@BeforeMethod
	public void BM() {
		System.out.println("bm");
	}
	@Test
	public void TC01() {
		System.out.println("tco1");
	}
	@AfterMethod
	public void Logout() {
		System.out.println("logout");
	}
	@AfterClass
	public void close() {
		driver.quit();
	}

}
