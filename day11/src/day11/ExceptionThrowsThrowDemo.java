package day11;

class A{
	void validate(int parent_income) {
		
		try
		{
		if(parent_income<5)
		{
			//create own exception and handle it using try catch 
			throw new ArithmeticException ("They are eligible");
		}
		else
		{
			System.out.println("They are not eligible");
		}
		}
		catch (ArithmeticException e)
		{
			e.printStackTrace();
		}
	}
}

public class ExceptionThrowsThrowDemo {

	public static void main(String[] args) {
		
		A a = new A();
		a.validate(4);

		System.out.println("Welcome");
	}

}
