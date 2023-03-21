package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformScrollingaction {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	
	driver.get("https://www.selenium.dev/");
	Actions action = new Actions(driver);
	action.sendKeys(Keys.PAGE_DOWN).perform(); //action class h is liye we use perform
	Thread.sleep(2000);
	action.sendKeys(Keys.PAGE_DOWN).perform(); //action class h is liye we use perform
	Thread.sleep(2000);
	action.sendKeys(Keys.PAGE_UP).perform(); //action class h is liye we use perform
	Thread.sleep(2000);
}
}
