package Programs;

import java.util.Scanner;

public class Reverse_palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String x = sc.nextLine();
		String y="";
		
		for(int i=x.length()-1; i>=0; i--)
		{
			char z= x.charAt(i);
			y=y+z;
			
		}
			
		System.out.println(y);
		
		if(y.equals(x))
		{
			System.out.println("Palindrome");
		}
		
		else
		{
			System.out.println(" Not a Palindrome");
		}

	}

}
