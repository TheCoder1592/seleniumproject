package TestNg;

import org.testng.annotations.Test;

public class B {
@Test(priority = 3)  //priority defines the sequence of method we need to run
public void goToQspiders()
{
	System.out.println("go to qspiders");
}
@Test(priority = 1)
public void wakeUpinTheMorning()                 //alphabetically it runs the methods
{
	System.out.println("Wake up in the morning");
}
@Test(priority = 2)
public void havemybreakfast()
{
	System.out.println("Have my breakfast");
}
}
