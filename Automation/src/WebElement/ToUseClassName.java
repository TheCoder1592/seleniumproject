package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClassName {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/krush/OneDrive/Desktop/demopage.html");
	driver.findElement(By.className("selenium")).click();
	String heading = driver.findElement(By.tagName("h1")).getText();
	System.out.println(heading);
	}
}

	
