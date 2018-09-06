
abstract class Shape {

	double area()	
		{
		return 0;
		}

	double volume()
		{
		return 0;
		}

	abstract void ShapeName();
	abstract void print();
	}

class Point extends Shape {

	private double x;
	private double y; 
	
	Point (double x, double y) 
		{
		this.x= x; 
		this.y= y;
		}

	final double getX() {return this.x;}
	final double getY() {return this.y;}
	
	void ShapeName()
		{
		System.out.println("Point");
		}
	
	void print()
		{
	        System.out.println("x: " + this.x + "y: " + this.y);
		}
	}

class Circle extends Point {
	
	private double radius;
	
	Circle (double x, double y, double r)
		{
	        super(x,y);
	        this.radius=r;
		}
    
	final double getRadius() {return radius;}
	
	public double area()
		{
	        return Math.PI*Math.pow(radius,2);
		}
    
        public void ShapeName()
		{
	        System.out.println("Circle");
		}
	
	public void print()
		{
	        System.out.printf("\nRadius: " + this.radius + "\nCentre: " + getX() + "," +getY() );
		}
}

class Cylinder extends Circle { 

	private double length; 

	Cylinder(double x, double y, double r, double l)
   		{
   	        super(x,y,r);
		this.length=l;
   		}
   
   	final double getLength() {return this.length;}
   
   	public double area()
   		{
        	return 2*Math.PI*getRadius()*(this.length + getRadius());
   		}
   
   	public double volume()
   		{
   	        return Math.PI*Math.pow(super.getRadius(),2)*this.length;
   		}
   
   	public void ShapeName()
   		{
   	        System.out.println("Cylinder");
   		}
   
   	public void print()
   		{
        	System.out.printf("Radius: " + getRadius() + "\tLength: " + this.length + "\nCentre: " + getX());
   		}
	} 


class Ellipse extends Point {

	private double a;
	private double b; 

   	Ellipse(double x,double y,double a,double b)
   		{
        	super(x,y);
        	this.a=a;
        	this.b=b;   
   		}

   	final double getA() { return this.a; } 
	final double getB() { return this.b; }

   	void ShapeName()
   		{
        	System.out.println("Ellipse");
   		}
 
      	void print()
   		{
		System.out.println("Centre of Ellipse: " + getX() + "," + getY());
		System.out.println("Semi-major axis: " + this.a + "\tSemi-minor axis: " + this.b);
        	}

   	double area()
   		{
        	return Math.PI*this.a*this.b;
   		}
	}

class ex2 { 

	public static void main (String args[]) { 

		Point P = new Point (10,20); 
		Shape S = P; // super-class reference 
		S.ShapeName();
		S.print(); 

		Circle C = new Circle (0,0,1); 
		Point P1 = C; 
		P1.ShapeName();
		P1.print(); 

		Cylinder Cy = new Cylinder (0,0,10,20); 
		Circle C1 = Cy; 
		C1.ShapeName();
		C1.print(); 

		Ellipse E = new Ellipse (0,0,10,20); 
		Point P2 = E; 
		P2.ShapeName(); 
		P2.print(); 
	}
}  

		  

	



	

	
