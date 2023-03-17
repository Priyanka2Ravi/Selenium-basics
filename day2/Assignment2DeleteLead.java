package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment2DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver Drive = new ChromeDriver(options);
		Drive.get("http://leaftaps.com/opentaps/control/main");
		Drive.manage().window().maximize();
		Drive.findElement(By.id("username")).sendKeys("DemoSalesManager");
		Drive.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(3000);
		Drive.findElement(By.className("decorativeSubmit")).click();
		Drive.findElement(By.partialLinkText("CRM/SFA")).click();
		Thread.sleep(2000);
		Drive.findElement(By.partialLinkText("Leads")).click();
		Thread.sleep(2000);
		Drive.findElement(By.xpath("//a[text()='Find Leads'][1]")).click();
		Drive.findElement(By.xpath("//span[@class='x-tab-strip-text ' and text()='Phone']")).click();
		//Drive.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("1");
		// Drive.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("");
		Drive.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		Drive.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		WebElement we1= Drive.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a"));
		String s= we1.getText();
		System.out.println(s);
		we1.click();
		Thread.sleep(2000);
		Drive.findElement(By.className("subMenuButtonDangerous")).click();
		Drive.findElement(By.xpath("//a[text()='Find Leads'][1]")).click();
		Thread.sleep(2000);
		Drive.findElement(By.linkText("Name and ID")).click();
		Drive.findElement(By.xpath("//div[@class='x-form-element']/input[@name='id']")).sendKeys(s);
		Drive.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Boolean errmsg = Drive.findElement(By.xpath("//div[@id='ext-gen437']")).isDisplayed();
		System.out.println(errmsg);
//		if(errmsg.equals("No records to display"))
//		{
//			System.out.println("Yes, Record got deleted");
//		}
//		else
//		{
//			System.out.println("No, record is not deleted");
//		}
//		
		Thread.sleep(2000);
		Drive.close();
		
		
		
	}

}
