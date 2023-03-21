package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendValueandPressEnter {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	
	driver.get("https://www.google.co.in/");
	WebElement textField = driver.findElement(By.name("q"));
	Actions action = new Actions(driver);
	action.sendKeys(textField, "Holi").sendKeys(Keys.ENTER).perform();
	
}
}
