package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonloginPage {
	
	
	@FindBy(xpath="//span[text()='Account & Lists']")
	private WebElement text;
	
	
	@FindBy(xpath="//input[@id='ap_email']")
	private WebElement emailId;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continueButton;
	
	
	
	public AmazonloginPage (WebDriver driver){
	PageFactory.initElements(driver, this);

	}
	
	
	
	public void Clickonaccount() {
	text.click();
	}
	
	public void enterEmeilId() {
		emailId.sendKeys("9923956544");
	}
	
	public void clickoncontinueButton() {
		continueButton.click();
	}
}
