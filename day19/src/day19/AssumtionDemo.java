package day19;

import org.junit.Test;
import org.junit.jupiter.api.Assumptions;

public class AssumtionDemo {

	@Test
	public void testonDev() {
		System.setProperty("ENV", "DEV");
		Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
	}
	@Test
	public void testonProd() {
		System.setProperty("ENV", "PROD");
		Assumptions.assumingThat("DEV".equals(System.getProperty("ENV")),AssumtionDemo:: message);	
	}
	private static String message () {
		return"Test Execution Failed::";
	}
}
