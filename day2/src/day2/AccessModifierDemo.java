package day2;

public class AccessModifierDemo {
	
	void display() {
		System.out.println("ab");
	}
	//We write PRIVATE here then we can see this method only within class
	private void display1() {
		System.out.println("ca");
	}

	public static void main(String[] args) {
	 AccessModifierDemo AM = new AccessModifierDemo();//this is the object of access modifier class
	 AM.display();//call for first method
	 AM.display1();//call for second method

	}

}
