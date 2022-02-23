package day12;

public class stringDemo {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		System.out.println("Print 1st string "+s1);
		
		String s2 = "World";
		System.out.println("Print 2nd string "+s2);
		
		String s12 = s1.concat(s2);//This is use for joining two string
		System.out.println("Print 1st and 2nd string "+ s12);
		
		String s3 = "Hello";
		System.out.println("Print 3rd string "+s3);
		
		if (s1==s3)//this is use for checking equality
		{
			System.out.println("Strings are equal ");
		}
		else 
		{
			System.out.println("Strings are not equal");
		}
	}

}
