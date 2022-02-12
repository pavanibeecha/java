package Selenium_pgm;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoPgm {

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
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'EXAMS')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Marks Entry')]")).click();
		Thread.sleep(2000);
		//ways to write frames
		//driver.switchto().frame("main") // main is name of the frame..
		//driver.switchto().frame(1); // 1 is the index of the frame
		//driver.switchTo().frame("//iframe[contains(@id,'main')]");
		driver.switchTo().frame(driver.findElement(By.id("main")));

		WebElement classname = driver.findElement(By.xpath("//select[contains(@id,'class_name')]"));
		classname.click();
		Select classsellect = new Select(classname);
		classsellect.selectByIndex(3);	
		Thread.sleep(500);
		WebElement section = driver.findElement(By.xpath("//select[contains(@id,'section_id')]"));
		section.click();
		Select sectionsellect = new Select(section);
		sectionsellect.selectByVisibleText("Section B");
		Thread.sleep(500);
		WebElement exammain = driver.findElement(By.xpath("//select[contains(@id,'exam_main_type_id_for')]"));
		exammain.click();
		Select examsellect = new Select(exammain);
		examsellect.selectByIndex(1);
		Thread.sleep(500);
		WebElement examtype = driver.findElement(By.xpath("//select[contains(@id,'exam_type_id_for')]"));
		examtype.click();
		Select etypesellect = new Select(examtype);
		etypesellect.selectByIndex(1);
		Thread.sleep(1000);
		//driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		/*WebElement student_marks_element ;
		for(int student = 1;student <= 5;student ++) {
			for(int marks = 2; marks <= 7; marks++) {
				student_marks_element = driver.findElement(By.xpath("//th[contains(text(),'Student')]/ancestor::tr[1]/following-sibling::tr["+student+"]/td["+marks+"]/input"));
				//student_marks_element.sendKeys(Keys.chord(Keys.CONTROL,"a"),"95");
				student_marks_element.sendKeys(Keys.chord(Keys.CONTROL,"a"),"75");

			}		
		}*/


		JavascriptExecutor jsc =  (JavascriptExecutor) driver;
		String existing_marks = "90/80/79/67/89/90";
		String [] indv_marks = existing_marks.split("/");

		WebElement student_marks_element ;
		for(int student = 1;student <= 5;student ++) {
			int marks_iter = 0;
			for(int marks = 2; marks <= 7; marks++) {
				student_marks_element = driver.findElement(By.xpath("//th[contains(text(),'Student')]/ancestor::tr[1]/following-sibling::tr["+student+"]/td["+marks+"]/input"));
				//student_marks_element.sendKeys(Keys.chord(Keys.CONTROL,"a"),"95");
				jsc.executeScript("arguments[0].value='"+indv_marks[marks_iter]+"';",student_marks_element);
				marks_iter = marks_iter+1;
				//	System.out.println(student_marks_element.getAttribute("value"));

			}			
		} 
		//	WebElement studentname = driver.findElement(By.xpath("//th[contains(text(),'Student')]/ancestor::tr[1]/following-sibling::tr[1]/td[1]"));


		/*	JavascriptExecutor jsc =  (JavascriptExecutor) driver;
		String existing_marks = "90";

		WebElement student_marks_element ;
		for(int student = 1;student <= 5;student ++) {
			int marks_iter = 0;
			for(int marks = 2; marks <= 7; marks++) {
				student_marks_element = driver.findElement(By.xpath("//th[contains(text(),'Student')]/ancestor::tr[1]/following-sibling::tr["+student+"]/td["+marks+"]/input"));
				//student_marks_element.sendKeys(Keys.chord(Keys.CONTROL,"a"),"95");
				jsc.executeScript("arguments[0].value='"+existing_marks+"';",student_marks_element);
				marks_iter = marks_iter+1;

				System.out.println(student_marks_element.getAttribute("value"));
			}
			//WebElement save= driver.findElement(By.xpath("//input[contains(@id,'mode')]"));
			//jsc.executeScript("argument[0].click()",save);

		} */	

		//	WebElement save= driver.findElement(By.xpath("//input[contains(@id,'mode')]"));
		//	jsc.executeScript("argument[0].click()",save);

		driver.findElement(By.xpath("//input[contains(@id,'mode')]")).click();

		Thread.sleep(2000);
		WebElement marks = driver.findElement(By.xpath("//th[contains(text(),'Student')]/ancestor::tr[1]/following-sibling::tr[6]/td[3]/input"));
		System.out.println(marks.getAttribute("value"));
		Thread.sleep(2000);
		WebElement lablename = driver.findElement(By.xpath("//th[contains(text(),'Student')]"));
		System.out.println(lablename.getText());

		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Marks Entry')]")).click();
		Thread.sleep(3000);
		//Adding values into textboxes
		WebElement student_marks_element1 ;
		for(int student = 1;student <= 5;student ++) {
			int marks_iter = 0;
			for(int markss = 2; markss <= 7; markss++) {
				student_marks_element1 = driver.findElement(By.xpath("//th[contains(text(),'Student')]/ancestor::tr[1]/following-sibling::tr["+student+"]/td["+marks+"]/input"));
				String stu_marks_value = student_marks_element1.getAttribute("value");

				if(indv_marks[marks_iter].equals(stu_marks_value) ) {
					System.out.println("PASS");
				} else {
					System.out.println("FAIL");
				}
				marks_iter = marks_iter+1;
				//student_marks_element.sendKeys(Keys.chord(Keys.CONTROL,"a"),"95");
				// jse.executeScript("arguments[0].value= '"+indv_marks[marks_iter]+"';",student_marks_element1 );
				// marks_iter = marks_iter+1;
				// jse.executeScript("arguments[0].value= '"+existing_marks+"';",student_marks_element );

			}
		}
		//driver.switchTo().defaultContent();

		
		
		//	driver.findElement(By.xpath("//a[contains(text(),'Exams Master')]")).click();
		
		//	Thread.sleep(2000);



		/*driver.findElement(By.xpath("//span[contains(text(),'COMMUNICATION')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'SMS Message Master')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Send Bulk SMS')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//b[contains(text(),'Exam Marks')]"));
	/*	WebElement exammarks = driver.findElement(By.xpath("//b[contains(text(),'Exam Marks')]"));
		exammarks.click();
		Select examselect = new Select(exammarks);
		examselect.selectByIndex(1);*/




	}


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		DemoPgm obj = new DemoPgm();
		obj.application();
	}

}
