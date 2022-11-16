package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ByeProduct {
	@FindBy(xpath = "//input[@name='proceedToRetailCheckout']")
	private WebElement toBye;
	
	
	ByeProduct(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void ClickonProcedToByButton() {
		toBye.click();
	}
	
}
