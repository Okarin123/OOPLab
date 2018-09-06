import java.util.ArrayList; 

class set {

	private ArrayList<Object> set_items; 
	
	set () 
		{
		this.set_items = new ArrayList<Object> ();
		this.set_items.clear(); 
		}

	ArrayList<Object> get_set () { return this.set_items; } 

	void display ()
		{
		System.out.println("Set contains:\t" + this.set_items); 
		}

	void add_item (Object item) 
		{
		if (this.set_items.contains(item)) 
			return; 

		else
			this.set_items.add(item);
		}

	set Union (set B) 
		{
		Object Arr_A[] = this.set_items.toArray(); 
		Object Arr_B[] = B.get_set().toArray();

		set union = new set ();  

		for (int i=0; i<Arr_A.length; i++)
			union.add_item (Arr_A[i]); 

		for (int i=0; i<Arr_B.length; i++)
			union.add_item (Arr_B[i]); 

		return union; 
		} 

	set Intersection (set B) 
		{
		Object Arr_B[] = B.get_set().toArray(); 
		
		set intersection = new set(); 		
	
		for (int i=0; i<Arr_B.length; i++) 
			if (this.set_items.contains(Arr_B[i])) 
				intersection.add_item(Arr_B[i]); 

		return intersection;		
		} 
	}

class driver { 

	public static void main (String args[]) {
 
        set set1 = new set();
        set set2 = new set();

        set1.add_item(2);
        set1.add_item('a');
        set1.add_item("arey");

        set1.display();

        set2.add_item(2.0);
        set2.add_item(true);
        set2.add_item('a');

        set2.display();

        set set3 = set1.Union(set2);
        set3.display();

        set set4 = set1.Intersection(set2);
        set4.display();
	}
}	


		
			
			
		
		
