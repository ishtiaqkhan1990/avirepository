package Superstore.Walmart;


import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FurnitureTest 
{
@Test(groups= {"diningrooms"})
public void Sofa()
{

	Assert.assertEquals("a", "b");
}
@Test(groups= {"diningrooms"})
public void Table()
{
	System.out.println("table");
}
@Test(groups= {"bedrooms"})
public void Bed()
{
	System.out.println("Bed");
}

@Test(groups= {"cornertable"})
public void cornertable()
{
	System.out.println("cornertable");
}
@Test(groups= {"couch"})
public void couch()
{
	System.out.println("couch");
}

}
