package WoodLand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WoodlandSelectProduct {
	
	
@FindBy(xpath = "(//span[text()='Black leather jacket'])[1]")
private WebElement Selectproduct;

@FindBy(xpath = "//li[text()='L']")
private WebElement SelectSize;

@FindBy(xpath = "//span[text()='ADD TO CART']")
private WebElement Addcart;

@FindBy(xpath = "(//i[@class='fas fa-shopping-cart'])[1]")
private WebElement cartbutton;


@FindBy(xpath = "(//span[@class=\"iconcart\"])[1]")
private WebElement carticon ;

WoodlandSelectProduct(WebDriver driver){
	PageFactory.initElements(driver, this);
}
public void ClickOnProduct() {
	Selectproduct.click();
}
public void ClickOnSize() {
	SelectSize.click();
}
public void ClickOnAddtocart() {
	Addcart.click();
}
public void Clickoncartbutton() {
	cartbutton.click();
}
public void ClickonCartIcon() {
	carticon.click();
}


}
