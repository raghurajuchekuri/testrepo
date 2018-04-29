package SubPackage;

public abstract class AbstractExample {
	
		public int add(int x, int y) {
				
				int z;
				z = x + y;
				return (z);
			}
		
			
			public int substract(int x, int y) {
				
				int z;
				z = x - y;
				return (z);
			}
			public abstract int multiply(int x, int y);
			public abstract int division(int x, int y);

}
