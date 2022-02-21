package day11;

public class ExceptionThrowsDemo {
	
	void m1() {
		System.out.println("no exception in this method");
	}
	
	void m2() throws ArithmeticException{//it helps to other team member
		System.out.println("Device error or Exception may happen");
	}
	
	void m3() throws ArithmeticException{
		throw new ArithmeticException("Device error or Exception may happen");
	}

	public static void main(String[] args) {
		ExceptionThrowsDemo et = new ExceptionThrowsDemo();
		et.m1();
		et.m2();
		et.m3();

	}

}
