package MainPackage_java;

import SubPackage.StaticExample;

public class StaticExamplemain {

	public static void main(String[] args) {

		StaticExample se = new StaticExample();
		se.x=20;
		se.y=30;
		se.display();
		
		StaticExample se2 = new StaticExample();
		se2.y=10;
		
		System.out.println(StaticExample.x);
		se.display();

	}

}
