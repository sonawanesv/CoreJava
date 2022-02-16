package day3;

public class OverloadingPolymorphismDemo {
	
	void addition(int a, int b) {
		System.out.println("Result:"+(a+b));
	}
	//when overloading is happen the we can change datatype or arguments for removing overloading 
	//overloading is happen only compile time
	void addition (int a, double b, int c) {
		System.out.println("Result:"+(a+b+c));
	}
	void addition(int a, double b) {
		System.out.println("Result:"+(a+b));
	}
	void addition(int a, int b, int c) {
		System.out.println("Result:"+(a+b+c));
	}

	public static void main(String[] args) {
		OverloadingPolymorphismDemo op = new OverloadingPolymorphismDemo();
		op.addition(5, 2);
		op.addition(2, 4, 3);
		op.addition(6, 1);
		op.addition(6, 1, 2);

	}

}
