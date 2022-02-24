package day14;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo {
	
	void Display(List<String> list) {
		Iterator<String> it = list.listIterator();
		while(it.hasNext()) {
			System.out.println("Element is: "+ it.next());
		}
	}

	public static void main(String[] args) {
		 
		List<String> obj = new LinkedList();
		obj.add("ABC");
		obj.add("DEF");
		obj.add("GHI");
		obj.add("JKL");
		obj.add("MNO");
		obj.add("PQR");
		System.out.println("Element is: "+obj);
		
		IteratorDemo id = new IteratorDemo();
		obj.sort(null);
		id.Display(obj);
		System.out.println("Reverse element");
		Collections.reverse(obj);
		id.Display(obj);
		
		
		
		
	}

}
