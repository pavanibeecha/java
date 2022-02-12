package testNGPkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterClass1 {
	
	@Parameters({"NAME"})
	@Test
	public void method1(String str) {
		System.out.println("i am in Method1");
		System.out.println("String " + str);
	}

}
