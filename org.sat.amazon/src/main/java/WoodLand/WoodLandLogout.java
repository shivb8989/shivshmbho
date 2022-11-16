package WoodLand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WoodLandLogout {
	
	@FindBy(xpath = "//i[@class='fas fa-user']")
	private WebElement acc;
	
	@FindBy(xpath = "//li[@class='text-center sign-out']")
	private WebElement logout;
	
	//li[@class='text-center sign-out']
	WoodLandLogout(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void ClickonAcc() {
		acc.click();
	}
	public void ClickonLogout() {
		logout.click();
	}

}
