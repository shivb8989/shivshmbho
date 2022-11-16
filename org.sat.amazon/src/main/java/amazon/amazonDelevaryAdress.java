package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonDelevaryAdress {
	
	
@FindBy(xpath = "//a[@data-action='page-spinner-show']")
private WebElement adress;




amazonDelevaryAdress(WebDriver driver){
	PageFactory.initElements(driver, this);
}





public void clickonDeleveryAdress() {
	adress.click();	
}







}
