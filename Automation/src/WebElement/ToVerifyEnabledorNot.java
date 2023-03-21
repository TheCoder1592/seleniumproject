package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyEnabledorNot {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/krush/OneDrive/Desktop/demopage.html");// git hub login page  
	
	Thread.sleep(5000);
driver.findElement(By.id("email")).sendKeys("krushnassingh@gnail.com");
Thread.sleep(2000);
boolean enabled=driver.findElement(By.xpath("//button[contains(text(), 'Continue')]")).isEnabled();//xpath for button
if(enabled)
{
	System.out.println("Pass : the button is enabled");
}
else
System.out.println("Fail : The button is not enabled");
}
}
