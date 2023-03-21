package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchDataFromPropertyFile {
public static void main(String[] args) throws IOException {
	//physical representation of property file is converted to java representation
	FileInputStream fis=new FileInputStream("./testData/propertyData.properties");
	Properties property=new Properties();
	//The load method is reading the java representation 
	property.load(fis);
	
	String url = property.getProperty("url");
	System.out.println(url);
	
	String username = property.getProperty("username");
	System.out.println(username);
	
	String password = property.getProperty("password");
	System.out.println(password);
	
	//Login Action
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement usernameTextfield = driver.findElement(By.id("username"));
		WebElement passwordTextfield = driver.findElement(By.name("pwd"));
		WebElement loginButton = driver.findElement(By.xpath("//div[text()='Login ']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='"+username+"'", usernameTextfield);
		js.executeScript("arguments[0].value='"+password+"'", passwordTextfield);
	    js.executeScript("arguments[0].click()", loginButton);
	}
	
	
	
	
}

