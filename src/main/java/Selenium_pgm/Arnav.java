package Selenium_pgm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Arnav {
	
	WebDriver driver;

	public void url_Launch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\Automation\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.navigate().to("https://google.com");
		
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		WebElement dino = driver.findElement(By.xpath("//input[contains(@title,'Search')]"));
		dino.sendKeys("dinosaurs names");
		dino.click();
		
		dino.sendKeys(Keys.chord(Keys.ENTER));
		
		dino.sendKeys(Keys.ENTER);
	//	Select dino1 = new Select(dino);
		//dino1.selectByIndex(2);
		Thread.sleep(2000);
		
		//input[contains(@title,'Search')]
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Arnav obj = new Arnav();
		obj.url_Launch();
	}

}
