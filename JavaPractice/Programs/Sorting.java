package Programs;

public class Sorting {

	public static void main(String[] args) {

		int a[] = new int[5];
		
		a[0]=10;  a[1]=3; a[2]=-6;	a[3]=2;	a[4]=-1;		
			
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<4; j++)
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;					
				}								
			}
		}
		
		for(int e : a)
		{
			System.out.print(e+" ");
		}
		
	}

}
