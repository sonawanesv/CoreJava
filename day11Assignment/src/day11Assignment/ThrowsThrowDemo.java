package day11Assignment;

public class ThrowsThrowDemo {
	void m1() throws ArithmeticException{
		System.out.println(5/0);
		}

	public static void main(String[] args) throws ArithmeticException{
		try
		{
		System.out.println(5/0);
		}
		catch (ArithmeticException e)
		{
		  e.printStackTrace	();
		}
		System.out.println("End of program!");

	}

}
