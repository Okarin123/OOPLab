class Gen<T> { 

	T ob; 

	Gen (T ob)
		{
		this.ob = ob; 
		}

	T get_obj ()
		{
		return ob; 
		}

	void show_type ()
		{
		System.out.println("object type = " + ob.getClass().getName());
		}
	}

class driver {

	public static void main (String args[]) { 

		Gen<Integer> iob = new Gen<Integer> (88); 
		iob.show_type();
		int v = iob.get_obj();

		System.out.println("value = " + v);
		}
	}

