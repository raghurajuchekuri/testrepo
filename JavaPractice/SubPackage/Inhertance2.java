package SubPackage;

public class Inhertance2 extends OverridingExample {
	
	public int x=40;

	public void print()
	{
		
		System.out.println("I am Child");
		super.print();
		System.out.println(this.x);

	}

}
