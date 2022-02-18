package day8;

public class FinalDemo {
	
	// Final Variable
	final int add=9;
	void m1() {
		add=19;//If we use final keyword to variable then we can not be change the variable
		System.out.println("add := "+add);
	}

	public static void main(String[] args) {
		FinalDemo fd = new FinalDemo();
		fd.m1();

	}

}
