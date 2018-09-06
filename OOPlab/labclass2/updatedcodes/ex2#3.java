import java.util.Scanner; 

class BinarySearch {

	Scanner sc= new Scanner(System.in);

	int list[], size;
	int search; 
	
	BinarySearch(int n) //Constructor
		{
		this.list= new int[n];
		this.size=n;
		
		for (int i=0; i<n; i++)
			{
			System.out.println("Enter element: "); //Elements of list
			this.list[i]= sc.nextInt();
			}

		System.out.println("\nEnter search element: ");
		this.search= sc.nextInt();
		}

	boolean searchresult () //Method 1
		{
		int first=0, last=(this.size-1), mid;
				
		while (first<=last)
			{
			mid=(first+last)/2;

			if (this.search==this.list[mid])
				return true;

			else if (this.search<this.list[mid])
				last=mid-1;

			else
				first=mid+1;
			}

		return false;
		}

	void sort() //Method 2
		{

		for (int i=0; i<this.size-1; i++)
			for (int j=0; j<this.size-i-1; j++)	
      				if (this.list[j] > this.list[j+1]) 
      					{
					int temp= this.list[j];
					this.list[j]=this.list[j+1];
					this.list[j+1]=temp;
					}
		}
	}

class ex3 {
		
	public static void main(String args[]) {

	Scanner sc= new Scanner(System.in);
		
		boolean result;

		System.out.println("\nEnter the list's size: "); 
		int N= sc.nextInt();

		BinarySearch object= new BinarySearch(N);
		object.sort();
		result= object.searchresult(); 

		if (result==true)
			System.out.println("\nSearch element found!");
		else
			System.out.println("\nSearch element not found!"); 

		}
	}
		

		
		

		

		
		

		
		


	
	
			
	
		

	
