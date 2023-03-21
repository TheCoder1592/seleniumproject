package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseXpathbyTextFunction {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/krush/OneDrive/Desktop/demopage.html");
	String heading = driver.findElement(By.xpath("//a[text()='Goto YouTube']")).getText();
	System.out.println(heading);
	}
}
// to find any text or linked text