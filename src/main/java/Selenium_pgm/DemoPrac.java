package Selenium_pgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.internal.MouseAction.Button;
import org.openqa.selenium.support.ui.Select;

public class DemoPrac {

	WebDriver driver;
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
		//driver.findElement(By.xpath("//a[contains(text(),'SMS Message Master')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Send Bulk SMS')]")).click();
		Thread.sleep(500);
		
		driver.switchTo().frame("main");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(@id,'menu_database')]")).click();
		//Group
		WebElement group = driver.findElement(By.xpath("//select[contains(@id,'SMS_receiver_group')]"));
		group.click();
		Select groupsellect = new Select(group);
		groupsellect.selectByIndex(7);
		Thread.sleep(1000);
		//Section
		WebElement section = driver.findElement(By.xpath("//select[contains(@id,'db_sectionid')]"));
		section.click();
		Select sectionsellect = new Select(section);
		sectionsellect.selectByIndex(2);
		Thread.sleep(1000);
		//Student
		WebElement stu = driver.findElement(By.xpath("//select[contains(@id,'db_studentid')]"));
		stu.click();
		Select stusellect = new Select(stu);
		stusellect.selectByIndex(1);
		Thread.sleep(1000);
		//Message 
		WebElement mt = driver.findElement(By.xpath("//select[contains(@id,'combobox_template')]"));
		mt.click();
		Select mtsellect = new Select(mt);
		mtsellect.selectByIndex(1);
		
		
		
		//Exam Marks
		/*driver.findElement(By.xpath("//b[contains(text(),'Exam Marks')]"));
		WebElement exammarks = driver.findElement(By.xpath("//b[contains(text(),'Exam Marks')]"));
		exammarks.click();
		Select examselect = new Select(exammarks);
		examselect.selectByIndex(1);
		
		WebElement class1= driver.findElement(By.xpath("//label[contains(text(),'Class')]"));
		class1.click();
		//Select classsellect = new Select(class1);
		//classsellect.selectByIndex(1);
		//driver.findElement(By.xpath("//span[contains(text(),'Select Classes')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Select all')]")).click();*/
		
		
		
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		DemoPrac obj =new DemoPrac();
		obj.application();
	}

}
