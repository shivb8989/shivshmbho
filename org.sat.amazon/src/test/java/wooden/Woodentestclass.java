package wooden;




import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import WoodenGaram.woodenlogin;

public class Woodentestclass extends Woodebaseclass  {
	
	 WebDriver driver;
	
	 woodenlogin WL;
	
	@BeforeClass
	public static void launch() {
		Woodebaseclass .launchbrowser();
	}
	@BeforeMethod
	public  void login() throws InterruptedException {
		Thread.sleep(3000);
		 WL= new woodenlogin(driver);
		 Thread.sleep(3000);
		 WL.clickonprofile();
		 Thread.sleep(3000);
		 WL.Enteremail();
		 Thread.sleep(3000);
		 WL.Enterpassword();
		 Thread.sleep(3000);
		 WL.ClickonSubmit();
	}
	@Test
	public  void TC01() {
		System.out.println("tc01");
	}
	@AfterMethod
	public  void logout() {
		System.out.println(" log out");
	}
	@AfterClass
	public  void close() {
		System.out.println(" close");
	}

}
