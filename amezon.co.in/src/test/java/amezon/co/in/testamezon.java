package amezon.co.in;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import baseclass.baseclass;

public class testamezon extends baseclass{
	
	login l1;
	pomclassamezon2 s1;
	pomclassamezon3 logout;
	pomclassamezon4 s2;
	
	@BeforeClass
	
	public void akashr() {
		launchbrowser();
	
	}
	
	@ BeforeMethod
	public void loginaapli() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
	}
		
		@ Test
		public void login() throws InterruptedException {
		
		
		 l1=new login(driver);
		
		 l1.clickonaccount();
		
		 l1.EnteremailID();
		 Thread.sleep(2000);
		 l1.Clickoncontinue();
		 Thread.sleep(2000);
		 l1.Enterpassword();
		 Thread.sleep(2000);
		 l1.clickonsubmit();
		}
		
	
	
	@ Test
	
	public void searchbar() {
		
		pomclassamezon2 s1=new pomclassamezon2(driver);
		s1.searchprd();
		s1.clicksearchicon();
		s1.clickonlpbag();
		
		
	}
	
@ Test
	
	public void addtocart() {
		
		s2=new pomclassamezon4(driver);
		s2.addtocart();
		s2.buytoprocced();
		s2.clickoncodmode();
		
		
	}
	
	
	
	@AfterMethod
	
	
		public void logoutappln() throws InterruptedException { 
			Thread.sleep(3000);
		 logout= new pomclassamezon3(driver);
		 logout.movekonaccount();
				
		
		}
		
	
	
	@AfterClass
	
	public void closebr() {
		
		
		driver.quit();
	}
	
	
	
	
	
	
	
	
	

}
