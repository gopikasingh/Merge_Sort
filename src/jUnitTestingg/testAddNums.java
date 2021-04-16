package jUnitTestingg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class testAddNums {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		jUnitTesting ob = new jUnitTesting();
		int ress = ob.addNumbers(100, 400);
		assertEquals(500, ress);
	}

}
