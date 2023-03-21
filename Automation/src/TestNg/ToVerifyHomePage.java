package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToVerifyHomePage extends BaseClass {

	@Test
	public void toVerifyHomePage()
	{
		String actualValue="abc";
		String expectedValue="abc";
		
		//Hard Assert
		
		Assert.assertEquals(actualValue, expectedValue);
		System.out.println("Home page is verifed");
	}
	@Test
	public void toVerifyTaskPage()
	{
		int actualValue=123;
		int expectedValue=12;
		
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualValue, expectedValue);
		s.assertAll();
		System.out.println("Task page is verified");
	}
//	@Test
//	public void toVerifyUserPage()
//	{
//		System.out.println("User page is verified");
//	}
}
