package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GenerateStateElementReferenceException {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://facebook.com/");
	
	driver.findElement(By.id("email")).sendKeys("Krishna");
	driver.navigate().refresh();
	driver.findElement(By.id("email")).sendKeys("Bhadouria");

}
}
