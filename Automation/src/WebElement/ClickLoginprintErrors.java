package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickLoginprintErrors {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");

	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	Thread.sleep(5000);
	String errorMsg = driver.findElement(By.className("errormsg")).getText();
	System.out.println(errorMsg);
	if(errorMsg.contains("Username or Password"))
	{
		System.out.println("Pass the error msg is verified");
	}
	else
	{
		System.out.println("Fail The error message is not verified");
	}
}
}
