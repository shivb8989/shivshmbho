package WoodenGaram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class woodenlogin {
	WebDriver driver;
	
	
	@FindBy(xpath = "//a[text()='Profile']")
	private WebElement prof;
	
	@FindBy(xpath = "//a[@id='login_popup_btn']")
	private WebElement sign;
	
	@FindBy(xpath = "//input[@id='login_email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement pass;
	
	@FindBy(xpath = "//button[@id='login_submit_btn']")
	private WebElement submit;
	
	
	
	public woodenlogin(WebDriver driver){
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	
	
	public void clickonprofile() {
		Actions act1= new Actions(driver);
		act1.moveToElement(prof).perform();
		act1.click(sign).perform();
	}
	
	public void Enteremail() {
		email.sendKeys("shivajibiradar75074@gmail.com");
		
	}
	public void Enterpassword() {
		pass.sendKeys("Shivaji@1234#");
	}
	
	public void ClickonSubmit() {
		submit.click();
	}
	
}
