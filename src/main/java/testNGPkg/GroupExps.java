package testNGPkg;

import org.testng.annotations.Test;

public class GroupExps {
	
	@Test(groups = "regrassion")
	public void testMethod1() {
		System.out.println("I am in TestMethod 1");
	}
	@Test(groups = "regrassion")
	public void testMethod2() {
		System.out.println("I am in TestMethod 2");
	}
	@Test(groups = "smoketest")
	public void testMethod3() {
		System.out.println("I am in TestMethod 3");
	}
	@Test(groups = "sanitytest")
	public void testMethod4() {
		System.out.println("I am in TestMethod 4");
	}


}
