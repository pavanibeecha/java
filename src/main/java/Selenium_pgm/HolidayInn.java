package Selenium_pgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HolidayInn {
	
	WebDriver driver;
	public void application() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\Automation\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[contains(@id,'search')]")).sendKeys("Selenium Tutorial For Beginners | Edureka");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//yt-icon[contains(@class,'style-scope ytd-searchbox')])[2]")).click();

		
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		HolidayInn obj = new HolidayInn();
		obj.application();
	}

}
