package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickonDisabledButton {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html");
	
	driver.findElement(By.xpath("//a[text()=' jdk-8u202-linux-arm32-vfp-hflt.tar.gz']")).click();
	WebElement button = driver.findElement(By.xpath("//a[text()='Download jdk-8u202-linux-arm32-vfp-hflt.tar.gz']"));
	
	JavascriptExecutor js=(JavascriptExecutor)driver; //downcast
	js.executeScript("arguments[0].click()", button);          //learn it by heart
		
}
}
