package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToNormalClick {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
	driver.get("https://demo.actitime.com/login.do");
	
	WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
	Actions action=new Actions(driver);
	action.click(checkbox).perform();
}
}
