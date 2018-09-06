
class Stack { 

	private	int Stack_Array[]; 
	private int top; 

	Stack ()
		{
		this.Stack_Array = new int[3]; 
		this.top = -1; 
		}

	void push (int item) 
		{
		this.Stack_Array[++this.top] = item; 
		}

	int pop () 
		{
		return this.Stack_Array[this.top--]; 
		}

	void display_stack ()
		{
		for (int i=this.top; i>=0; i--) 
			System.out.println(this.Stack_Array[i] + " "); 
		}

	} 

class ex5 { 

	public static void main (String args[]) { 

		Stack A = new Stack(); 
		int popped; 

		try { 

			A.push(1); 
			A.push(2); 
			A.push(3); 

			popped = A.pop();
			System.out.println(popped + " popped."); 
			popped = A.pop();
			System.out.println(popped + " popped.");

			A.push(4);
		}

		catch (ArrayIndexOutOfBoundsException e) {

			System.out.println ("invalid operation."); 
			System.out.println ("Exception: " + e); 
		}

		finally {

			A.display_stack(); 
		}
	}
} 
		 
			  

			

		  
 
