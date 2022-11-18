package testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CROSSbase {
	
	public static WebDriver driver;
	
public static void BrowserLaunch(String browser) throws InterruptedException {
	if(browser.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	driver = new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("ME")) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\shiva\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		
	}else if(browser.equalsIgnoreCase("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shiva\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		
	}
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.amazon.in/?ie=UTF8&tag=googmantxtmob50-21&ascsubtag=_k_Cj0KCQiAyMKbBhD1ARIsANs7rEGzbtHYhSI98nJTjc2Kl94-vihxhcJSzNpGnIbcnwfztzR1_ReVipoaAsR6EALw_wcB_k_&gclid=Cj0KCQiAyMKbBhD1ARIsANs7rEGzbtHYhSI98nJTjc2Kl94-vihxhcJSzNpGnIbcnwfztzR1_ReVipoaAsR6EALw_wcB");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	
}
}
