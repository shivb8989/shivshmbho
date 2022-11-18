package amezon.co.in;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomclassamezon4 {
	WebDriver driver;
	@FindBy (xpath = "//input[@id='add-to-cart-button']")
	private WebElement addcart;
	@FindBy (xpath = "//input[@name='proceedToRetailCheckout']")
	private WebElement proceedtobuy;
	
	@FindBy (xpath = "//input[@data-testid='Address_selectShipToThisAddress']")
	private WebElement useaddres;
	@FindBy (xpath = "(//input[@type='radio'])[5]")
	private WebElement ordercod;
	
	
	
	
	public pomclassamezon4(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void addtocart() {
		addcart.click();
		
	}
	
	public void buytoprocced() {
		proceedtobuy.click();
		
	}
	public void usethisaddress() {
		useaddres.click();
		
	}
	public void clickoncodmode() {
		ordercod.click();
		
	}
}
