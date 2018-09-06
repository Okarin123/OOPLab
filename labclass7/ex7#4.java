
class Generics { 

	<T extends Number> T find_max (T Array[])
		{
		T max = Array[0]; 
		
		for (int i=0; i<Array.length; i++) 
			if (Array[i].doubleValue() > max.doubleValue()) 
				max = Array[i]; 

		return max; 
		}
	}

class ex4 { 

	public static void main (String args[]) { 

		Generics obj = new Generics (); 

		Integer A[] = {15,72,31,14,52,63}; 
		int max_int = obj.find_max (A); 
		System.out.println("Maximum integer = " + max_int); 
 
		Double B[] = {1.2, 35.5, 8.7}; 
		double max_double = obj.find_max (B);
		System.out.println("Maximum double = " + max_double); 

		} 
	}
   
