package MainPackage_java;

import SubPackage.AbstractExample;
import SubPackage.AbstractImpl;


public class AbstractMain {

	public static void main(String[] args) {
		
		AbstractExample	 obj1 = new AbstractImpl();		
		int r1 = obj1.multiply(20, 20);
		System.out.println(r1);
		
		
		AbstractImpl obj2= new AbstractImpl();
		int r2 = obj1.add(20, 20);
		System.out.println(r2);
		
		

	}

}
