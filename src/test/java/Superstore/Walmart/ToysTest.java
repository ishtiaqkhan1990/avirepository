package Superstore.Walmart;

import org.testng.annotations.Test;

public class ToysTest 
{
	@Test(groups= {"bedrooms"})
	public void piano()
	{
		System.out.println("piano");
	}
	@Test(groups= {"diningrooms"})
	public void car()
	{
		System.out.println("car");
	}
	@Test(groups= {"bedrooms"})
	public void guitar()
	{
		System.out.println("guitar");
	}
}
