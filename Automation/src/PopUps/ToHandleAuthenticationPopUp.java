package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAuthenticationPopUp {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth"); //admin:admin@  is used to directly pass username and password in url
	
	
	
}
}
