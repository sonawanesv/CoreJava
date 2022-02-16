package day4;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		int sum;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Value of a:");
		int a = sc.nextInt();

		System.out.println("Enter Value of b:");
		int b = sc.nextInt();

		sum= a+b;
		System.out.println("Sum of a+b is :"+sum);
		

	}

}
