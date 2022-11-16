package WoodLand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WoodLandLoginpage {
	@FindBy(xpath ="//i[@class='fas fa-user']" )
	private WebElement account;
	
	@FindBy(xpath ="//span[@class='icon-login']" )
	private WebElement icon;
	
	
	@FindBy(xpath ="(//input[@class='input-field'])[1]" )
	private WebElement email;
	
	@FindBy(xpath ="(//input[@class='input-field'])[2]" )
	private WebElement password;
	
	@FindBy(xpath ="(//button[@type='button'])[6]" )
	private WebElement loginbutton;
	
	
	
	
	WoodLandLoginpage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	public void ClickonAccount() {
		account.click();
	}
	public void ClickonIcon() {
		icon.click();
	}
	public void enterEmail() {
		email.sendKeys("shivajibiradar75074@gmail.com");
	}
	public void enterpassword() {
		password.sendKeys("Shiva@7138");
	}
	public void Clickonlogin() {
		loginbutton.click();
	}
	

}
