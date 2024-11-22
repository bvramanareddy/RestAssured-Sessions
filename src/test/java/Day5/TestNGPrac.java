package Day5;

import org.testng.annotations.Test;

public class TestNGPrac {
	
	@Test(priority =-1 )
	
	public void abc()
	{
		System.out.println("ABC");
	}
	
@Test(priority = 2)
	
	public void bcd()
	{
		System.out.println("BCD");
	}

@Test(priority = 3)

public void cde()
{
	System.out.println("CDE");
}

@Test(priority = 4)

public void def()
{
	System.out.println("DEF");
}

@Test

public void ghi()
{
	System.out.println("GHI");
}

	
	

}
