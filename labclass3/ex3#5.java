import java.util.Scanner; 

class MergeSort {
	Scanner sc= new Scanner(System.in);

	int list[], size;
	
	MergeSort(int n) //Constructor
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
		
        	// Find sizes of two sub arrays to be merged
        	int n1 = m - l + 1;
        	int n2 = r - m;
 
        	// Create temp this.arrays 
        	int L[] = new int [n1];
        	int R[] = new int [n2];
 
        	//copy data to temp arrays
        	for (int i=0; i<n1; ++i)
        	    L[i] = this.list[l + i];
        	for (int j=0; j<n2; ++j)
        	    R[j] = this.list[m + 1+ j];
 
 
        	// Merge the temp arrays
 
        	// Initial indexes of first and second arrays 
        	int i = 0, j = 0;
 
        	// Initial index of merged subthis.listy this.listay
        	int k = l;
        	while (i < n1 && j < n2)
        		{
        		if (L[i] <= R[j])
            	{
            	    this.list[k] = L[i];
            	    i++;
            	}
            	
		else
	            {
	                this.list[k] = R[j];
	                j++;
	            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            this.list[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            this.list[k] = R[j];
            j++;
            k++;
        }	}

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

	MergeSort object= new MergeSort(N);
	object.sort(); 
	object.printlist();
	}
}
		

		
		

		

		
		

		
		


	
	
			
	
		

	
