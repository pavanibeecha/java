package testingAuto;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.annotations.Test;

public class Xpath {

	WebDriver driver;
	@FindBy(id= "auth_user_name") WebElement loginName;
	@FindBy(id= "auth_password") WebElement password;
	@FindBy(id= "auth_school") WebElement schoolName;
	@FindBy(name= "Login") WebElement login;
	@FindBy(xpath="//span[contains(text(),'SETUP')]") WebElement setup;
//	@FindBy(xpath="//span[contains(text(),'SETUP')]/ancestor::ul//following-sibling::li[1]/a") WebElement classmaster;
	@FindBy(xpath="//a[contains(text(),'Class Master')]") WebElement classmaster;
	@FindBy(xpath="//a[contains(text(),'Section Master')]") WebElement sectionmaster;
	@FindBy(xpath="//a[contains(text(),'Subject Master')]") WebElement subjectmaster;
	@FindBy(xpath="//a[contains(text(),'Class Sections')]") WebElement classsection;
	@FindBy(xpath="//a[contains(text(),'Class Section Subject Teachers')]") WebElement classsecsub;
	@FindBy(xpath="(//a[contains(text(),'Time Table')])[1]") WebElement timetabe;
	@FindBy(xpath="//a[contains(text(),'Notice Board')]") WebElement noticeboard;
	@FindBy(xpath="//a[contains(text(),'Academic Year Details')]") WebElement academicyd;
	@FindBy(xpath="//a[contains(text(),'Change Password')]") WebElement cpassword;
	@FindBy(xpath="//a[contains(text(),'Academic Year Terms')]") WebElement acayt;
	@FindBy(xpath="//a[contains(text(),'Upload School Logo')]") WebElement uploadsl;
	@FindBy(xpath="//span[contains(text(),'ADMISSIONS')]") WebElement admis;
	@FindBy(xpath="//a[contains(text(),'Enroll Pre-Admissions')]") WebElement preadmin;
	@FindBy(xpath="//span[contains(text(),'STUDENTS')]") WebElement student;
	@FindBy(xpath="//a[contains(text(),'Student Master')]") WebElement studentmaster;
	@FindBy(xpath="//a[contains(text(),'Student Health Metrics')]") WebElement studenhm;
	@FindBy(xpath="//a[contains(text(),'Student Promotion')]") WebElement  studentpro;
	@FindBy(xpath="//a[contains(text(),'Student Info Academic Year wise')]") WebElement studentinfo;
	@FindBy(xpath="//a[contains(text(),'Digital Diary')]") WebElement digitaldiary;
	@FindBy(xpath="//a[contains(text(),'Media Diary')]") WebElement mediadiary;
	@FindBy(xpath="//a[contains(text(),'Students Attendance')]") WebElement studentatt;
	@FindBy(xpath="//a[contains(text(),'Students Attendance View')]") WebElement studentattview;;
	@FindBy(xpath="//a[contains(text(),'Students Import')]") WebElement studentimport;
	@FindBy(xpath="(//a[contains(text(),'Reports')])[1]") WebElement stureport ;
	@FindBy(xpath="//span[contains(text(),'STAFF')]") WebElement staff;
	@FindBy(xpath="(//span[contains(text(),'STAFF')]/ancestor::ul[1]//following-sibling::li[1])[1]") WebElement teachers;
	@FindBy(xpath="(//span[contains(text(),'STAFF')]/ancestor::ul[1]//following-sibling::li[1])[2]") WebElement teachersatt;
	@FindBy(xpath="(//span[contains(text(),'STAFF')]/ancestor::ul[1]//following-sibling::li[1])[3]") WebElement teachersattview;
	@FindBy(xpath="(//span[contains(text(),'STAFF')]/ancestor::ul[1]//following-sibling::li[1])[4]") WebElement staffimp;
	@FindBy(xpath="(//a[contains(text(),'Reports')])[2]") WebElement staffreports;
	@FindBy(xpath="(//span[contains(text(),'STAFF')]/ancestor::ul[1]//following-sibling::li[1])[6]") WebElement nonteach;
	@FindBy(xpath="(//span[contains(text(),'STAFF')]/ancestor::ul[1]//following-sibling::li[1])[8]") WebElement nonteacatt;
	@FindBy(xpath="(//span[contains(text(),'STAFF')]/ancestor::ul[1]//following-sibling::li[1])[9]") WebElement nonteachersattview;
	@FindBy(xpath="//span[contains(text(),'COMMUNICATION')]") WebElement communication;
	@FindBy(xpath="(//span[contains(text(),'COMMUNICATION')]/ancestor::ul[1]//following-sibling::li[1])[1]") WebElement smsmessma;
	@FindBy(xpath="(//span[contains(text(),'COMMUNICATION')]/ancestor::ul[1]//following-sibling::li[1])[2]") WebElement voicemessMast;
	@FindBy(xpath="(//span[contains(text(),'COMMUNICATION')]/ancestor::ul[1]//following-sibling::li[1])[3]") WebElement sendBulksms;
	@FindBy(xpath="(//span[contains(text(),'COMMUNICATION')]/ancestor::ul[1]//following-sibling::li[1])[4]") WebElement sendvoicmess;
	@FindBy(xpath="(//span[contains(text(),'COMMUNICATION')]/ancestor::ul[1]//following-sibling::li[1])[5]") WebElement schedulevoic;
	@FindBy(xpath="(//span[contains(text(),'COMMUNICATION')]/ancestor::ul[1]//following-sibling::li[1])[6]") WebElement noteification;
	@FindBy(xpath="(//span[contains(text(),'COMMUNICATION')]/ancestor::ul[1]//following-sibling::li[1])[7]") WebElement smsdeliry;
	@FindBy(xpath="//span[contains(text(),'EXAMS')]") WebElement exams;
	@FindBy(xpath="(//span[contains(text(),'EXAMS')]/ancestor::ul[1]//following-sibling::li[1]/a)[1]") WebElement examMTmaster;
	@FindBy(xpath="(//span[contains(text(),'EXAMS')]/ancestor::ul[1]//following-sibling::li[1]/a)[2]") WebElement examTmaster;
	@FindBy(xpath="(//span[contains(text(),'EXAMS')]/ancestor::ul[1]//following-sibling::li[1]/a)[3]") WebElement examsmaster;
	@FindBy(xpath="(//span[contains(text(),'EXAMS')]/ancestor::ul[1]//following-sibling::li[1]/a)[4]") WebElement examTimeTable;
	@FindBy(xpath="(//span[contains(text(),'EXAMS')]/ancestor::ul[1]//following-sibling::li[1]/a)[5]") WebElement marksEntry;
	@FindBy(xpath="(//span[contains(text(),'EXAMS')]/ancestor::ul[1]//following-sibling::li[1]/a)[6]") WebElement gradeRange;
//	@FindBy(xpath="(//span[contains(text(),'EXAMS')]/ancestor::ul[1]//following-sibling::li[1]/a)[7]") WebElement marksEntry;
//	@FindBy(xpath="(//span[contains(text(),'EXAMS')]/ancestor::ul[1]//following-sibling::li[1]/a)[5]") WebElement marksEntry;
//	@FindBy(xpath="(//span[contains(text(),'EXAMS')]/ancestor::ul[1]//following-sibling::li[1]/a)[5]") WebElement marksEntry;
	
	
	
