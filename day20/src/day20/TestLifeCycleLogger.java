package day20;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

public class TestLifeCycleLogger {

	@TestInstance(LifeCycle.PER_CLASS)
	interface TestLifeCycleLogger
	{
		@BeforeAll
		default void beforeAllTests()
		{
			System.out.println("Before All Test");
		}
		@AfterAll
		default void afterAllTests()
		{
			System.out.println("After All Test");
		}
		@Test
		default void testMethod()
		{
			System.out.println("This is test method");
		}
	}
	
}
