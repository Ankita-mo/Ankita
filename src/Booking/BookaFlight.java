package Booking;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BookaFlight {
	@AfterTest
	public void Aftertesttestcase1() 
	{
		System.out.println("This should be last");
	}
	
	
	@BeforeMethod
	public void Beforemethod()
	{
		System.out.println("This should be run before every TC");
	}
	
	@AfterMethod
	public void Aftermethod()
	{
		System.out.println("This should be run after every TC");
	}
	
	
	@Test
	public void Booking_RoundTrp_Testcase1()
	{
		System.out.println("TC1");
    }
	
	@Test
	public void Booking_RoundTrp_Testcase2()
	{
		System.out.println("TC2");
    }
	
	@BeforeTest
	public void Beforetesttestcase1() 
	{
		System.out.println("This should be first");
	}
	
	@Test
	public void Booking_Oneway_Testcase3()
	{
		System.out.println("TC3");
    }
	
	/*est(dependsOnMethods= {"Booking_Oneway_Testcase"}	)
	public void Booking_Oneway_Testcase4()
	{
		System.out.println("TC4");
    }*/
	
	@Test(enabled=false)
	public void Booking_Oneway_Testcas5()
	{
		System.out.println("TC5");
    }
}

