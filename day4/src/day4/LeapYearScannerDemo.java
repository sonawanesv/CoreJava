package day4;

import java.util.Scanner;

public class LeapYearScannerDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Year : ");
		int Year = sc.nextInt();
		
		if (Year % 400 == 0) {
			System.out.println(Year +" is a leap year");
		}
		else if(Year % 100 == 0){
			System.out.println(Year + " is not a leap year");
		}
		if (Year % 4 == 0) {
			System.out.println(Year +" is a leap year");
		}
		else {
			System.out.println(Year + " is not a leap year");
		}
	}

}
