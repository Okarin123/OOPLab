class Sample { 

	int a; 

	Sample () 
		{
		a=10; 
		}
	}
 
class driver { 

	public static void main (String args[]) {
		
		Sample A= new Sample(); 
		String classname = A.getClass().toString(); 

		System.out.println(classname);  

		if (classname.equals("class Sample")) 
			System.out.println("Success");

		else 
			System.out.println("Failure"); 		 
		
		}
	} 

	
