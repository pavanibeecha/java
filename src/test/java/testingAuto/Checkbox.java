package testingAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Checkbox {
	
	WebDriver driver;
	
	@Test
	public void application() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\Automation\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://demo.eschool360.in/index.php");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.id("auth_user_name")).sendKeys("admin");
		driver.findElement(By.id("auth_password")).sendKeys("admin");
		driver.findElement(By.id("auth_school")).sendKeys("1");
		driver.findElement(By.xpath("//input[contains(@name,'Login')]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[contains(text(),'COMMUNICATION')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Send Voice Message')]")).click();
		Thread.sleep(2000);
		
		driver.switchTo().frame("main");
		String radiobuttonstatus= driver.findElement(By.xpath("(//input[contains(@name,'sms_sending_method')])[2]")).getAttribute("checked");
		System.out.println("radio button status: " + radiobuttonstatus);	
		
		if(radiobuttonstatus==null) {
			driver.findElement(By.xpath("(//input[contains(@name,'sms_sending_method')])[2]")).click();
		}
		
	}
}
