package Testing.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AgeTest {
	AgeValidation agevalid;
	
	@Before
	public void init() {
		agevalid = new AgeValidation();
		System.out.println("@before code initited");
	}

	@Test
	public void test1() {
		
		assertEquals("valid to vote", agevalid.ageValidator(24));
		System.out.println("@test of test1 initited");
		
	}
	@Test
	public void test2() {
		
		assertEquals("not valid to vote", agevalid.ageValidator(12));
		System.out.println("@test of test2 initited");
	}
	@After
	public void destroyobj() {
		agevalid=null;
		System.out.println("@After initited");
		System.out.println("================");
	}
}
