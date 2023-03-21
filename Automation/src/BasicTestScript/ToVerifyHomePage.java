package BasicTestScript;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM.HomePage;
import POM.LoginPage;

public class ToVerifyHomePage {
public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();  //we upcast here hence we can use it for any driver.
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");
	
	LoginPage login = new LoginPage(driver);
	login.loginAction("admin", "manager");
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.titleContains("Enter"));
	
	String actualTitle = driver.getTitle();
	
	if(actualTitle.contains("Enter"))
	{
		System.out.println("Pass : The Title is Verified");
	}
	else
		System.out.println("Fail : The Title is not Verified");
	
	HomePage home=new HomePage(driver);
	home.logoutAction();
	
	driver.quit();
	
}
}
