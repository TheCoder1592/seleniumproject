package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAltTextofImage {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	
	String altText=driver.findElement(By.xpath("//img[@src=https://rukminim1.flixcart.com/image/200/200/kokdci80/dslr-camera/v/e/x/z-24-200mm-z5-nikon-original-imag2zuekuxgxsgg.jpeg?q=70")).getAttribute("alt"); //write xpath for image source
			System.out.println(altText);
			
			if(altText.contains("Shop Now"))
			{
				System.out.println("Pass : The alt text is verified");
			}
			else
				System.out.println("Fail : the alt text is not verified");
}
}
