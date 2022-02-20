package day10;

public class ArrayDemo {

	public static void main(String[] args) {
		int a[] = new int[5]; // declaring the array
		
		// its memory location start from 0 thats why we given our first value in 0 of array
		a[0] = 34; // insert first value in first location of array i.e 0
		a[1] = 2;
		a[2] = 5;
		a[3] = 20;
		a[4] = 25;// it represent n-1 our array size is 5 but we write he a[4] because its start from 0

		for (int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		
	}
	

}
