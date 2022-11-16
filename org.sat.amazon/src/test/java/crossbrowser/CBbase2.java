package crossbrowser;


// done
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CBbase2 {
	public static WebDriver driver;
public void launchbrowser(String browser) throws InterruptedException {
	
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
	driver.get("https://www.amazon.in/");
	
}
}
