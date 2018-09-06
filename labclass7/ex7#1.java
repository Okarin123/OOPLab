class Non_Generic { 

	<T> boolean search (T x, T[] Y) 
		{
		for (int i=0; i<Y.length; i++) 
			if (Y[i] == x) 
				return true; 

		return false;
		} 

	} 

class ex1 {
	
	public static void main (String args[]) { 
 
		Non_Generic obj = new Non_Generic (); 

		Integer A[] = {1,2,3}; 
	
		if (obj.search (9, A)) 
			System.out.println("Found.");

		else
			System.out.println("Not found."); 
		}
	} 
