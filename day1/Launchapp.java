package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

//ChromeOptions option = new ChromeOptions();
//option.addArguments("--remote-allow-origin=*");


public class Launchapp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver Driver = new ChromeDriver();
//EdgeDriver driver2 = new EdgeDriver();
//driver2.get("https://platform.testleaf.com/#/");
Driver.get("https://www.facebook.com/");
//Driver.navigate().to("https://www.facebook.com/");
Driver.manage().window().maximize();
Thread.sleep(10000);
Driver.close();
	}

}
