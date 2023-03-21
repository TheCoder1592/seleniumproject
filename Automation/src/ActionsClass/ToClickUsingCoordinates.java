package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToClickUsingCoordinates {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	
	driver.get("https://www.myntra.com");
	Actions action=new Actions(driver);
	action.moveByOffset(1334, 40).click().perform();  //use extension to get location of bag 
}
}
