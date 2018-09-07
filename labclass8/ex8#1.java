class ex1 { 

	public static void main (String args[]) { 

		try {

			System.out.println("Before throwing an exception."); 
			throw new Exception("Passing a String Argument."); 
		}

		catch (Exception e) {
			System.out.println("Exception along with its string message: " + e); 
		} 
		
		finally { 
			System.out.println("Program to pass string argument to Exception complete.");
		}
	}
} 

		
