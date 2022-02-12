package testingAuto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.annotations.Test;

public class CheckBoxSellectbox {
	WebDriver driver;

	@FindBy(id= "auth_user_name") WebElement loginName;
	@FindBy(id= "auth_password") WebElement password;
	@FindBy(id= "auth_school") WebElement schoolName;
	@FindBy(name= "Login") WebElement login;
	@FindBy(xpath="//span[contains(text(),'COMMUNICATION')]") WebElement communication;
	@FindBy(xpath="//a[contains(text(),'Send Voice Message')]") WebElement voicemessage;
	@FindBy(name="main")WebElement main;
	@FindBy(xpath="(//input[contains(@name,'sms_sending_method')])[1]")WebElement radiobutton;
	@FindBy(xpath="(//input[contains(@name,'sms_sending_method')])[2]")WebElement radiobutton1;
	@FindBy(xpath="//span[contains(text(),'EXAMS')]") WebElement exams;
	@FindBy(xpath="//a[contains(text(),'Results Upload')]") WebElement resultsupload;
	@FindBy(id= "fupload") WebElement choosefile;


	@Test
	public void checkSellectBox() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\automation\\Automation\\chromedriver.exe");
		driver = new ChromeDriver();
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 40),this);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.eschool360.in/index.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		loginName.sendKeys("admin");
		password.sendKeys("admin");
		schoolName.sendKeys("1");
		login.click();
		Thread.sleep(3000);
		communication.click();
		voicemessage.click();
		driver.switchTo().frame(main);
		radiobutton.getAttribute("checked");
		System.out.println("ststus: "+ radiobutton);

		if(radiobutton==null) {
			radiobutton.click();
		}else {
			radiobutton1.click();
		}

		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		exams.click();
		resultsupload.click();
		driver.switchTo().frame(main);
		choosefile.sendKeys("C:\\automation\\xyz1.txt");

	}

}
