package day13;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<Integer> sk = new Stack<>();
		
		//boolean keyword is use for true or false
		boolean result = sk.empty();//this method is used for check stack is empty or not 
		System.out.println("Stack is empty ? "+result);
		
		sk.push(5);//this is use for push element in stack
		sk.push(8);
		sk.push(10);
		sk.push(12);
		sk.push(15);
		
		System.out.println(sk);
		
		boolean result1 = sk.empty();
		System.out.println("Stack is empty ? "+result1);
		
		sk.pop();//use for remove element in that stack
		System.out.println(sk);
		
	    int E1 = sk.peek();//check top element
		System.out.println("Top element is "+E1);
		
		int A = sk.search(5);//check position of element
		System.out.println("Position of 10 is "+A);
	}

}
