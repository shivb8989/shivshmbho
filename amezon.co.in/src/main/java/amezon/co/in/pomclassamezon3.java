package amezon.co.in;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomclassamezon3 {
	WebDriver driver;
	@FindBy (xpath = "//span[text()='Account & Lists']")
	private WebElement accountlogout;
	@FindBy (xpath = "//span[text()='Sign Out']")
	private WebElement Signout;
	
	
	
	public pomclassamezon3(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void movekonaccount() {
		Actions actions=new Actions(driver);
		actions.moveToElement(accountlogout).perform();
		Signout.click();
	}
	
	

}
