package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginusingJavascriptexecutor {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");
	WebElement username = driver.findElement(By.id("username"));
	WebElement password = driver.findElement(By.name("pwd"));
	WebElement loginButton = driver.findElement(By.xpath("//div[text()='Login ']"));
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].value='admin'", username);
	js.executeScript("arguments[0].value='manager'", password);
    js.executeScript("arguments[0].click()", loginButton);
}
}