package week2.day2;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assignment4Select {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver Driver = new ChromeDriver(options);
		Driver.get("https://www.leafground.com/select.xhtml");
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Which is your favorite UI Automation tool?
		Select diffOptions = new Select(Driver.findElement(By.xpath("//select[@class='ui-selectonemenu']")));
		List<WebElement> listOftools = diffOptions.getOptions();
		for(int i=0; i< listOftools.size();i++)
		{
			Thread.sleep(2000);
			if(i==1 || i==3)
			{
				listOftools.get(i).click();
			}
		}
		
		//Choose your preferred country.
		Driver.findElement(By.xpath("(//div[@class='ui-selectonemenu-trigger ui-state-default ui-corner-right'])[1]")).click();
		Driver.findElement(By.xpath("//li[@data-label='India']")).click();
		
		//Confirm Cities belongs to Country is loaded
		
		
		//Choose the Course

		//Choose language randomly
		Driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[3]")).click();
		Driver.findElement(By.xpath("//li[@data-label='Tamil']")).click();
		
		//Select 'Two' irrespective of the language chosen
		
	}

}
