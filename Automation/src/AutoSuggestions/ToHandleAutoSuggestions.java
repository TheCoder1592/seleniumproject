package AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAutoSuggestions {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	
	driver.findElement(By.name("q")).sendKeys("pappu");
	Thread.sleep(2000);
	List<WebElement> allsuggestions = driver.findElements(By.xpath("//span[contains(text(), 'appu')]"));

	for(WebElement sug:allsuggestions)
	{
		if(sug.getText().equals("pappu kaun hai")){
			sug.click();
		break;
		}
	}
}
}
