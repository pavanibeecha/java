package testingAuto;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SimpleLogin_FluentWait {

	WebDriver driver;
	public String msg=null;

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
	public void demomethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\Automation\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.eschool360.in/index.php");
		editBox_Util(loginName, "username", "login Page","admin" );
		editBox_Util(password, "password", "login page", "admin");
		editBox_Util(school, "schoolname", "login page", "1");
		//login.findElement(driver).click();
		click_method(login, "login button", "login page");
		click_method(exams, "exams option","setup page");
		click_method(marksentry, "exams option", "setup page");
		driver.switchTo().frame("main");
		select_method(classname,1);
		select_method(sectionId, 1);
		select_method(examMainType, 1);
		select_method(examType, 1);
	}
	public  String elementPresent(By locator, String locatorName, String pageName) {
		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		//WebElement element =(WebElement) locator;
		try {
			Wait<WebDriver> wait =  new FluentWait<WebDriver>(driver)
					//new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(30))
					.pollingEvery(Duration.ofSeconds(5))
					.ignoring(StaleElementReferenceException.class);
			//.ignoring(StaleElementReferenceException.class);
			//.until(ExpectedConditions.visibilityOfElementLocated(By.id("auth_user_name")));
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//System.out.println(e.getMessage());
			//e.printStackTrace();
			System.out.println("I have entered into catch block");
			//e.printStackTrace();
			msg = "Locator Name:-"+locatorName+" : "+locator+" is not identified in Page : "+pageName;
		}
		return msg;
	}
	public void select_method(By locator, int index) {
		locator.findElement(driver).click();
		Select sel = new Select(locator.findElement(driver));
		sel.selectByIndex(index);
	}
	//login.findElement(driver).click();
	public void click_method(By locator,String locatorName, String pageName ) {
		msg = elementPresent(locator, locatorName, pageName);
		if(msg ==null) {
			locator.findElement(driver).click();
		}else {
			System.out.println(msg);
		}	
	}	
	public void editBox_Util(By locator, String locatorName, String pageName, String value) {
		System.out.println(driver);
		System.out.println(locator);
		msg = elementPresent(locator, locatorName, pageName);
		if(msg==null) {
			locator.findElement(driver).sendKeys(Keys.chord(Keys.CONTROL,"a"),value);
		}else {
			System.out.println(msg);
		}
	}
}
