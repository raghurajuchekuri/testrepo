package MainPackage_java;

import SubPackage.InterfaceExample;

public class Main_Interface {

	public static void main(String[] args) {

		// Interface obj creation
		InterfaceExample obj_IE = new InterfaceImplementedConcreteclass();
		
		int r1= obj_IE.add(10, 30);
		
		System.out.println(r1);
		
		//Concrete class Object creation
		
		InterfaceImplementedConcreteclass obj_concrete= new InterfaceImplementedConcreteclass();
		
		int r2= obj_concrete.multiply(10, 30);
		
		System.out.println(r2);

	}

}
