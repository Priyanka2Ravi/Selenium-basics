package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClassroomExercise3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
ChromeDriver Driver = new ChromeDriver();
Driver.get("http://leaftaps.com/opentaps");
Driver.manage().window().maximize();
Driver.findElement(By.id("username")).sendKeys("demoSalesManager");
Driver.findElement(By.id("password")).sendKeys("crmsfa");
Thread.sleep(2000);
Driver.findElement(By.className("decorativeSubmit")).click();
Driver.findElement(By.partialLinkText("CRM/SFA")).click();
Driver.findElement(By.partialLinkText("Leads")).click();
Driver.findElement(By.partialLinkText("Create Lead")).click();
Driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
Driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priyanka");
Driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ravi");
Select obj1 = new Select(Driver.findElement(By.id("createLeadForm_dataSourceId")));
obj1.selectByIndex(3);
Select obj2 = new Select(Driver.findElement(By.id("createLeadForm_marketingCampaignId")));
obj2.selectByVisibleText("Automobile");
Select obj3 = new Select(Driver.findElement(By.id("createLeadForm_ownershipEnumId")));
obj3.selectByValue("OWN_SCORP");
Thread.sleep(3000);
Driver.findElement(By.className("smallSubmit")).click();
System.out.println(Driver.getTitle()); 

		
	}

}
