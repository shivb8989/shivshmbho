package amezon.co.in;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	@ FindBy(xpath = "(//span[@class='nav-line-1 nav-progressive-content'])[2]")
	private WebElement account;
	
	
	@ FindBy(xpath = "//input[@type='email']")
	private WebElement mobileno;
	
	@ FindBy(xpath = "//input[@id='continue']")
	private WebElement continue1;
	
	
	@ FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	
	@ FindBy(xpath = "//input[@id='signInSubmit']")
	private WebElement submit;
	

	public login(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}
	public void clickonaccount() {
		
		account.click();
		
	}
	public void EnteremailID() {
		mobileno.sendKeys("9011917553");
		
	}
	public void Clickoncontinue() {
		continue1.click();
	
	}
	public void Enterpassword() {
		password.sendKeys("akash@1995");
		
	}
	
	public void clickonsubmit() {
		submit.click();
		
	}
	
	
	
	
	
	
	

}
