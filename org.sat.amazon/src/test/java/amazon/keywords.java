package amazon;

import org.testng.annotations.Test;

public class keywords {
	
	@Test(priority = 1)
	public void TC02() {
		System.out.println("TC02");
	}
	@Test(enabled = false)
	public void TC03() {
		System.out.println("TC03");
	}
	@Test(priority = -1)
	public void TC04() {
		System.out.println("TC04");
	}
	@Test(enabled = false)
	public void TC01() {
		System.out.println("TC01");
	}
	
}
