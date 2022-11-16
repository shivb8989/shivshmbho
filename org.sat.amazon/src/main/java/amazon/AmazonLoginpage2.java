package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AmazonLoginpage2 {
	
	
 @FindBy(xpath="//input[@type='password']")
   private WebElement Password;
 
 @FindBy(xpath="//input[@id='signInSubmit']")
 private WebElement submitButton;
 
  public AmazonLoginpage2(WebDriver driver){
	PageFactory.initElements(driver, this);
 }
 
 
 public  void enterPassword() {
 Password.sendKeys("Shiva@7138");
 }
 public void clickonsubmitButton() {
	 submitButton.click(); 
 }
 
}
