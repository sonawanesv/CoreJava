package day5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws Exception, IOException {
		
		int sum;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter first number : ");
		int a = Integer.parseInt(br.readLine());

		System.out.println("Enter second number : ");
		int b = Integer.parseInt(br.readLine());


		sum = a+b;
		System.out.println("Result : "+sum);


	}

}
