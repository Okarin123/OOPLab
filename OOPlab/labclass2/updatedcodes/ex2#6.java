import java.util.Scanner; 

class tableprint {
	Scanner sc= new Scanner(System.in);

	int list[][];
	
	tableprint() //Constructor
		{
		this.list= new int[4][5];

		System.out.println("Enter elements of a 4*5 Array: ");
				
		for (int i=0; i<4; i++)
			for (int j=0; j<5; j++)
				{
				System.out.println("Enter element: "); //Elements of list
				this.list[i][j]= sc.nextInt();
				}
		}

	void printlist()
		{
		for (int i=0; i<4; i++)
			{
			for (int j=0; j<5; j++)
				System.out.print(this.list[i][j]+" ");

			System.out.println();
			}
		}
	
	}

class ex6 {
		
	public static void main(String args[]) {

	tableprint object= new tableprint();
	object.printlist();
	}
}
		

		
		

		

		
		

		
		


	
	
			
	
		

	
