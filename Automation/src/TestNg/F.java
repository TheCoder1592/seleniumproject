package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class F {

	@Test
	public void test()
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		
	}
}
