package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifytheDimensions {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/krush/OneDrive/Desktop/demopage.html");
	WebElement username = driver.findElement(By.xpath("//input[@type='text'][1]"));
	WebElement password = driver.findElement(By.xpath("//input[@type='text'][2]"));
	Dimension usernameDim = username.getSize();
	System.out.println(usernameDim);
	Dimension passwordDim = password.getSize();
	System.out.println(passwordDim);
	int usernameHeight = usernameDim.getHeight();
	int usernameWidth = usernameDim.getWidth();
	int passwordHeight = passwordDim.getHeight();
	int passwordWidth = passwordDim.getWidth();
	
	if(usernameHeight==passwordHeight && usernameWidth==passwordWidth)
	{
		System.out.println("Pass : The Dimensions are verified");
	}
	else
	System.out.println("Fail : The Dimensions are not verified");	
	driver.quit();
}
}
