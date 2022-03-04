package day19;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class AssertionDemo1 {

	@Test
	public void test() {
		int A = 1;
		int B = 2;
		int C = 1;
		String D = null;
		//check condition is true
		boolean assertTrue=(A>B);
		//check condition is false
		boolean assertFalse=(A>C);
		//check that a object isn't null
		assertNotNull(A);
		//Check that object is null
		assertNull(D);
		//check two values are same
		assertSame(A,C);
		//check two values are not same
		assertNotSame(A,B);

	}
	@Test
	public void test1() {
		String arr1[] = {"one","two","three"};
		String arr2[] = {"one","two","three"};
		assertArrayEquals(arr1,arr2);
	}
	
}
