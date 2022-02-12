package testNGPkg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	
	@Test(dataProvider = "getDataMethod")
	public void testMethod1(String Username, String Password, String abc) {
		System.out.println(Username );
		System.out.println(Password);
		System.out.println(abc);
	}

	@Test(dataProvider = "getDataMethod")
	public void testMethod2(String Username, String Password, String abc) {
		System.out.println(Username );
		System.out.println(Password);
		System.out.println(abc);
	}
	
	@Test(dataProvider = "getDataMethod")
	public void testMethod3(String Username, String Password, String abc) {
		System.out.println(Username );
		System.out.println(Password);
		System.out.println(abc);
	}
	
/*	@DataProvider
	public Object[][] getDataMethod(){
		Object[][ ]data = new Object[2][2];
		//FirstRow
		data[0][0] ="Sri";
		data[0][1] ="nopws";
		//second Row
		data[1][0]="sriw";
		data[1][1]="psword1";
		
		return data;
	}*/
	@DataProvider
	public Object[][] getDataMethod(){
		return new Object[][] {
			{"sri","pasword123","dser"},{"auto","nopassword234","45sdh"}
		
	};
	}
}