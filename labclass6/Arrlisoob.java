import java.util.ArrayList;

class driver {

	public static void main (String args[]) { 

		ArrayList<Integer> al = new ArrayList<Integer> ();
		int top=-1; 

		al.add(1);
		top++; 
		al.remove(top); 
		top--; 
		
		try
			{
			al.remove(top); 
			top--;
			}

		catch (Exception e)
			{
			System.out.println("Caught " + e); 
			} 
	}
}
