package Programs;

public class FabinocciSeries {

	public static void main(String[] args) {
		
		// 0 1 1 2 3 5 8 13 21

		int a=0, b=1, c;
		
		System.out.print(a +" "+ b+" ");
		for (int i=0; i<15; i++)
		{
			c = a + b;
			System.out.print(c +" ");
			
			a=b;
			b=c;
			
		}

	}

}
