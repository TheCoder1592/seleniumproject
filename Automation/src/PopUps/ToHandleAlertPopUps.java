package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAlertPopUps {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://demoqa.com/alerts");
	
	driver.findElement(By.id("alertButton")).click();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	
	
	driver.findElement(By.id("confirmButton")).click();
	Thread.sleep(2000);
	driver.switchTo().alert().dismiss();
	
	WebElement alertText = driver.findElement(By.xpath("//div[text()='Alerts']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)", alertText);
	
	driver.findElement(By.id("promtButton")).click();
	Thread.sleep(2000);
	driver.switchTo().alert().sendKeys("Holi Hai");
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	
}
}
