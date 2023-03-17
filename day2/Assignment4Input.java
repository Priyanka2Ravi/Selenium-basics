package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment4Input {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
ChromeDriver Driver = new ChromeDriver(options);
Driver.get("https://www.leafground.com/input.xhtml");
Driver.manage().window().maximize();
Thread.sleep(3000);
Driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("Priyanka Ravi");
String s = Driver.findElement(By.xpath("//input[@value='Chennai']")).getText();
Driver.findElement(By.xpath("//input[@value='Chennai']")).sendKeys(s +" INDIA");
boolean b = Driver.findElement(By.name("j_idt88:j_idt93")).isDisplayed();
if (b==true)
{
	System.out.println("text box is disabled");
}
else
{
	System.out.println("text box is enabled");
}
Driver.findElement(By.id("j_idt88:j_idt95")).clear();
String s2 = Driver.findElement(By.xpath("//input[@name='j_idt88:j_idt97']")).getAttribute("value");
System.out.println(s2);
Driver.findElement(By.xpath("//input[@name='j_idt88:j_idt99']")).sendKeys("oreasd@gmail.com" + Keys.TAB);
WebElement we1 = Driver.findElement(By.xpath("//textarea[@name='j_idt88:j_idt101']"));
WebElement we2 = Driver.switchTo().activeElement();
if(we1.equals(we2))
{
	System.out.println("Confirmed, control moved to next element.");
}
else
{
	System.out.println("Not happened");
}
we1.sendKeys("I would like to learn lot if things in selenium");
Driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("I have entered some content here");

Driver.findElement(By.id("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
String errormsg = Driver.findElement(By.xpath("//span[@class='ui-message-error-detail']")).getText();
if (errormsg.contentEquals("Age is mandatory"))
{
	System.out.println("Yes, Error message is correct");
}
else
{
	System.out.println("No, this is not the error message");
}
Point position1 = Driver.findElement(By.xpath("//label[text()='Username']")).getLocation();

Thread.sleep(3000);

Driver.findElement(By.xpath("//input[@id='j_idt106:float-input']")).click();

Point position2 = Driver.findElement(By.xpath("//label[text()='Username']")).getLocation();

if(position1.equals(position2))
{
	System.out.println("Label position is not changed. Location is " + position1 );
}
else
{
	System.out.println("Label position is changed" + " Original position "+ position1+ " Changed position " + position2);
}

Driver.findElement(By.xpath("//input[@id='j_idt106:auto-complete_input']")).sendKeys("Priya");
Thread.sleep(2000);
Driver.findElement(By.xpath("//li[text()='2']")).click();

Driver.findElement(By.xpath("//input[@id='j_idt106:j_idt116_input']")).sendKeys("09/13/1994");

String date = Driver.findElement(By.xpath(" //a[@class=' ui-state-default ui-state-active']")).getText();
System.out.println(date);
Driver.findElement(By.linkText(date)).click();

Driver.findElement(By.xpath("//input[@id='j_idt106:j_idt118_input']")).sendKeys("24");
Driver.findElement(By.xpath("//a[contains(@class,'ui-spinner-button ui-spinner-up')]")).click();

Driver.findElement(By.xpath("//input[@id='j_idt106:slider']")).sendKeys("56");
String value = Driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']")).getAttribute("style");
System.out.println(value);

Driver.findElement(By.xpath("//input[@id='j_idt106:j_idt122']")).click();
boolean find = Driver.findElement(By.xpath("//div[contains(@class,' ui-corner-all ui-shadow keypad-popup ui-input-overlay')]")).isEnabled();
if(find==true) {
	System.out.println("yes, keyboard is displayed");
}
else
{
System.out.println("No, it is not");

}

Driver.findElement(By.xpath("//div[@data-placeholder='Enter your content']")).sendKeys("my name is ");
Driver.findElement(By.xpath("(//button[@class='ql-bold'])[2]//*[name()='svg']")).click();
Driver.findElement(By.xpath("//div[@data-placeholder='Enter your content']")).sendKeys("priyanka");


}
}