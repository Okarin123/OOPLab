import java.util.ArrayList;

class stack { 

	private ArrayList<Integer> St = new ArrayList<Integer> (); 
	private int top;  

	stack() 
		{
		this.top = -1; 
		}

	void push (int item)
		{
		this.St.add(item); 
		this.top++; 
		}

	void pop() 
		{
		try 
			{
			/int item = this.St[this.top]; 
			System.out.println(item + " popped.");

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

		stack A = new stack(); 
		
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
			 
		
		
