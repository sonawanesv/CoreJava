package day11Assignment;

public class ThrowsThrow2 {

	public static void main(String[] args) throws ArithmeticException{
		int a=10;
		for(int i=3;i>=0;i--)
		try
		{
			System.out.println(a/i);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}

	}

}
