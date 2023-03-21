package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClear {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.vtiger.com/vtigercrm/");
	
	WebElement username = driver.findElement(By.id("username"));
	WebElement password = driver.findElement(By.id("password"));
	
	username.clear();
	Thread.sleep(2000);
	username.sendKeys("New Username");
	
	password.clear();
	Thread.sleep(2000);
	password.sendKeys("New Password");
}
}
