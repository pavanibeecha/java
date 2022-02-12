package testNGPkg;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority = 3,alwaysRun = true)
	public void testMethod1() {
		System.out.println("I am in TestMethod 1");
	}
	@Test(priority = 1, enabled=true,invocationCount = 5)
	public void testMethod2() {
		System.out.println("I am in TestMethod 2");
	}
	@Test(priority = 2, enabled=false)
	public void testMethod3() {
		System.out.println("I am in TestMethod 3");
	}

}
