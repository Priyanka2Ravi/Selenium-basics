package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment2EditLead {

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
		Thread.sleep(2000);
		Drive.findElement(By.linkText("Name and ID")).click();
		Drive.findElement(By.xpath("//div[@class='x-form-item x-tab-item'][2]//input")).sendKeys("Priya");
		Thread.sleep(2000);
		Drive.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		WebElement we1= Drive.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
		Thread.sleep(2000);
		we1.click();
		System.out.println(Drive.getTitle());
		 Drive.findElement(By.xpath("//a[text()='Edit']")).click();
		 Drive.findElement(By.id("updateLeadForm_companyName")).clear();
		 Drive.findElement(By.id("updateLeadForm_companyName")).sendKeys("sdsjjhsdj");
		 Thread.sleep(3000);
		 Drive.findElement(By.xpath("//input[@class='smallSubmit' and @value='Update']")).click();
		 String s1 = Drive.findElement(By.id("viewLead_companyName_sp")).getText();
		 System.out.println(s1);
		 if ( s1.contains("sdsjjhsdj"))
		 {
			 System.out.println("Verified");
		 }
		 else
		 {
			 System.out.println("not verified");
		 }
		 Drive.quit();
		 }
		
		}

