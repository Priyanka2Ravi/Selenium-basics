package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasicXpathExercise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver Drive = new ChromeDriver(options);
Drive.get("http://leaftaps.com/opentaps");
Drive.manage().window().maximize();
Drive.findElement(By.xpath("//input[@id='username']")).sendKeys("Democsr");
Drive.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
Thread.sleep(3000);
//Attribute based xpathh
Drive.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
//Partial text based xpath
Drive.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
// text based xpath
Drive.findElement(By.xpath("//a[text()='Leads']")).click();
Drive.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
//Partial attribute value based xpath
Drive.findElement(By.xpath("//input[contains(@id,'companyName')]")).sendKeys("INFY");
Drive.findElement(By.xpath("//input[contains(@id,'firstName')]")).sendKeys("Pappu");
Drive.findElement(By.xpath("//input[contains(@id,'lastName')]")).sendKeys("arvi");
Thread.sleep(5000);
Drive.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	}

}

// //div[@id='username_container']/input[@id='username']
// //form[@name='login']/input[@id='password']
// //form[@name='login']/input[2]

//a[contains(text(),'Nandhini')]/preceeding-siblings::a[text()='10202']
// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
