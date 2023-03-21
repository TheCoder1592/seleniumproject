package TestNg;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;


public class C {
@Test
public void test1()
{
    Assert.fail();   //iske neeche ke sare method skip ho jaenge. jaha lgega wo fail hoga uske neeche skip hoga.
	System.out.println("Hi");
}
@Test(dependsOnMethods = "test1")
public void test2()
{
	System.out.println("How are you?");
}
@Test(dependsOnMethods = "test2")
public void test3()
{
	System.out.println("Will you go out with me?");
}
@Test(priority = 1,dependsOnMethods = "test3")
public void test4()
{
	System.out.println("Bye");
}
}
