package testingAuto;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.annotations.Test;

public class GmailPgm {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Gmail')]") WebElement gmail;
	@FindBy(xpath="//a[contains(text(),'Sign in')]") WebElement signin;
	@FindBy(xpath="//input[contains(@type,'email')]") WebElement emailId; 
	@FindBy(xpath="//span[contains(text(),'Next')]") WebElement next;
	@FindBy(name="password") WebElement password;
	@FindBy(xpath="//div[contains(text(),'Compose')]")WebElement compose;
	@FindBy(xpath="//a[contains(text(),'Inbox')]") WebElement inbox;
	@FindBy(xpath="//textarea[contains(@name,'to')]")WebElement composeto;
	@FindBy(xpath="//input[contains(@name,'subjectbox')]")WebElement subject;
	@FindBy(xpath="//div[contains(@class,'Am Al editable LW-avf tS-tW')]")WebElement body;
	@FindBy(xpath="(//div[contains(text(),'Send')])[2]")WebElement send;
	@FindBy(xpath="//a[contains(text(),'Sent')]") WebElement sent;
	@Test
	public void gmailinbox() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\Automation\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://google.com");
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 40),this);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		gmail.click();
		signin.click();
		emailId.sendKeys("pavanibandam7@gmail.com");
		next.click();
		Thread.sleep(2000);
		password.sendKeys("abhi@1988");
		password.sendKeys(Keys.ENTER);
		compose.click();
		composeto.sendKeys("kroja9@gmail.com");
		composeto.sendKeys(Keys.TAB);
		subject.sendKeys("Impotant mail");
		subject.sendKeys(Keys.TAB);
		body.sendKeys("automated :) ");
		send.click();
		Thread.sleep(1000);
		sent.click();
		//inbox.click();
	}

}
