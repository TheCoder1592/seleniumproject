package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qspider {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	WebElement a1=driver.findElement(By.name("q"));
	a1.sendKeys("qspiders");
	}
}
