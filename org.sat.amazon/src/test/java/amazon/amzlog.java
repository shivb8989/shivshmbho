package amazon;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class amzlog  {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/?ext_vrnc=hi&tag=googhydrabk1-21&ref=nav_signin&adgrpid=60612964962&hvpone=&hvptwo=&hvadid=486452179346&hvpos=&hvnetw=g&hvrand=511635403574289058&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062144&hvtargid=kwd-296458777401&hydadcr=14454_2154375&gclid=Cj0KCQjw-fmZBhDtARIsAH6H8qiWIUcIEUqNEN5_FycRPlw6-tVpdBn9nZi9-07K_TcpHnw8axFQEgoaAqUfEALw_wcB");
		 Thread.sleep(3000);
		 
		 AmazonloginPage  helotext= new AmazonloginPage (driver);
		 helotext.Clickonaccount();
		 Thread.sleep(3000);
		 helotext.enterEmeilId();
		 Thread.sleep(3000);
		 helotext.clickoncontinueButton();
		 Thread.sleep(3000);
		 
		 AmazonLoginpage2 pwd= new AmazonLoginpage2(driver);
		 pwd.enterPassword();
		 Thread.sleep(3000);
		 pwd.clickonsubmitButton();
		 Thread.sleep(3000);
		 
		 SearchBar srchbar= new SearchBar(driver);
		 Thread.sleep(3000);
		 srchbar.selectBookinSearchbar();
		 srchbar.enterBookname();
		 Thread.sleep(3000);
		 srchbar.clickonsubmitbutton();
		 Thread.sleep(3000);
		 
		 
		 amazonproductpage  prod =new  amazonproductpage(driver);
		 Thread.sleep(3000);
	     prod.clickonchhavabook();
	     
	     Set<String> l1= driver.getWindowHandles();
	     List <String> child1= new ArrayList(l1);
	     String wind1= child1.get(1);
	     driver.switchTo().window(wind1);
	     Thread.sleep(3000);
	     
	     Addtocart add =new Addtocart(driver);
	     add.clickonAddToCart();
	     Thread.sleep(3000);
	     
	     ByeProduct bye= new ByeProduct(driver);
	     bye.ClickonProcedToByButton();
	     Thread.sleep(3000);
	     
	     amazonDelevaryAdress dlvr= new amazonDelevaryAdress(driver);
	     dlvr.clickonDeleveryAdress();
	     Thread.sleep(3000);
	     
	     payandcontinue radio= new payandcontinue(driver);
	     radio.SelectPayonDeleveryOption();
	     Thread.sleep(3000);
	     radio.clickcontinuebutton();
	}
}
