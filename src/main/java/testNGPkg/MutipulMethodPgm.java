package testNGPkg;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MutipulMethodPgm {
	
	@BeforeMethod
	public void bM1() {
		System.out.println("BM1");
	}
	@BeforeMethod
	public void bM2() {
		System.out.println("BM2");
	}
	
	//if our test is depending on other test then we should use "dependsOnMethd" and give Method Name
	@Test(dependsOnMethods = "testMethod2")
	public void testMethod1() {
		System.out.println("test 1");
	}
	@Test
	public void testMethod2() {
		System.out.println("test 2");
	}
	@Test
	public void testMethod3() {
		System.out.println("test 3");
	}
}
