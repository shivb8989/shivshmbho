package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class payandcontinue {

	
	
	@FindBy(xpath = ("(//input[@type='radio'])[5]"))
	private WebElement payment;
	
	@FindBy(xpath = "(//input[@type='submit'])[2]")
	private WebElement continuebutton;
	
	
       payandcontinue(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void SelectPayonDeleveryOption() {
		payment.click();
		
	}
	
	public void clickcontinuebutton() {
		continuebutton.click();
	}
	
}
