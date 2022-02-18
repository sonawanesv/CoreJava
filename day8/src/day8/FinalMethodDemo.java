package day8;

public class FinalMethodDemo {
	
	final void m1() {//final method
		
		System.out.println("first");
	}

	public static void main(String[] args) {
		A a = new A();
		a.m1();
		FinalMethodDemo fm = new FinalMethodDemo();
	    fm.m1();
		

	}

}
class A extends FinalMethodDemo{
	
	void m1 () {//make any method of final we cannot override it
    System.out.println("first second");
    }
}
