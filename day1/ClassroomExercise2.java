package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClassroomExercise2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver Driver = new ChromeDriver();
Driver.get("http://leaftaps.com/opentaps");
Driver.manage().window().maximize();
Driver.findElement(By.id("username")).sendKeys("DemoCSR");
Driver.findElement(By.id("password")).sendKeys("crmsfa");
Thread.sleep(2000);
Driver.findElement(By.className("decorativeSubmit")).click();
Driver.findElement(By.partialLinkText("CRM/SFA")).click();
Driver.findElement(By.partialLinkText("Leads")).click();
Driver.findElement(By.partialLinkText("Create Lead")).click();
Driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
Driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priyanka");
Driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ravi");
WebElement wb1 = Driver.findElement(By.id("createLeadForm_dataSourceId"));
Select obj1 = new Select(wb1);
obj1.selectByVisibleText("Website");
Thread.sleep(3000);
Driver.findElement(By.className("smallSubmit")).click();
	}

}

