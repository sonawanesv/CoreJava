package day15;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector <Integer> ve = new Vector<Integer>(6);
		ve.add(5);//add element in 
		ve.add(8);
		ve.add(10);
		ve.add(15);
		ve.add(20);
		ve.add(25);
		System.out.println(ve);

		System.out.println("Size of Vector is :"+ve.size());
		System.out.println("Capacity of Vector is :"+ve.capacity());

		ve.add(35);
		System.out.println(ve);
		System.out.println("Capacity of Vector is :"+ve.capacity());
		
		ve.remove(6);
		System.out.println(ve);
		System.out.println("Capacity of Vector is :"+ve.capacity());
	}

}
