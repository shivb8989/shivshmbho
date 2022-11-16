package amazon;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonproductpage {

@FindBy(xpath="(//span[text()='Chhava'])[1]")
private WebElement clickonbook;

public amazonproductpage(WebDriver driver){
	PageFactory.initElements(driver, this);
}



public void clickonchhavabook() {
	clickonbook.click();
}
}
