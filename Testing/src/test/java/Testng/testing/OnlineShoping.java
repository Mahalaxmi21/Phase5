package Testng.testing;

import org.testng.annotations.Test;

public class OnlineShoping {
 
	String trackID=null;
	@Test(priority = 1)
	public void createID() {
		int a=50/0;
		System.out.println("Create an ID");
		trackID="123";
	}
	@Test(priority = 2,dependsOnMethods = {"createID"})
	public void trackShipping() {
		if(trackID!=null) {
			System.out.println("Shipping is a Progress");
		}else
		{
			System.out.println("Shipping is a failed");
		}
	}
	@Test(priority = 3,dependsOnMethods = {"createID"})
	public void cancelShipping() {
		if(trackID!=null) {
			System.out.println("Shipping is a cancelled");
		}else
		{
			System.out.println("Shipping is a failed");
		}
	}
}
