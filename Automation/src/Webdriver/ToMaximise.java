package Webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToMaximise {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	driver.manage().window().minimize();
	driver.quit();
}
}
