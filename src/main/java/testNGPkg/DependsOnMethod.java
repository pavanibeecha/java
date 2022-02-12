package testNGPkg;

import org.testng.annotations.*;

public class DependsOnMethod {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am in BeforeMethod1");
	}
	@AfterMethod
	public void AfterMethod() {
		System.out.println("I am in AfterMethod");
	}
	@Test
	public void testMethod1() {
		System.out.println("I am in TestMethod1");
	}
	
}
