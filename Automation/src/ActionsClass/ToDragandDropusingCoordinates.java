package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToDragandDropusingCoordinates {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
	driver.get("https://jqueryui.com/draggable/");
	
	WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	driver.switchTo().frame(frame);
	WebElement source = driver.findElement(By.id("draggable"));
	Actions action=new Actions(driver);
	action.dragAndDropBy(source, 50, 50).perform();
	action.dragAndDropBy(source, 50, 50).perform();
	
}
}
