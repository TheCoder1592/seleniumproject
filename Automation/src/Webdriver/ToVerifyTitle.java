package Webdriver;

import org.openqa.selenium.edge.EdgeDriver;

public class ToVerifyTitle {
public static void main(String[] args) {
	String expectedTitle="Facebook";
	EdgeDriver driver = new EdgeDriver();
	driver.get("https://www.facebook.com/");
	String actualtitle = driver.getTitle();
	System.out.println(actualtitle);

	if(actualtitle.contains(expectedTitle))
	{
		System.out.println("Pass : Title is verified");
	}
	else
	{
		System.out.println("Fail : Title is not verified");
	}
	driver.close();
	}
}
