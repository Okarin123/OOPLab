import java.util.Scanner; 

class BubbleSort {
	Scanner sc= new Scanner(System.in);

	int list[], size;
	
	BubbleSort(int n) //Constructor
		{
		this.list= new int[n];
		this.size=n;
		
		for (int i=0; i<n; i++)
			{
			System.out.println("Enter element: "); //Elements of list
			this.list[i]= sc.nextInt();
			}
		}

	void sort() //Method
		{

		for (int i=0; i<this.size-1; i++)
			for (int j=0; j<this.size-i-1; j++)	
      				if (this.list[j] > this.list[j+1]) 
      					{
					int temp= this.list[j];
					this.list[j]=this.list[j+1];
					this.list[j+1]=temp;
					}
		System.out.println("Sorting successful!");
		}

	void printlist()
		{
		for (int i=0; i<this.size; i++)
			System.out.println(this.list[i]);
		}
	
	}

class ex4 {
		
	public static void main(String args[]) {

	Scanner sc= new Scanner(System.in);
		
	System.out.println("\nEnter the list's size: "); 
	int N= sc.nextInt();

	BubbleSort object= new BubbleSort(N);
	object.sort(); 
	object.printlist();
	}
}
		

		
		

		

		
		

		
		


	
	
			
	
		

	
