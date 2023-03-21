package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/krush/OneDrive/Desktop/xpath.html");
		driver.findElement(By.xpath("html/body/div[1]/input[1]")).sendKeys("Krishna");
}
}
