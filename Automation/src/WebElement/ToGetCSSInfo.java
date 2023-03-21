package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetCSSInfo {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	
	String buttoncolor = driver.findElement(By.linkText("Create new account")).getCssValue("background-color");
	System.out.println(buttoncolor);
}
}
