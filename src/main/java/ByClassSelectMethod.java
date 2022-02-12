import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ByClassSelectMethod {

	WebDriver driver;
	public static By loginName = By.id("auth_user_name");
	public static By password = By.id("auth_password");
	public static By school = By.id("auth_school");
	public static By login = By.name("Login");
	public static By exams = By.xpath("//span[contains(text(),'EXAMS')]"); 
	public static By marksentry = By.xpath("//a[contains(text(),'Marks Entry')] ");
	public static By frame = By.id("main");
	public  By classname =By.id("class_name");
	public static By sectionId = By.id("section_id");
	public static By examMainType = By.id("exam_main_type_id_for_exam_name_combo");
	public static By examType = By.id("exam_type_id_for_exam_type_combo");



	@Test
	public void demome() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\automation\\Automation\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.eschool360.in/index.php");
		Thread.sleep(3000);
		loginName.findElement(driver).sendKeys("admin");
		password.findElement(driver).sendKeys("admin");
		school.findElement(driver).sendKeys("1");
		login.findElement(driver).click();
		driver.manage().window().maximize();
		exams.findElement(driver).click();
		Thread.sleep(3000);
		marksentry.findElement(driver).click();
		driver.switchTo().frame(frame.findElement(driver));
		Thread.sleep(1000);
		selecting(classname, 1);
		Thread.sleep(500);
		selecting(sectionId, 1);
		Thread.sleep(500);
		selecting(examMainType, 1);
		Thread.sleep(500);
		selecting(examType, 1);
		Thread.sleep(500);
		//selecting(sectionId.findElement(driver), 2);
		//Thread.sleep(500);
		/*	classname.findElement(driver).click();
		//Select sel = new Select(driver.findElement(classname));
		Select sel = new Select(classname.findElement(driver));
		sel.selectByIndex(1);
		Thread.sleep(500);
		sectionId.findElement(driver).click();
		Select sel1 = new Select(sectionId.findElement(driver));
		sel1.selectByIndex(2);
		Thread.sleep(500);
		examMainType.findElement(driver).click();
		Select sel2 = new Select(examMainType.findElement(driver));
		sel2.selectByIndex(1);
		Thread.sleep(500);
		examType.findElement(driver).click();
		Select sel3 = new Select(examType.findElement(driver));
		sel3.selectByIndex(1);
		Thread.sleep(500);*/

	}

	public void selecting(By classname2, int index) {
		classname2.findElement(driver).click();
		Select sel = new Select(classname2.findElement(driver));
		sel.selectByIndex(index);
	}

}
