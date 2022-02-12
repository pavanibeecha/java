package testNGPkg;

import org.testng.annotations.*;

public class AllAnnotations {

	@BeforeSuite
	public void beforeSuite() {

		System.out.println(" i am in beforesuite");
	}

	@AfterSuite
	public void AfterSuite() {

		System.out.println(" i am in AfterSuite");
	}

	@BeforeTest
	public void beforeTest() {

		System.out.println(" i am in beforeTest");
	}

	@AfterTest
	public void afterTest() {

		System.out.println(" i am in afterTest");
	}

	@BeforeClass
	public void beforeClass() {

		System.out.println(" i am in before class");
	}

	@AfterClass
	public void afterClass() {

		System.out.println(" i am in afterClass");
	}

	@BeforeMethod
	public void beforeMethod() {

		System.out.println(" i am in beforeMethod");
	}

	@AfterMethod
	public void afterMethod() {

		System.out.println(" i am in afterMethod");
	}

	@Test
	public void testMethod() {

		System.out.println(" i am in testMethod");
	}
}
