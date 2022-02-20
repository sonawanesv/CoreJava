package day9;

class A extends Thread{
	public void run (){
		System.out.println("A Thread is "+Thread.currentThread().getId());
	}
}

class B extends Thread{
	public void run (){
		System.out.println("B Thread is "+Thread.currentThread().getId());
	}
}
class C extends Thread{
	public void run (){
		System.out.println("C Thread is "+Thread.currentThread().getId());
	}
}
class D implements Runnable {
	public void run (){
		System.out.println("D Thread is "+Thread.currentThread().getId());
	}
}
public class MultithreadingDemo {

	public static void main(String[] args) {
		A a = new A();
		a.start();
		
		B b = new B();
		b.start();
		
		C c = new C();
		c.start();
		
		D d = new D();
		Thread obj1 = new Thread(d);
		obj1.start();
		
		for (int i=0;i<5;i++) {
		System.out.println("Main Thread is "+Thread.currentThread().getId());
		}
	}

}
