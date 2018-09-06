import java.util.ArrayList;

interface stack { 

	void push (int item); 
	void pop (); 
}

class stack_implement implements stack { 

	private ArrayList<> St = new ArrayList<Integer> (); 
	private int top;  

	stack_implement() 
		{
		this.top = -1; 
		}

	public void push (int item)
		{
		System.out.println("\nIn the push routine.\n");
		this.St.add(item); 
		this.top++; 
		}
	public void pop() 
		{
		System.out.println("\nIn the pop routine.\n");
		try 
			{
			int item = this.St.get(this.top); 
			System.out.println(item + " popped.\n");
			System.out.println("\npopped an item" + item);

			this.St.remove(this.top); 
			this.top--; 
			}

		catch (ArrayIndexOutOfBoundsException e) 
			{
			System.out.println("Stack empty!"); 
			} 
		}

	void display ()
		{
		System.out.println("contents of stack: " + St); 
		}
	}

class ex1 {
	
	public static void main (String args[]) { 

		stack_implement A = new stack_implement(); 
		
		A.push (1); 
		A.push (2);
		A.display(); 
 
		A.pop();
		A.pop();
		A.pop();

		A.push(3);
		A.display();
	}
}
			 
		
		
