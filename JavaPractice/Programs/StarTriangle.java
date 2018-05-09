package Programs;

import java.util.Scanner;

public class StarTriangle {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter Number upto stars u want");
		
		int n = Sc.nextInt();
		for(int i=1; i<=n; i++)
		{						
			for(int j=1;j<=i; j++)
			{				
				System.out.print("*");				
			}
			
			System.out.println();
		}

	}

}
