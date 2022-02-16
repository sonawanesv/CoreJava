package day3;

public class InheritanceOverridingPolymorphismDemo extends A{
	
	int a=2;
	int b=3;
	int c;
	void sum() {
		c=a+b;
		System.out.println("Result:"+c);
	}
	void multiplication(int a, int b) {
		System.out.println("Result:"+(a*b));
	}

	public static void main(String[] args) {
		InheritanceOverridingPolymorphismDemo iop = new InheritanceOverridingPolymorphismDemo();
		iop.sum();
		iop.multiplication(2, 3);
		A a = new A();
		a.multiplication(2, 4);
	}

}
class A{
	void multiplication(int a, int b) {
		System.out.println("Result:"+(a*b));
	}
}
