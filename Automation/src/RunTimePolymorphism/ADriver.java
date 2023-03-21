package RunTimePolymorphism;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ADriver {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","./msedgedriver.exe");
	Class A.test(new ChromeDriver());
	Class A.test(new EdgeDriver());
}
}