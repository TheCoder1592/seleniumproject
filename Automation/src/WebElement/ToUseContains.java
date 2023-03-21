package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseContains {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/krush/OneDrive/Desktop/xpath.html");
	String subheading = driver.findElement(By.xpath(null)).getText();// write down the xpath
	System.out.println(subheading);// add subheading in webpage
}
}
