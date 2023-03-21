package Webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyUrl {
public static void main(String[] args) {
	String expectedURL = "Instagram";
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/");
	String actualURL=driver.getCurrentUrl();
	if(actualURL.contains(expectedURL))
	{
		System.out.println("Pass : The url is verified");
	}
	else
	{
		System.out.println("Fail : The url is not verified");
	}
	driver.close();
	}
}
