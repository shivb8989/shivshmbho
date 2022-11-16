package WoodLand;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WoodlandTest {
	
 
	   WebDriver driver;
	   WoodLandLoginpage WL;
	   woodLandHome WH;
	   WoodlandSelectProduct WP;
	   WoodLandLogout WO;
	
	@BeforeClass
	public void LaunchBrowser()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodlandworldwide.com/?clgId=10");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	}
	@BeforeMethod
	public void Loguin() throws InterruptedException {
		 WL= new WoodLandLoginpage(driver);
		 Thread.sleep(3000);
		 WL.ClickonAccount();
		 Thread.sleep(3000);
		 WL.ClickonIcon();
		 Thread.sleep(3000);
		 WL.enterEmail();
		 Thread.sleep(3000);
		 WL.enterpassword();
		 Thread.sleep(3000);
		 WL.Clickonlogin();
	}
  @Test
  public void TC01() throws InterruptedException {
	    WH= new woodLandHome(driver) ;
	    Thread.sleep(3000);
	    WH.ClickonMen();
	    Thread.sleep(3000);
	    WH.ClickonLeather();
	    Thread.sleep(3000);
	 
	    WP= new WoodlandSelectProduct (driver);
	    WP.ClickOnProduct();
	    Thread.sleep(3000);
	    WP.ClickOnSize();
	    Thread.sleep(3000);
	    WP.ClickOnAddtocart();
	    Thread.sleep(3000);
	    WP.Clickoncartbutton();
	    Thread.sleep(3000);
	    WP.ClickonCartIcon();
  }
       @AfterMethod
        public void LogOut() throws InterruptedException {
	    WO= new WoodLandLogout(driver);
	    Thread.sleep(3000);
	    WO.ClickonAcc();
	    Thread.sleep(3000);
	    WO.ClickonLogout();
  }
       @AfterClass
        public void afterclass() {
	    driver.close(); 
       }
	
}

