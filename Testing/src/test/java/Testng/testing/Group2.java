package Testng.testing;

import org.testng.annotations.Test;

public class Group2 {
  @Test(groups = {"sanity"})
  public void test4() {
	  System.out.println("test4");
  }
  
  @Test(groups = {"function","regress"})
  public void test5() {
	  System.out.println("test5");
  }
  
  @Test(groups = {"sanity","smoke"})
  public void test6() {
	  System.out.println("test6");
  }
}
