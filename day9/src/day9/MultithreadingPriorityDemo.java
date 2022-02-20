package day9;

class E extends Thread{
	public void run (){
		System.out.println("E Thread is "+Thread.currentThread().getId());
	}
}

class F extends Thread{
	public void run (){
		System.out.println("F Thread is "+Thread.currentThread().getId());
	}
}
class G extends Thread{
	public void run (){
		System.out.println("G Thread is "+Thread.currentThread().getId());
	}
}

public class MultithreadingPriorityDemo {

	public static void main(String[] args) {
		
		E e = new E();
		e.setPriority(Thread.MIN_PRIORITY);
		e.start();
		
		F f = new F();
		f.setPriority(Thread.NORM_PRIORITY);
		f.start();
		
		G g = new G();
		g.setPriority(Thread.MAX_PRIORITY);
		g.start();
	}

}
