package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAllignment {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/krush/OneDrive/Desktop/demopage.html");
	WebElement username = driver.findElement(By.xpath("//input[@type='text'][1]"));
	WebElement password = driver.findElement(By.xpath("//input[@type='text'][2]"));
	
	Point usernamePos = username.getLocation();
	System.out.println(usernamePos);
	
	int usernameStartX = usernamePos.getX();
	Point passwordPos = password.getLocation();
	
	int passwordStartX = passwordPos.getX();
	if(usernameStartX == passwordStartX)
	{
		System.out.println("Pass : The Allignment is verified");
	}
	else
		System.out.println("Fail : The Allignment is not verified");
	driver.quit();
}
}
