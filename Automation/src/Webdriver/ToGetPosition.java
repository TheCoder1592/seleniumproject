package Webdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPosition {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	Point position=driver.manage().window().getPosition();
	System.out.println(position);
	int startx = position.getX();
	int starty= position.getY();
	System.out.println("The X coordinate is :" +startx);
	System.out.println("The Y coordinate is :"+starty);
	}
}
