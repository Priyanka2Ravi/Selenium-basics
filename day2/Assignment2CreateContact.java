package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assignment2CreateContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
ChromeDriver Driver = new ChromeDriver(options);
Driver.get("http://leaftaps.com/opentaps/control/login");
Driver.manage().window().maximize();
Driver.findElement(By.id("username")).sendKeys("DemoCSR");
Driver.findElement(By.id("password")).sendKeys("crmsfa");
Thread.sleep(3000);
Driver.findElement(By.className("decorativeSubmit")).click();
Driver.findElement(By.partialLinkText("CRM/SFA")).click();
Driver.findElement(By.xpath("//a[text()='Contacts']")).click();
Driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
Driver.findElement(By.id("firstNameField")).sendKeys("Lottery");
Driver.findElement(By.id("lastNameField")).sendKeys("truck");
Driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("LOLOLO");
Driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("yhyhy");
Driver.findElement(By.id("createContactForm_departmentName")).sendKeys("CSE");
Driver.findElement(By.id("createContactForm_description")).sendKeys("Not appluhsk");
Driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("sjj@gmail.com");
Select opt1 = new Select(Driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")));
opt1.selectByVisibleText("New York");
Thread.sleep(3000);
Driver.findElement(By.className("smallSubmit")).click();
Thread.sleep(2000);
Driver.findElement(By.xpath("//a[@class='subMenuButton' and text()='Edit'] ")).click();
Driver.findElement(By.id("updateContactForm_description")).clear();
Driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("nothing to be filled here");
Thread.sleep(2000);
Driver.findElement(By.xpath("//input[@class='smallSubmit' and @value='Update']")).click();
Thread.sleep(2000);
System.out.println(Driver.getTitle());


	}

}
