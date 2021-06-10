package Programs;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter Number to know prime or not");
		int x = Sc.nextInt();
		int flag =0;
		try
		{
			for(int i=2; i<x; i++)
			{
				if(x%i==0)
				{
					flag =1;
					break;
				}
							
			}
			if(flag == 0){
				System.out.print("Prime Number");				
			}
			else {
				System.out.print("Not a Prime Number");
			}
		}
		catch (Exception e) {
			
		}
		
		
	}

}
