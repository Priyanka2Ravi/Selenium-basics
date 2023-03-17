package week2.day2;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class Assignment4Button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver Driver = new ChromeDriver(options);
		Driver.get("https://www.leafground.com/button.xhtml");
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Click and Confirm title.
		Driver.findElement(By.xpath("//span[@class='ui-button-text ui-c' and text()='Click']")).click();
		String title = Driver.getTitle();
		if (title.equals("Dashboard"))
		{
			System.out.println("yes, current title is correct");
		}
		else
		{
			System.out.println("No, Tilte is incorrect");
		}
		Driver.navigate().back();
		
		//Confirm if the button is disabled.
		boolean button= Driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']")).isDisplayed();
		if(button==true)
		{
			System.out.println("Yes, it is disabled");
		}
		else
		{
			System.out.println("No, it is enabled");
		}
		
		//Find the position of the Submit button
		Point posiotionOfsubmit = Driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']/span[@class='ui-button-text ui-c' and text()='Submit']")).getLocation();
		System.out.println(posiotionOfsubmit);
		
		//Find the Save button color
		String rgbaformat = Driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']")).getCssValue("background-color");
		System.out.println(rgbaformat);
		String colorOfsubmit = Color.fromString(rgbaformat).asHex();
		System.out.println(colorOfsubmit);
		
		//Find the height and width of this button
		int height = Driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']")).getSize().height;
		int width = Driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']")).getSize().width;
		System.out.println("Height is "+ height + " Width is " + width);
		
		//Mouse over and confirm the color changed
		WebElement wb1 = Driver.findElement(By.xpath("//button[@onmouseout='changeback()']"));
		String originalColor = wb1.getCssValue("background-color");
		System.out.println(originalColor);
		Thread.sleep(1000);
		Actions hover = new Actions(Driver);
		hover.moveToElement(Driver.findElement(By.xpath("//button[@onmouseout='changeback()']/span[@class='ui-button-text ui-c']"))).perform();
		String newColor = Driver.findElement(By.xpath("//button[@onmouseout='changeback()']/span[@class='ui-button-text ui-c']")).getCssValue("background-color");
		System.out.println(newColor);
		if(originalColor.equals(newColor))
		{
			System.out.println("color is not changed");
		}
		else
		{
			System.out.println("color is changed");
		}
		
		//Click Image Button and Click on any hidden button
		Driver.findElement(By.xpath("//button[@id='j_idt88:j_idt102:imageBtn']")).click();
		Thread.sleep(2000);
		WebElement hidden = Driver.findElement(By.xpath("//div[@id='j_idt88:j_idt102:imagePanel']"));
		Driver.executeScript("arguments[0].setAttribute('style','visibility:visible;');",hidden);
		hidden.click();
		
		//How many rounded buttons are there?
		Thread.sleep(2000);
	    List<WebElement> list = Driver.findElements(By.xpath("//h5[text()='How many rounded buttons are there?']/following-sibling::button"));
		int count = list.size();
		System.out.println(count);
		
	}

}
