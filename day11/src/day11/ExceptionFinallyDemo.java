package day11;

public class ExceptionFinallyDemo {

	public static void main(String[] args) {
		
		System.out.println("Exception Demo");
		
		int a[] = new int[5];
		
		try 
		{
		int i = a[6];
		System.out.println(i);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("This line get executed in any situaton");
		}
		

		System.out.println("Size of array");
	}

}
