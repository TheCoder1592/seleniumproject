package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	String title=driver.getTitle();
	System.out.println(title);
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	WebElement a1=driver.findElement(By.xpath("//input[@id='search']"));
	a1.sendKeys("glitter benee lyrics");
	driver.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']")).click();
	
}
}
