import java.util.Hashmap; 

class Deepsheep implements Cloneable { 

	Hashmap flock = new Hashmap();

	public Deepsheep clone () 
		{
		try 
			{
			Deepsheep copy = (Deepsheep) super.clone();
			copy.flock = (flock) flock.clone (); 
			
			return copy; 	 
			}

		catch (CloneNotSupportedException e) 
			{
			System.out.println("Cloning not allowed"); 
			return this; 
			}
		}		
} 

class shallow { 

	public static void main (String args[]) {

		Deepsheep A = new Deepsheep(); 
		Deepsheep B = (Deepsheep) A.clone(); 

		System.out.println("Object A:" + A.N.a);
		System.out.println("Object B:" + B.N.a);	 
	}  
}
