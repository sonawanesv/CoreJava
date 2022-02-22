package day11Assignment;

public class ThrowThrows5 {

	public static void main(String[] args) throws ArithmeticException{
		try
		{
			throw new ArithmeticException(""+4/0);
			
		}
		finally {
		
			System.out.println("end of try");
		
			System.out.println("divide by 0");
		}

	}

}
