package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Driver {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://facebook.com/");
	
	LoginPage login = new LoginPage(driver);
	login.usernameTextField.sendKeys("Krishna");
	
	driver.navigate().refresh();
	login.usernameTextField.sendKeys("Bhadouria");
	
}
}
