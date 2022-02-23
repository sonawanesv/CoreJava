package day13;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<>();
		
		ll.add(10);//add element in linkedlist
		ll.add(12);
		ll.add(14);
		ll.add(16);
		ll.add(18);
		ll.add(20);
		ll.add(22);
		System.out.println(ll);
		
		ll.add(2,25);//add element at specific position
		System.out.println(ll);

		ll.addFirst(27);//add element at first position
		System.out.println(ll);
		
		ll.addLast(30);//add element at last position
		System.out.println(ll);
		
		ll.remove();//remove first element of list
		System.out.println(ll);
		
		ll.remove(2);//remove specific element
		System.out.println(ll);
		
		ll.removeLast();//remove last element
		System.out.println(ll);
		
		ll.set(2, 24);//replace specific element
		System.out.println(ll);
	}

}
