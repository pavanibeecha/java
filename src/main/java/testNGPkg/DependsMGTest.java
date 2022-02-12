package testNGPkg;

import org.testng.annotations.Test;

public class DependsMGTest {
	
	@Test(groups = "pretests")
	public void init() {
		System.out.println("I am in init Method");
	}
	
	@Test(groups = "tests",dependsOnGroups = "pretests")
	public void insert() {
		System.out.println(" I am in Insert Method");
	}
	
	@Test(dependsOnMethods = "insert",groups = "tests")
	public void selectMethod() {
		System.out.println("I am in selectMethod");
	}
	
	@Test(dependsOnMethods = "selectMethod", groups = "tests")
	public void updatedMethod() {
		System.out.println("I am in UpdateMethod");
	}
	
	@Test(dependsOnMethods = {"insert","updatedMethod"},groups = "tests")
	public void deleteMethod() {
		System.out.println("I am in DeleteMethod");
	}
	
	@Test(dependsOnGroups = "tests")
	public void cleanUpMethod() {
		System.out.println("I am in CleanUpMethod");
	}

}
