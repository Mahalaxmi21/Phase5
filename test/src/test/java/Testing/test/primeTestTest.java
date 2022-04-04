package Testing.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class primeTestTest {
  @Test
  public void test1() {
	  Prime pm=new Prime();
	  assertEquals("is prime number",pm.prime(24));
	  System.out.println("@test pf test1 intiated");
	  
  }
}
