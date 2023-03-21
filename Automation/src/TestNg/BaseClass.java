package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	@BeforeSuite
	public void bsConfig()
	{
		System.out.println("Database connection has been established");
	}
	@BeforeClass
	public void bcConfig()
	{
		System.out.println("The browser has been launched");
		System.out.println("The url has been navigated");
	}
	@BeforeMethod
	public void bmConfig()
	{
		System.out.println("The login was succesful");
	}
	@AfterMethod
	public void amConfig()
	{
		System.out.println("The logout was successful");
	}
	@AfterClass
	public void acConfig()
	{
		System.out.println("The browser has been closed");
	}
	@AfterSuite
	public void asConfig()
	{
		System.out.println("The database connection has been closed");
	}
	
	

}
