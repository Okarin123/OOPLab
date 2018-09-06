
class MyException extends Exception { 

	private String str; 

	MyException (String x)
		{
		this.str = x; 
		}

	void display () 
		{
		System.out.println("String is " + str); 
		} 

	public String toString () 
		{
		return "My Exception for " + str + ": length less than 5.";   
		}
	}

class ex4 {

	static void check_exception (String A) throws MyException {

		System.out.println("Checking exception for " + A);
 
		if (A.length() < 5) 
			throw new MyException (A); 

		System.out.println("No Exception caught."); 		
		} 

	public static void main (String args[]) { 

		try {

			check_exception ("Steins;Gate"); 
			check_exception ("Fmab"); 

		} 

		catch (MyException e) { 

			System.out.println("Caught " + e);  
		}
	}
}

		
