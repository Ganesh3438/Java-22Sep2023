package testNgConcepts;

import org.testng.annotations.Test;

public class TC05_TestDependency {
	
	@Test
	public void searchTest() {
		System.out.println("searchTest");
		int i= 9/0;
	}
	
	@Test(dependsOnMethods = "searchTest")
	public void addTocart() {
		System.out.println("addTocart");
	}
	
	@Test(dependsOnMethods = "addTocart")
	public void makePayment() {
		System.out.println("makePayment");
	}

}
