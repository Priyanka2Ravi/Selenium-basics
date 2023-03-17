package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assigment1FaceBook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
		ChromeDriver Driver =new ChromeDriver(options);
		Driver.get("https://en-gb.facebook.com/");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Driver.findElement(By.xpath("//form[@method='post']//a[@data-testid='open-registration-form-button']")).click();
		Driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='firstname']")).sendKeys("Oreo");
		Driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='lastname']")).sendKeys("Milkshake");
		Driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='reg_email__']")).sendKeys("hkahk@gmail.com");
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='reg_passwd__']")).sendKeys("dri@sakSp12");
		Thread.sleep(3000);
		Select option1 = new Select(Driver.findElement(By.name("birthday_day")));
		option1.selectByValue("13");
		Select option2 = new Select(Driver.findElement(By.name("birthday_month")));
		option2.selectByIndex(3);
		Select option3 = new Select(Driver.findElement(By.name("birthday_year")));
		option3.selectByVisibleText("1998");
		Thread.sleep(3000);
		Driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
		Thread.sleep(2000);
		Driver.findElement(By.name("websubmit")).click();
		
		

	}

}
