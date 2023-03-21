package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPassValues {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/krush/OneDrive/Desktop/demopage.html");
	WebElement username=driver.findElement(By.id("1234"));
	username.sendKeys("Jai Shree Ram");// user name value
	WebElement password=driver.findElement(By.name("Tapsi"));
	password.sendKeys("krishna@1234");
	driver.findElement(By.linkText("Goto YouTube")).click();
}
}
