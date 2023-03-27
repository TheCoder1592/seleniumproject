package Webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToSetthedimensions {
public static void main(String[] args) throws InterruptedException {
	EdgeDriver driver=new EdgeDriver();
	
	driver.manage().window().getClass();
	//Dimension oldDimension = driver.manage().window().getSize();
	//System.out.println(oldDimension);
	
	
	//Dimension dim=new Dimension(500,100);
	//driver.manage().window().setSize(dim);
	//Dimension newDimension = driver.manage().window().getSize();
	//System.out.println(newDimension);
	
	
	Thread.sleep(3000);
	
	Dimension newDim=new Dimension(800,500);
	driver.manage().window().setSize(newDim);
	
	
	
	driver.manage().window().getSize();
	
}
}
