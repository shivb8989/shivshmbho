package CrossBtest;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import amazon.AmazonLoginpage2;
import amazon.AmazonloginPage;
import crossbrowser.CBbase2;

public class CROSSBROWSERTEST1 extends CBbase2 {
	WebDriver driver;
	AmazonloginPage AL;
	AmazonLoginpage2 AL2;
	@Parameters("browser")
	@BeforeClass
	public void launch(String browservalue) throws InterruptedException {
		System.out.println(browservalue);
		launchbrowser(browservalue);
		
	}
	
	@BeforeMethod
	public void login() throws InterruptedException {
		System.out.println("me");
	}
	
	@Test
	public  void TCo1() {
		System.out.println("shiva");
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
