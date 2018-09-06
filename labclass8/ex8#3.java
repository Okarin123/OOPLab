class Elements {

	private int Array[]; 
	private int count;  

	Elements ()
		{
		this.Array = new int[2]; 
		this.count = -1;  
		}

	void add_element (int x) 
		
		{ 

		try {
		
			this.Array[++count] = x; 
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array full."); 
			System.out.println("Exception: " + e); 

			System.out.println("Contents of full array:");  

			for (int i=0; i<this.count; i++) 
				{
				System.out.print (this.Array[i] + " "); 
				}

			System.out.println("");
		}
  
		} 
	} 

class ex3 {

	public static void main (String args[]) { 

		Elements A = new Elements(); 

		A.add_element(1); 
		A.add_element(2);
		A.add_element(3); 
	}
}
	
  

		
