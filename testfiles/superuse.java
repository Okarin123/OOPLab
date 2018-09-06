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

	




