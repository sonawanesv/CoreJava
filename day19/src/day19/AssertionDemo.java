package day19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class AssertionDemo {

	@Test
	void test() {
		String A = "Hi";
		String B = "Hi";
		assertEquals(A, B);
	}
    @Test
	void test1() {
		String A = "Hi";
		String B = "Hello";
		assertEquals(A, B);
    }
    @Disabled
    @Test
    void test2() {
		int A = 1;
		int B = 3;
		assertEquals(A, B);
    }
}