package Synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToWaitforButtonToBeClickable {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	
	driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
	
	driver.findElement(By.id("email")).sendKeys("krishnasingh@gmail.com");
	
	WebElement button = driver.findElement(By.xpath("//button[contains(text(), 'Continue'  )]"));
	
	/*FluentWait w=new FluentWait(driver);    //not in use we can ignore it. No real time use.
	w.withTimeout(Duration.ofSeconds(20));
	w.pollingEvery(Duration.ofMillis(100));
	w.ignoring(NoSuchElementException.class);*/  //because no such element exception is a class.
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeClickable(button));
	
	button.click();
	
	
	
}
}
