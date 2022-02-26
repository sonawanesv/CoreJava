package day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class ArrayListDemo {
	
	 void Display(ArrayList<Integer> al) {
			Iterator<Integer> it = al.listIterator();
			while(it.hasNext()) {
				System.out.println("Element is: "+ it.next());
		 }
	 }
	public static void main(String[] args) {
		
		ArrayList <Integer> al = new ArrayList<Integer>(6);
		al.add(5);//add element in arraylist
		al.add(8);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		System.out.println(al);

		ArrayListDemo am = new ArrayListDemo();
		am.Display(al);
		
		System.out.println("Change Element : "+al.get(1));
		
		al.set(1,30);//replace element
		System.out.println("Replaced Element : "+al);
		
		Collections.sort(al);//sort array
		System.out.println(al);
		
		al.remove(1);//remove element in arraylist
		System.out.println(al);
		
		al.ensureCapacity(10);
		System.out.println(al);
	}

}
