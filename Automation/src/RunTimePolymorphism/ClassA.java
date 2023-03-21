package RunTimePolymorphism;

import org.openqa.selenium.WebDriver;

public class ClassA {
	public static void main(String[] args) {
		
		public static test(WebDriver driver)
		{
			driver.manage().window().maximize();
			driver.get("https://www.google.co.in/");
			String title=driver.getTitle();
			if(title.equals("Google"))
			{
				System.out.println("Pass : The title is verified");
			}
			else
			{
				System.out.println("Fail : The title is not verified");
			}
			driver.quit();
			
		}
		}
}
