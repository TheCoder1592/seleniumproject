package Webdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetPosition {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	Point pos=new Point(100,100);
	driver.manage().window().setPosition(pos);

}
}
