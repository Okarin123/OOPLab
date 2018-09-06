import java.util.Scanner; 

class LinearSearch {

	Scanner sc= new Scanner(System.in);

	int list[], size;
	int search; 
	
	LinearSearch(int n) //Constructor
		{
		this.list= new int[n];
		this.size=n;
		
		for (int i=0; i<n; i++)
			{
			System.out.println("\nEnter element: "); 
			this.list[i]= sc.nextInt();
			}

		System.out.println("\nEnter search element: ");
		this.search= sc.nextInt();
		}

	boolean searchresult () //Method
		{
		for (int i=0; i<this.size; i++)
			if (this.search==this.list[i])
				return true;  
			
		return false;
		}
	}

class ex2 {
		
	public static void main(String args[]) {

	Scanner sc= new Scanner(System.in);
		
		boolean result;

		System.out.println("\nEnter the list's size: "); 
		int N= sc.nextInt();

		LinearSearch object= new LinearSearch(N);
		result= object.searchresult(); 

		if (result==true)
			System.out.println("\nSearch element found!");
		else
			System.out.println("\nSearch element not found!"); 

		}
	}
		

		
		

		

		
		

		
		


	
	
			
	
		

	
