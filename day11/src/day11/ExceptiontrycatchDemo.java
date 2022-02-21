package day11;

public class ExceptiontrycatchDemo {

	public static void main(String[] args) {
		
		int num1 = 50/10;
		System.out.println("Result "+num1);
		
		int num2 = 50/5;
		System.out.println("Result "+num2);
		
		try
		{
		int num3 = 50/0;
		System.out.println("Result "+num3);
		}
		catch (ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
		int num4 = 50/20;
		System.out.println("Result "+num4);

	}

}
