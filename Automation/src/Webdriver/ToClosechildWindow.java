package Webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToClosechildWindow {
public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.actitime.com/login.do");
String parentID=driver.getWindowHandle();
driver.findElement(By.linkText("actiTIME Inc.")).click();
Set<String> allWindowIDs=driver.getWindowHandles();
for(String id:allWindowIDs)
{
	driver.switchTo().window(id);
	if(!id.equals(parentID))
	{
		String childTitle = driver.getTitle();
		System.out.println(childTitle);
		driver.close();
	}
}


}
}
