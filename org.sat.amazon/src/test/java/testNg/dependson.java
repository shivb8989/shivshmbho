package testNg;

import static org.testng.Assert.fail;

import org.apache.commons.io.filefilter.FalseFileFilter;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dependson {
	
	
	@Test(invocationCount = 5)
	public void TC02() {
		System.out.println("TC02");
	}
	@Test(dependsOnMethods ="TC01" )
	public void TC03() {
		System.out.println("TC03");
	}
	@Test(priority = -1)
	public void TC04() {
		System.out.println("TC04");
	}
	@Test(priority = 1)
	public void TC01() {
		System.out.println("TC01");
		
	}
	
}
