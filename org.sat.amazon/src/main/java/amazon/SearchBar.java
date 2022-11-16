package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class SearchBar {
	
	
@FindBy(xpath="//select[@id='searchDropdownBox']")

private WebElement searchIn;

@FindBy(xpath="//input[@id='twotabsearchtextbox']")
private WebElement Book;

@FindBy(xpath="//input[@id='nav-search-submit-button']")
private WebElement submit;


 SearchBar(WebDriver driver){
	PageFactory.initElements(driver, this);
}


public void selectBookinSearchbar() {
	Select se = new Select(searchIn);
	se.selectByVisibleText("Books");
	searchIn.click();
}
public void enterBookname() {
	Book.sendKeys("Chhava");
}
public void clickonsubmitbutton() {
	submit.click();
}




}
