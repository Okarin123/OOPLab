import java.util.Scanner;
import java.lang.Math; 

class vector {
	Scanner sc= new Scanner(System.in); 

	double x;
	double y;

	vector() 
		{
		System.out.println("Enter the x component: ");
		this.x= sc.nextDouble(); 

		System.out.println("Enter the y component: "); 
		this.y= sc.nextDouble(); 
		}

	void sum(vector B, vector Res)
		{
		Res.x= B.x + this.x;
		Res.y= B.y + this.y; 
		}
	
	void difference(vector B, vector Res)
		{
		Res.x= this.x - B.x;
		Res.y= this.y - B.y;
		}

	double norm()
		{
		return Math.sqrt(this.x*this.x + this.y*this.y);
		}

	double dot_prod(vector B)
		{
		return this.x*B.x + this.y*B.y;
		}

	boolean perpendicular(vector B)
		{
		double dotproduct= this.dot_prod(B); 
	
		if (dotproduct==0)
			return true;

		else
			return false;
		}

	boolean parallel(vector B)
		{
		if (this.norm()*B.norm()==this.dot_prod(B))
			return true;
	
		else
			return false;
		}

	double get_x() {return this.x;}
	double get_y() {return this.y;} 
	}

class triangle {

	triangle(vector A, vector B, vector C)
		{	
		System.out.println("Enter three vectors to check if they form a triangle.");
	
		A.sum(B,A);  // A holds the sum of the three vectors. 
		C.sum(A,A);
	
		if (A.norm()==0)
			System.out.println("The vectors form a triangle.");
	
		else
			System.out.println("The vectors don't form a triangle.");
		}
	 
	}

class rectangle {

	rectangle(vector A, vector B, vector C, vector D)
		{
		System.out.println("Enter four vectors to check if they form a rectangle.");

		A.sum(B,A); // A holds sum of four vectors
		C.sum(A,A);
		D.sum(A,A); 
		
		if (A.norm()==0)
			System.out.println("The vectors form a rectangle.");

		else
			System.out.println("The vectors don't form a rectangle.");
		}
	}

class ex4 {

	public static void main(String args[]) {

		Scanner sc= new Scanner(System.in);

		int choice;  
		double result;
		boolean B_result;

		System.out.println("Enter vector 1: ");		
		vector W= new vector();

		System.out.println("Enter vector 2: ");
		vector X= new vector();

		System.out.println("Enter vector 3: ");
		vector Y= new vector();

		System.out.println("Enter vector 4: ");
		vector Z= new vector(); 

		X.sum(Y,X);
		System.out.println("Result:");
		System.out.println("X component: " + X.get_x() + "Y component: " + X.get_y()); 
		 

		X.difference(Y,X);
		System.out.println("Result:");
		System.out.println("X component: " + X.get_x() + "Y component: " + X.get_y()); 
		
			
		result= X.norm(); 
		System.out.println("Norm= " + result);
 

		result= X.dot_prod(Y); 
		System.out.println("Dot product= " + result);
		

		B_result= X.parallel(Y); 
		if (B_result==true)
				System.out.println("Parallel vectors!");
		else
			System.out.println("Not Parallel!");

		B_result= X.perpendicular(Y); 
		if (B_result==true)
			System.out.println("Perpendicular vectors!");
		else
			System.out.println("Not Perpendicular!");

		rectangle R= new rectangle(W,X,Y,Z);
		triangle T= new triangle(X,Y,Z);
		
		}
	}

					
			

			
	
	
 


		

		
	
		
		
		
