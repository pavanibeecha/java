package testNGPkg;

import org.testng.annotations.Test;

public class ParallelExcutionTest {

	@Test
	public void testMethod1() {
		System.out.println("I am in TestMethod 1");
	}
	@Test
	public void testMethod2() {
		System.out.println("I am in TestMethod 2");
	}
	@Test
	public void testMethod3() {
		System.out.println("I am in TestMethod 3");
	}
	@Test
	public void testMethod4() {
		System.out.println("I am in TestMethod 4");
	}
	
}
