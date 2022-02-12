package testNGPkg;


import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import org.testng.asserts.Assertion;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class PageFactory_demo360 {

	protected ExtentHtmlReporter htmlReporter;
	protected ExtentReports extent;
	protected ExtentTest test;
	WebDriver driver;

	//PageFactory syntax using findBy
	@FindBy(id= "auth_user_name") WebElement loginName;
	@FindBy(id= "auth_password") WebElement password;
	@FindBy(id= "auth_school") WebElement schoolName;
	@FindBy(name= "Login") WebElement login;
	@FindBy(xpath="//span[contains(text(),'EXAMS')]") WebElement exam;
	@FindBy(xpath="//a[contains(text(),'Marks Entry')]") WebElement marksentry;
	@FindBy(id= "class_name") WebElement className;
	@FindBy(id= "section_id") WebElement section;
	@FindBy(id= "exam_main_type_id_for_exam_name_combo") WebElement examMainType;
	@FindBy(id= "exam_type_id_for_exam_type_combo") WebElement examType;
	@FindBy(xpath="//input[contains(@id,'mode')]") WebElement save;
	@FindBy(xpath= "//a[contains(text(),'Exams Master')]") WebElement examMaster;
	@BeforeTest
	public void extentReportSetup() {

		System.out.println("I am in BeforeTest");
		// location and external report
		htmlReporter = new ExtentHtmlReporter("extentReport.html");    
		// Create object of ExtentReports
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);        
		htmlReporter.config().setDocumentTitle("Automation Report"); // Tittle of Report
		htmlReporter.config().setReportName("Extent Report V4"); // Name of the report
		htmlReporter.config().setTheme(Theme.DARK);//Default Theme of Report
		// General information releated to application
		extent.setSystemInfo("Application Name", "Application");
	}


	@Test
	public void loadURL() throws InterruptedException {

		test = extent.createTest("MYDEMOTEST","Script start execution");
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\Automation\\chromedriver.exe");
		driver = new ChromeDriver();
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 40),this);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.eschool360.in/index.php");
		Thread.sleep(3000);
		test.info("Page loaded ");
		System.out.println(loginName);
		//login
		loginName.sendKeys("admin");
		password.sendKeys("admin");
		schoolName.sendKeys("1");
		login.click();
		Thread.sleep(3000);
		
		//exam @ marksentry 
		exam.click();
		marksentry.click();
		driver.switchTo().frame(driver.findElement(By.id("main")));
		//CLASS NAME
		className.click();
		Select sel = new Select(className);
		sel.selectByIndex(1);
		Thread.sleep(500);
		// SECTION SELECT
		section.click();
		sel = new Select(section);
		sel.selectByIndex(1);
		Thread.sleep(500);
		//EXAM MAIN TYPE
		examMainType.click();
		sel = new Select(examMainType);
		sel.selectByIndex(2);
		Thread.sleep(500);
		//EXAM TYPE
		examType.click();
		sel = new Select(examType);
		sel.selectByIndex(1);
		Thread.sleep(500);

		//driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		test.info("Exam Marks page loaded successful");

	/*	JavascriptExecutor jse = (JavascriptExecutor)driver; // casting the driver into javaScript executor

		String existing_marks = "95/85/92/88/80/100";
		String[] indv_marks = existing_marks.split("/");


		//Adding values into textboxes
		WebElement student_marks_element ;
		for(int student = 1;student <= 5;student ++) {
			int marks_iter = 0;
			for(int marks = 2; marks <= 7; marks++) {
				student_marks_element = driver.findElement(By.xpath("//th[contains(text(),'Student')]/ancestor::tr[1]/following-sibling::tr["+student+"]/td["+marks+"]/input"));
				//student_marks_element.sendKeys(Keys.chord(Keys.CONTROL,"a"),"95");
				jse.executeScript("arguments[0].value= '"+indv_marks[marks_iter]+"';",student_marks_element );
				marks_iter = marks_iter+1;
				// jse.executeScript("arguments[0].value= '"+existing_marks+"';",student_marks_element );
			}
		}

		save.click();
		test.info("Marks updation done");
		Thread.sleep(2000);
		Alert alert =driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		test.info("Alert option succesfully");
		driver.switchTo().defaultContent();
		examMaster.click();
		Thread.sleep(2000);
		exam.click();
		marksentry.click();
		Thread.sleep(20000);
		driver.switchTo().frame(driver.findElement(By.id("main")));
		//loop for marks entry
		String existing_marks1 = "95/85/95/98/60/90";
		String[] indv_marks1 = existing_marks.split("/");

		//Adding values into textboxes
		WebElement student_marks_element1 ;
		for(int student = 1;student <= 5;student ++) {
			int marks_iter = 0;
			for(int marks = 2; marks <= 7; marks++) {
				student_marks_element1 = driver.findElement(By.xpath("//th[contains(text(),'Student')]/ancestor::tr[1]/following-sibling::tr["+student+"]/td["+marks+"]/input"));
				String stu_marks_value = student_marks_element1.getAttribute("value");
				//Assertion.assertNotEquals(indv_marks1[marks_iter], stu_marks_value);

				assertEquals(indv_marks1[marks_iter], stu_marks_value);
				marks_iter = marks_iter+1; 
			}
			test.info("Row comparission completed Successfully");
		}
		test.info("Test executed Successfully");*/

	}

	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
		extent.flush();
	}

}
