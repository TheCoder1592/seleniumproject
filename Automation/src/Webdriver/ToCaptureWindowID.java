package Webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureWindowID {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	String windowID=driver.getWindowHandle();
	System.out.println(windowID);
	
	ChromeDriver driver1=new ChromeDriver();// to launch window
	String windowID2=driver1.getWindowHandle();//another window ID
	System.out.println(windowID2);
}
}
