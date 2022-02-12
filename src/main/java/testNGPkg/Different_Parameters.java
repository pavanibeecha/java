package testNGPkg;

import org.testng.annotations.*;

public class Different_Parameters {
	
	@Parameters({"suite-param"})
	@Test
	public void method1(String param) {
		System.out.println("I am in Method1");
		System.out.println("String Value :" + param);
	}
	@Parameters({"test-2-param"})
	@Test
	public void method2(String param) {
		System.out.println("I am in Method2");
		System.out.println("String Value :" + param);
	}
	@Parameters({"suite1-param","test-3-param"})
	@Test
	public void method3(String param,String param2) {
	System.out.println("3rd method");
	System.out.println("String value :" + param);
	System.out.println("2nd String value :" + param2);
	}
	
}
