import java.util.Scanner; 

class stack {
	Scanner sc= new Scanner(System.in); 

	int Array[]; 
	int top_index;
	int max_size; 
	
	stack() //Constructor
		{
		this.Array= new int[10];
		this.top_index=0; 
		this.max_size=10;
		}

	boolean push()
		{
		if (this.top_index==this.max_size)
			return false; 

		System.out.println("Enter the element to be pushed: ");
		this.Array[top_index++]= sc.nextInt(); 

		return true; 
		}

	boolean pop()
		{
		if (this.top_index==0)
			return false; 

		System.out.println("The element popped is: " + this.Array[--this.top_index]);
		return true; 
		}
	}

class ex2{
	
	public static void main(String args[]){

		Scanner sc= new Scanner(System.in);
	
		stack S= new stack(); 
		int choice; 
		boolean result;

		do {
			System.out.println("1.Push\t2.pop\t3.Exit"); 
			System.out.println("Enter choice: ");
			choice= sc.nextInt(); 

			switch (choice)

				{
				case 1: 
					result=S.push();

					if (result==false)
						System.out.println("Stack overflow!"); 

					else
						System.out.println("Element pushed!");

					break; 

				case 2: 
					result=S.pop();
				
					if (result==false)
						System.out.println("No elements to be popped!"); 
					
					break; 

				case 3: 
					break; 

				default: 
					System.out.println("Enter apt. choice!");

				}

			} while (choice!=3);
		}
	}

					
			

			
	
	
 


		

		
	
		
		
		
			

	 

	
	
