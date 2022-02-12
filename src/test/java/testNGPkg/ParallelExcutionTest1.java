package testNGPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExcutionTest1 {
	
	WebDriver driver;
	
	@Test
	public void testMethod1() throws InterruptedException {
		
		System.out.println("I am in TestMethod 1");
		
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\Automation\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.navigate().to("https://demo.eschool360.in/index.php");
		Thread.sleep(2000);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"auth_user_name\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"auth_password\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"auth_school\"]")).sendKeys("1");
		driver.findElement(By.name("Login")).click();
		Thread.sleep(2000);

		
	}
	@Test
	public void testMethod2() throws InterruptedException {
		System.out.println("I am in TestMethod 2");
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\Automation\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.navigate().to("https://demo.eschool360.in/index.php");
		Thread.sleep(2000);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"auth_user_name\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"auth_password\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"auth_school\"]")).sendKeys("1");
		driver.findElement(By.name("Login")).click();
		Thread.sleep(2000);

	}
	@Test
	public void testMethod3() throws InterruptedException {
		System.out.println("I am in TestMethod 3");
		System.out.println("I am in TestMethod 2");
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\Automation\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.navigate().to("https://demo.eschool360.in/index.php");
		Thread.sleep(2000);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"auth_user_name\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"auth_password\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"auth_school\"]")).sendKeys("1");
		driver.findElement(By.name("Login")).click();
	}
	@Test
	public void testMethod4() throws InterruptedException {
		System.out.println("I am in TestMethod 4");
		System.out.println("I am in TestMethod 2");
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\Automation\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.navigate().to("https://demo.eschool360.in/index.php");
		Thread.sleep(2000);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"auth_user_name\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"auth_password\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"auth_school\"]")).sendKeys("1");
		driver.findElement(By.name("Login")).click();
	}
	

}
