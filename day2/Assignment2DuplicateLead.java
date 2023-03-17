package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment2DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver Drive = new ChromeDriver(options);
		Drive.get("http://leaftaps.com/opentaps/control/main");
		Drive.manage().window().maximize();
		Drive.findElement(By.id("username")).sendKeys("DemoCSR");
		Drive.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(3000);
		Drive.findElement(By.className("decorativeSubmit")).click();
		Drive.findElement(By.partialLinkText("CRM/SFA")).click();
		Thread.sleep(2000);
		Drive.findElement(By.partialLinkText("Leads")).click();
		Thread.sleep(2000);
		Drive.findElement(By.xpath("//a[text()='Find Leads'][1]")).click();
		Drive.findElement(By.xpath("//span[text()='Email']")).click();
		Drive.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("hariharakumaran007@gmail.com");
		Drive.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		WebElement we1= Drive.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-firstName ']//a"));
		String s = we1.getText();
		System.out.println(s);
		we1.click();
		Drive.findElement(By.linkText("Duplicate Lead")).click();
		String s2= Drive.getTitle();
		System.out.println(s2);
				if (s2.contains("Duplicate Lead"))
				{
					System.out.println("Verified");
				}
				else
					System.out.println("Not verified");
		
		Drive.findElement(By.className("smallSubmit")).click();
		WebElement we2= Drive.findElement(By.id("viewLead_firstName_sp"));
		String s3= we2.getText();
		if(s.contentEquals(s3))
		{
			System.out.println(s3 + " is the duplicated lead name");
				}
		else
		{
			System.out.println("This is not the duplicated name");
		}
		Drive.quit();
		
	}

}
