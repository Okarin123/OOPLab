
class A {

	 protected int x; 

	A()
	{
	x=10;
	}

	}

class B extends A{
	
	//private int x; 
	private int y; 
	
	B()
	{
	super(); 
	y=5;
	}

	void print()
	{
	System.out.println(this.x + "," + this.y);
	}
	
}

class driver {

	public static void main (String args[]) {

		B b = new B(); 

		b.print();
 		}

	}
