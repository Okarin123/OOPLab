import java.util.Scanner; 

class InSort {
	Scanner sc= new Scanner(System.in);

	int list[], size;
	
	InSort(int n) //Constructor
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
		int last, to_be_sorted, pos, j; 

		for (int i=0; i<this.size-1; i++)
			{
			last=i; 
			to_be_sorted=this.list[i+1];

			for (j=i+1; j<this.size-1; j++)
				this.list[j]=this.list[j+1];
		
			for (j=0; j<=last; j++)
				if (to_be_sorted<=this.list[j])
					break; 

			pos=j; 

			for (int k=this.size-2; k>=pos; k--)
				this.list[k+1]=this.list[k];

			this.list[pos]=to_be_sorted;
			}

		System.out.println("Sorting successful!");
		}
	
	void printlist()
		{
		for (int i=0; i<this.size; i++)
			System.out.println(this.list[i]);
		}
	
	}

class ex5 {
		
	public static void main(String args[]) {

	Scanner sc= new Scanner(System.in);
		
	System.out.println("\nEnter the list's size: "); 
	int N= sc.nextInt();

	InSort object= new InSort(N);
	object.sort(); 
	object.printlist();
	}
}
		

		
		

		

		
		

		
		


	
	
			
	
		

	
