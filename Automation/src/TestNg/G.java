package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class G {

	
	@Test
	public void test2()
	{
	WebDriver driver =new EdgeDriver();
	driver.get("https://www.google.co.in/");
}
}

