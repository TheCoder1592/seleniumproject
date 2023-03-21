package PopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToHandlePrintPopUp {
public static void main(String[] args) throws InterruptedException, AWTException, IOException {
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("file:///C:/Users/krush/OneDrive/Desktop/print.html");
	
	driver.findElement(By.tagName("button")).click();
	
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
	
	Robot robot=new Robot(); //to press enter
	robot.keyPress(KeyEvent.VK_ENTER);
	
	Thread.sleep(3000);
	
	Runtime.getRuntime().exec("./AutoIt/print.exe");
}
}
