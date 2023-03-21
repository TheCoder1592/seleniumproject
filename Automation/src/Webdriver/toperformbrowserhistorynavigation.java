package Webdriver;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class toperformbrowserhistorynavigation {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com");
	Thread.sleep(2000);
	Navigation nav = driver.navigate();
	nav.to("https://www.facebook.com");
	nav.back();
	nav.forward();
	nav.refresh();
	}
}
