package testNGPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert {
	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();
	
	@Test
	public void softasser() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\Automation\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://demo.eschool360.in/index.php");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.id("auth_user_name")).sendKeys("admin");
		driver.findElement(By.id("auth_password")).sendKeys("admin");
		driver.findElement(By.id("auth_school")).sendKeys("1");
		driver.findElement(By.xpath("//input[contains(@name,'Login')]")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		String expected = "School";
		String actual = driver.getTitle();
		softAssert.assertEquals(expected, actual);
		softAssert.assertNotEquals(expected, actual);
		driver.findElement(By.xpath("//span[contains(text(),'EXAMS')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Marks Entry')] ")).click();
		System.out.println("I have crossed assertion");
		softAssert.assertAll();
	}

}



