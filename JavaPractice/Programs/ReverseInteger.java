package Programs;

public class ReverseInteger {

	public static void main(String[] args) {

			int x=453786, y=0;
			
			while( x!=0)
			{
				int d= x%10;
				y=y*10 + d;
				x=(int)x/10;				
				
			}
			
			System.out.print(y);	
			

	}

}