	@Test
	
	public void menu() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\Automation\\chromedriver.exe");
		driver = new ChromeDriver();
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 40),this);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.eschool360.in/index.php");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		loginName.sendKeys("admin");
		password.sendKeys("admin");
		schoolName.sendKeys("1");
		login.click();
		Thread.sleep(200);
		setup.click();
		Thread.sleep(200);
		classmaster.click();
		Thread.sleep(200);
		sectionmaster.click();
		Thread.sleep(200);
		subjectmaster.click();
		Thread.sleep(200);
		classsection.click();
		Thread.sleep(200);
		classsecsub.click();
		Thread.sleep(200);
		timetabe.click();
		Thread.sleep(200);
		noticeboard.click();
		Thread.sleep(200);
		academicyd.click();
		Thread.sleep(200);
		cpassword.click();
		Thread.sleep(200);
		acayt.click();
		Thread.sleep(200);
		uploadsl.click();
		Thread.sleep(200);
		admis.click();
		Thread.sleep(200);
		preadmin.click();
		Thread.sleep(200);
		student.click();
		studentmaster.click();
		studenhm.click();
		studentpro.click();
		studentinfo.click();
		digitaldiary.click();
		mediadiary.click();
		studentatt.click();
		studentattview.click();
		studentimport.click();
		stureport.click();
		staff.click();
		teachers.click();
		teachersatt.click();
		teachersattview.click();
		staffimp.click();
		staffreports.click();
		nonteach.click();
		nonteacatt.click();
		nonteachersattview.click();
		communication.click();
		smsmessma.click();
		voicemessMast.click();
		sendBulksms.click();
		sendvoicmess.click();
		schedulevoic.click();
		noteification.click();
		smsdeliry.click();
		
	}
	
}
