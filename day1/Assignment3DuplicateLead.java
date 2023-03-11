package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver Drive = new ChromeDriver();
		Drive.get("http://leaftaps.com/opentaps/control/login");
		Drive.manage().window().maximize();
		Drive.findElement(By.id("username")).sendKeys("DemoCSR");
		Drive.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(3000);
		Drive.findElement(By.className("decorativeSubmit")).click();
		Drive.findElement(By.partialLinkText("CRM/SFA")).click();
		Drive.findElement(By.partialLinkText("Leads")).click();
		Drive.findElement(By.partialLinkText("Create Lead")).click();
		Drive.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
		Drive.findElement(By.id("createLeadForm_firstName")).sendKeys("Priyanka");
		Drive.findElement(By.id("createLeadForm_lastName")).sendKeys("Ravi");
		Drive.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Priya");
		Drive.findElement(By.name("departmentName")).sendKeys("CSE");
		Drive.findElement(By.id("createLeadForm_description")).sendKeys("NIL");
		Drive.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("priasfg@gmail.com");
		Select obj1 = new Select(Drive.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		obj1.selectByValue("NY");
		Thread.sleep(5000);
		Drive.findElement(By.className("smallSubmit")).click();
		System.out.println(Drive.getTitle());
		Drive.findElement(By.partialLinkText("Duplicate Lead")).click();
		Drive.findElement(By.id("createLeadForm_companyName")).clear();
		Drive.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		Drive.findElement(By.id("createLeadForm_firstName")).clear();
		Drive.findElement(By.id("createLeadForm_firstName")).sendKeys("Paramesh");
		Thread.sleep(3000);
		Drive.findElement(By.className("smallSubmit")).click();
		System.out.println(Drive.getTitle());
		
	}

}
