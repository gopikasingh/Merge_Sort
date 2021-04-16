package jUnitTestingg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddStrings {

	@Test
	void test() {
		//fail("Not yet implemented");
		
		jUnitTesting ob = new jUnitTesting();
		String ress = ob.addStrings("Hello", " bye");
		assertEquals("Hello bye", ress);
	}

}
