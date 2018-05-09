package Programs;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter Number to know prime or not");
		int n = Sc.nextInt();
		int flag =0;
		try
		{
			for(int i=2; i<n; i++)
			{
				if(n%2==0)
				{
					flag =1;
					break;
				}
							
			}
			if(flag == 0)
			{
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
