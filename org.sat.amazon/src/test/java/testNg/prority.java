package testNg;

import org.testng.annotations.Test;

public class prority {
	@Test(priority = 1)
	public void TCA() {
		System.out.println("TCA");
	}
	@Test(priority = 1)
	public void TCB() {
		System.out.println("TCB");
	}
	@Test(priority = 1)
	public void TCC() {
		System.out.println("TCC");
	}
	@Test(priority = 1)
	public void TCD() {
		System.out.println("TCD");
	}
	
}
