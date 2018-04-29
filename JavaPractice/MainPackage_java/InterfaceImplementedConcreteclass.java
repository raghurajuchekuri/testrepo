package MainPackage_java;

import SubPackage.InterfaceExample;

public class InterfaceImplementedConcreteclass implements InterfaceExample

{


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

	
	public int multiply(int x, int y) {
		
		int z;
		z = x * y;
		return (z);
	}

	
	public int division(int x, int y) {
		
		int z;
		z = x/y;
		return (z);
	}
	

}
