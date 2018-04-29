package MainPackage_java;

import SubPackage.Variables;

public class MainClass {

	public static void main(String[] args) {

		//import SubPackage.Variables; gave link as it is public 
		// Constructor assigned values to below
		Variables v = new Variables(); 
		
		
		// Variables with out values assignment
		System.out.println(v.x); //0
		System.out.println(v.y); //0.0		
		System.out.println(v.z); //Space
		System.out.println(v.w); //False
		System.out.println(v.s); //Null
		
	}

}
