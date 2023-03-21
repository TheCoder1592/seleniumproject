package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	
	driver.get("https://www.myntra.com/");
	WebElement link = driver.findElement(By.linkText("MEN"));
	Actions action=new Actions(driver);
	action.moveToElement(link).click().perform(); //perform se h click krega men p.
	
}
}
