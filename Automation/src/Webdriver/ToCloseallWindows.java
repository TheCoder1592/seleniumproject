package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseallWindows {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.demo.actitime.com/login.do");
	driver.findElement(By.linkText("actiTIME Inc.")).click();
	Thread.sleep(3000);
	driver.quit();
}
}
