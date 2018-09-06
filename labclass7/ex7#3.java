
interface list<T extends Number> { 

	void insert (T item);
	void delete (T item); 
	void display ();
	}

class node<T> { 

	T elem; 
	node<T> next;
	}

class LinkedList<T extends Number> implements list<T> { 

	private node<T> front;
	private node<T> rear;  

	LinkedList ()
		{
		front = null; 
		rear = null; 
		}

	public void insert (T item) 
		{
		node<T> newnode = new node<T> (); 
		newnode.elem = item; 
		newnode.next = null; 

		if (rear==null) 
			front = rear = newnode; 

		else
			{
			rear.next = newnode; 
			rear = newnode; 
			}

		System.out.println("Successfully inserted!"); 
		}

	public void delete (T item) 
		{
		node<T> previous = null; 
		node<T> current = this.front;

		while (current!=null) 
			{
			if (current.elem!=item) 
				{
				previous = current; 
				current = current.next;
				continue;  
				}

			else
				{
				if (current==front)
					front = current.next; 

				else
					previous.next = current.next;

				break;  
				}
			} 
		}

	public void display () 
		{
		node<T> current = this.front;

		while (current!=null) 
			{
			System.out.println(current.elem);
			current = current.next;
			}    
		}
	}

class ex3 { 

	public static void main (String args[]) {

		LinkedList<Double> list = new LinkedList<Double> ();

		list.insert (1.3);
		list.insert (2.0); 
		list.insert (4.9); 
		list.insert (5.5); 
		
		//list.delete (1.3);
		list.delete (1.3);

		list.display();
		}
	} 
 

		


	
