package TestNg;

import org.testng.annotations.Test;

public class D {
@Test(enabled = false)
public void test1()
{
	System.out.println("Hi");
}
@Test(enabled = false)  //enabled false will disable this method. and rest will be passed.
public void test2()
{
	System.out.println("How are you?");
}
@Test(invocationCount = 5)  //it will ask "Will you go out with me?" for 5 times.
public void test3()
{
	System.out.println("Will you go out with me?");
}
@Test(invocationCount=0)  //it will disable this and bye will not be printed. it will disable. (like enable=false.)
public void test4()
{
	System.out.println("Bye");
}
}
