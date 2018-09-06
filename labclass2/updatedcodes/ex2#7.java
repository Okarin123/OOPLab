import java.util.Scanner; 

class Matrix {
	Scanner sc= new Scanner(System.in);

	int list[][], result[][], rows, coloumns;
	
	Matrix(int x, int y) //Constructor
		{
		this.rows=x; 
		this.coloumns=y;
		this.list= new int[x][y];

		System.out.println("Enter elements of the matrix: ");
				
		for (int i=0; i<x; i++)
			for (int j=0; j<y; j++)
				{
				System.out.println("Enter element: "); //Elements of list
				this.list[i][j]= sc.nextInt();
				}
		}

	void Multiplication(Matrix B)
		{

		if (this.coloumns!=B.rows)
			{
			System.out.println("Matrices cannot be multiplied!");
			return;
			}

		this.result= new int[this.rows][B.coloumns];
		
		for (int i=0; i<this.rows; i++)
			for (int j=0; j<B.coloumns; j++)
				for (int k=0; k<this.rows; k++)
					this.result[i][j]+=this.list[i][k]*B.list[k][j];
		}

	void finalresult(Matrix B)
		{
		System.out.println("Result of matrix multiplication: ");

		for (int i=0; i<this.rows; i++)
			{
			for (int j=0; j<B.coloumns; j++)
				System.out.print(this.result[i][j]+" "); 

			System.out.println();
			}
		}
	}


class ex7 {
			
	public static void main(String args[]) {

	Scanner sc= new Scanner(System.in);
	
	System.out.print("\nEnter the number of rows and coloumns for first matrix: "); 
	int row1= sc.nextInt();
	int col1= sc.nextInt();
	Matrix obj1= new Matrix(row1, col1);		

	System.out.print("\nEnter the number of rows and coloumns for second matrix: ");
	int row2= sc.nextInt();
	int col2= sc.nextInt(); 
	Matrix obj2= new Matrix(row2, col2);

	obj1.Multiplication(obj2);
	obj1.finalresult(obj2);
	
	}
}
		

		
		

		

		
		

		
		


	
	
			
	
		

	
