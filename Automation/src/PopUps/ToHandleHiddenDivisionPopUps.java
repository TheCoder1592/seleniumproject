package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleHiddenDivisionPopUps {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/");
	
	//Actions action=new Actions(driver);
	//action.moveByOffset(1000, 0).click().perform();   //these 2 lines ke coment tag hata k first popup run kro
	
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	
}
}
