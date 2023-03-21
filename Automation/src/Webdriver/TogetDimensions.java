package Webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class TogetDimensions {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	Dimension dim=driver.manage().window().getSize();
	System.out.println(dim);
	
	int width=dim.getWidth();
	int height=dim.getHeight();
System.out.println("The Height is :" +height);
System.out.println("The Width is :" +width);
}
}
