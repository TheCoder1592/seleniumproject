package Webdriver;

import org.openqa.selenium.edge.EdgeDriver;

public class ToCaptureWindowID {
public static void main(String[] args) {
	EdgeDriver driver=new EdgeDriver();
	String windowID=driver.getWindowHandle();
	System.out.println(windowID);
	
	EdgeDriver driver1=new EdgeDriver();// to launch window
	String windowID2=driver1.getWindowHandle();//another window ID
	System.out.println(windowID2);
}
}
