class ex1 { 

	public static void main (String args[]) { 

		try {

			System.out.println("Before throwing an exception."); 
			throw new Exception(); 
		}

		catch (Exception e) {
			System.out.println("Exception caught."); 
		}

	}
} 

		
