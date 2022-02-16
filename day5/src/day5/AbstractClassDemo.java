package day5;

abstract class A  {
	
	void m1() {
		System.out.println("Abstract Class");
		//we can not call this method because of this method is abstract class method 
		//and we can not create object of abstract class
	}
}
        // using extends we can access abstract class and call abstract class method
class B extends A{
	
}

public class AbstractClassDemo {

	public static void main(String[] args) {
		B b = new B();
		b.m1();

	}

}
