package TestNg;

import org.testng.annotations.Test;

public class E {

	@Test(groups = "smoke")
	public void test1()
	{
		System.out.println("Hi");
	}
	@Test(groups = "smoke")  
	public void test2()
	{
		System.out.println("How are you?");
	}
	@Test(groups = "reg")  
	public void test3()
	{
		System.out.println("Will you go out with me?");
	}
	@Test(groups = "reg")
	public void test4()
	{
		System.out.println("Will you go out for a movie?");
	}
	@Test(groups = "smoke")
	public void test5()
	{
		System.out.println("Bye");
	}
	
}
