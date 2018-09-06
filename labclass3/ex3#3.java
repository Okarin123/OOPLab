import java.util.Scanner; 

class queue {
	Scanner sc= new Scanner(System.in); 

	int Array[]; 
	int front, rear;
	int max_size; 
	
	queue() //Constructor
		{
		this.Array= new int[10];
		this.front=-1;
		this.rear=0;  
		this.max_size=10;
		}

	boolean enqueue()
		{
		if (this.rear==max_size-1)
			return false; 

		System.out.println("Enter the element to be inserted: ");
		this.Array[rear++]= sc.nextInt(); 
		
		return true; 
		}

	boolean dequeue()
		{
		if (this.front>=this.rear-1)
			return false; 

		System.out.println("The dequeued element is: " + this.Array[++this.front]);
		return true; 
		}
	}

class ex3{
	
	public static void main(String args[]){

		Scanner sc= new Scanner(System.in);
	
		queue Q= new queue(); 
		int choice; 
		boolean result;

		do {
			System.out.println("1.Enqueue\t2.Dequeue\t3.Exit"); 
			System.out.println("Enter choice: ");
			choice= sc.nextInt(); 

			switch (choice)

				{
				case 1: 
					result=Q.enqueue();

					if (result==false)
						System.out.println("Queue Full!"); 

					else
						System.out.println("Element inserted!");

					break; 

				case 2: 
					result=Q.dequeue();
				
					if (result==false)
						System.out.println("Queue empty!"); 
					
					break; 

				case 3: 
					break; 

				default: 
					System.out.println("Enter apt. choice!");

				}

			} while (choice!=3);
		}
	}

					
			

			
	
	
 


		

		
	
		
		
		
			

	 

	
	
