package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyToolTipText {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	String toolTipText=driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("title");
	System.out.println(toolTipText);
	if(toolTipText.contains("Do not select"))
	{
		System.out.println("Pass : The Tool tip Text is verified");
	}
	else
		System.out.println("Fail : The Tool Tip text is not verified");
}
}
