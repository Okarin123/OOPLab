
class TestClass {

	private int a; 

	TestClass () 
		{
		this.a=10; 
		}

	int get_a () { return this.a; } 

	}

class ex2 {

	public static void main (String args[]) { 

		try {
			
			TestClass A = new TestClass(); 
			A= null; 
	
			int method_call = A.get_a(); 
		
			System.out.println("Method return value= " + method_call); 
		}
	
		catch (NullPointerException e) {

			System.out.println("Object reference is null!"); 
			System.out.println("Exception: " + e);     
		} 
		
	}
}
 

	
