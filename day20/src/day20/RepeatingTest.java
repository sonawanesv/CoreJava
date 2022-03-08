package day20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class RepeatingTest {

	@RepeatedTest(10)
	void test() {
		System.out.println("Test Case.....");
	}

}
