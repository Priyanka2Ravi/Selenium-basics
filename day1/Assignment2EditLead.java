package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2EditLead {

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
		Thread.sleep(3000);
		Drive.findElement(By.partialLinkText("Edit")).click();
		Drive.findElement(By.id("updateLeadForm_description")).clear();
		Drive.findElement(By.id("updateLeadForm_importantNote")).sendKeys("dhvh hasgfhja ahsghas");
		Drive.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div[1]/div/form/div/div[2]/table/tbody/tr[12]/td[2]/input")).click();
		Thread.sleep(2000);
		System.out.println(Drive.getTitle());
	}

}
