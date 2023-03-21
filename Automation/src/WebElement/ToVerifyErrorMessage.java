package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyErrorMessage {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	
	driver.findElement(By.xpath("//div[text() ='Login ']")).click();
	Thread.sleep(3000);
	
	String errorMsg = driver.findElement(By.className("errormsg")).getText();
	System.out.println(errorMsg);
	
	if(errorMsg.contains("Username or Password"))
	{
		System.out.println("Pass : The error message is verified");
	}
	else
	{
		System.out.println("Fail : The error message is not verified");
	}
}
}
