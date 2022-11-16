package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart {
	
	
	
@FindBy(xpath="//input[@id='add-to-cart-button']")
private WebElement adcrt;



Addtocart(WebDriver driver){
	PageFactory.initElements(driver, this);
}



public void clickonAddToCart () {
	adcrt.click();
	
}


}
