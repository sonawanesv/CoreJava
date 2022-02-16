package day6;

interface A{
	void m1() ;// we can not give body to interface method
}

interface B{
	void m2();
}

class C implements A,B{

	@Override
	public void m1() {
		
		
	}

	@Override
	public void m2() {
		
		
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
