package amezon.co.in;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomclassamezon2 {
	@FindBy (xpath = "//input[@type='text']")
	private WebElement searchbar;
	@FindBy (xpath = "//input[@id='nav-search-submit-button']")
	private WebElement searchicon;
	@FindBy (xpath = "//span[@class='a-size-medium a-color-base a-text-normal']")
	private WebElement lpbag;
	
	
	
	
	public pomclassamezon2(WebDriver driver){
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void searchprd() {
		searchbar.sendKeys("laptop bags");
		
	}
	
public void  clicksearchicon() {
	searchicon.click();
	}
public void clickonlpbag() {
	lpbag.click();
}


	

	
	
	
	
	
	
	
	

}
