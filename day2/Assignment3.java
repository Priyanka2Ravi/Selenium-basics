package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
ChromeDriver driver = new ChromeDriver(options);
driver.get("https://acme-test.uipath.com/login");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
driver.findElement(By.id("password")).sendKeys("leaf@12");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
String s = driver.getTitle();
System.out.println(s);
Thread.sleep(2000);
driver.findElement(By.linkText("Log Out")).click();
Thread.sleep(2000);
driver.close();
	}

}
