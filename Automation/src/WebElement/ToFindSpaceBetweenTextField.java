package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFindSpaceBetweenTextField {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/krush/OneDrive/Desktop/demopage.html");
	
	WebElement username = driver.findElement(By.xpath("//input[@type='text'][1]"));
	WebElement password = driver.findElement(By.xpath("//input[@type='text'][2]"));
	
	Rectangle usernameRect = username.getRect();
	Rectangle passwordRect = password.getRect();
	
	int usernameEndY=usernameRect.getY()+usernameRect.getHeight();
	int passwordStartY = passwordRect.getY();
	
	int space=passwordStartY - usernameEndY;
	
	System.out.println(space);
driver.quit();
}
}
