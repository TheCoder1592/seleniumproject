package Webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetallIDs {
public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.linkText("actiTIME Inc.")).click();
	Set<String> allIds=driver.getWindowHandles();
	System.out.println(allIds);
	
	for(String id:allIds)// to separate windows IDs from collection and its a for each loop.
	{
		System.out.println(id);
	}
}
}
