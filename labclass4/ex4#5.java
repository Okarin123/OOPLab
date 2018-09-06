import java.util.Scanner;
import java.lang.Math; 

class Vector {

	Scanner sc= new Scanner(System.in);

	private int x;
	private int y;

	Vector()
		{		
		System.out.println("Enter the x component: ");
		this.x= sc.nextInt(); 

		System.out.println("Enter the y component: "); 
		this.y= sc.nextInt(); 
		}

	Vector(int x,int y)
		{
		this.x= x; 
		this.y= y;
		}

	Vector (Vector vec)
		{
		this.x= vec.getX();
		this.y= vec.getY();
		}

	Vector sum(Vector vec)
		{
		int res_x= this.x + vec.getX(); 
		int res_y= this.y + vec.getY();

		Vector result= new Vector(res_x, res_y);
		return result;
		}

	Vector difference(Vector vec)
		{
		int res_x= this.x - vec.getX(); 
		int res_y= this.y - vec.getY();

		Vector result= new Vector(res_x, res_y);
		return result;
		}

	double norm()
		{
		return Math.sqrt(this.x*this.x + this.y*this.y);
		}

	double product(Vector vec) //computes dot product
		{
		return (this.x*vec.getX() + this.y*vec.getY());
		}	

	boolean perpendicular(Vector vec)
		{ 
		if (this.product(vec)==0.0)
			return true;

		return false;
		}

	boolean parallel(Vector vec)
		{
		if (this.product(vec)==this.norm()*vec.norm())
			return true;

		return false;
		}

	final void setX(int x) { this.x= x; }
	final void setY(int y) { this.y= y; }

	final int getX() { return this.x; }
	final int getY() { return this.y; }
}

class threeD_Vector extends Vector {

	Scanner sc= new Scanner(System.in);

	private int z;
	
	threeD_Vector()
		{		
		super();

		System.out.println("Enter the z component: ");
		this.z= sc.nextInt(); 
 
		}

	threeD_Vector(int x,int y, int z)
		{
		super(x, y);
		this.z= z; 		
		}

	threeD_Vector (threeD_Vector vec)
		{
		setX(vec.getX());
		setY(vec.getY());
		this.z= vec.getZ();
		}

	threeD_Vector sum(threeD_Vector vec)
		{
		int res_x= getX() + vec.getX(); 
		int res_y= getY() + vec.getY(); 
		int res_z= this.z + vec.getZ(); 
		
		threeD_Vector result= new threeD_Vector(res_x, res_y, res_z);
		return result;
		}

	threeD_Vector difference(threeD_Vector vec)
		{
		int res_x= getX() - vec.getX(); 
		int res_y= getY() - vec.getY();
		int res_z= this.z - vec.getZ(); 

		threeD_Vector result= new threeD_Vector(res_x, res_y, res_z);
		return result;
		}

	double norm()
		{
		return Math.sqrt(getX()*getX() + getY()*getY() + this.z*this.z);
		}

	double product(threeD_Vector vec) //computes dot product
		{
		return (getX()*vec.getX() + getY()*vec.getY() + this.z*vec.getZ());
		}	

	boolean perpendicular(threeD_Vector vec)
		{ 
		if (this.product(vec)==0.0)
			return true;

		return false;
		}

	boolean parallel(threeD_Vector vec)
		{
		if (this.product(vec)==this.norm()*vec.norm())
			return true;

		return false;
		}

	final int getZ() { return this.z; }
}

class ex5 { 

	public static void main (String args[]) { 

		System.out.println("Enter first vector: ");
		threeD_Vector V1= new threeD_Vector(); 
		threeD_Vector V2= new threeD_Vector(1, 2, 3);

		System.out.println("Vector V1:\nx= " + V1.getX() + "\ty= " + V1.getY() + "\tz= " + V1.getZ() );  
		System.out.println("Vector V2:\nx= " + V2.getX() + "\ty= " + V2.getY() + "\tz= " + V2.getZ() );

		System.out.println("V1 Norm= " + V1.norm() + "\tV2 Norm= " + V2.norm() );

		threeD_Vector sum= V1.sum(V2);
		System.out.println("Sum vector:\nx= " + sum.getX() + "\ty= " + sum.getY() + "\tz= " + sum.getZ() );

		threeD_Vector diff= V1.difference(V2);
		System.out.println("Difference vector:\nx= " + diff.getX() + "\ty= " + diff.getY() + "\tz= " + diff.getZ() );
			  
		System.out.println("Dot product= " + V1.product(V2) );

		if (V1.perpendicular(V2))
			System.out.println("Perpendicular Vectors!");

		else
			System.out.println("Not perpendicular Vectors!");

		if (V1.parallel(V2))
			System.out.println("Parallel Vectors!");

		else
			System.out.println("Not parallel Vectors!");
	}
}

 
 

	
	




