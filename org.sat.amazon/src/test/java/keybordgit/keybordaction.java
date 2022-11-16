package keybordgit;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keybordaction {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfacebook%20signin%7C&placement=&creative=589460569891&keyword=facebook%20signin&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-3821998899%26loc_physical_ms%3D9040233%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAiA68ebBhB-EiwALVC-Nsn3et_OY1123fi-gxLVE0USxOc4e3H7od5QHS6nsIXCXTRb0l4Z2hoC6ocQAvD_BwE");
	
	driver.manage().window().maximize();

	
	Thread.sleep(2000);
	WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
	month.click();
	Thread.sleep(2000);
	
	
	Actions actions= new Actions(driver);
	Thread.sleep(2000);
	actions.sendKeys(Keys.ARROW_UP).perform();
	Thread.sleep(2000);
	actions.sendKeys(Keys.ARROW_UP).perform();
	Thread.sleep(2000);
	actions.sendKeys(Keys.ARROW_UP).perform();
	Thread.sleep(2000);
	
	actions.sendKeys(Keys.ARROW_DOWN).click().build().perform();	
}

}
