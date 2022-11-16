package WoodLand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class woodLandHome {
	
@FindBy(xpath = "(//a[text()='Men'])[1]")
private WebElement SelectMen;

@FindBy(xpath = "//a[@id='men_apparels_jackets_leather']")
private WebElement SelectJacket;


woodLandHome(WebDriver driver){
	PageFactory.initElements(driver, this);
}


public void ClickonMen() {
	SelectMen.click();
}
public void ClickonLeather() {
	SelectJacket.click();
}
}
