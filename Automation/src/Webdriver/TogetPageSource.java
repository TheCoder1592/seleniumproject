package Webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class TogetPageSource {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com");
	String pageSource=driver.getPageSource();
	System.out.println(pageSource);
			}
}
