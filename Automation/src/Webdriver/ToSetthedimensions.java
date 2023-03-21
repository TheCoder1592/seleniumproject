package Webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetthedimensions {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	Dimension dim=new Dimension(500,100);
	driver.manage().window().setSize(dim);
	
	Thread.sleep(3000);
	
	Dimension newDim=new Dimension(800,500);
	driver.manage().window().setSize(newDim);
}
}
