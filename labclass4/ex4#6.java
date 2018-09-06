import java.util.Scanner; 

class Figure {

	protected double dim1;
	protected double dim2;

	Figure(double a, double b)
		{
		dim1 = a;
		dim2 = b;
		}

	double area()
		{
		System.out.println("Area for Figure is undefined.");
		return 0;
		}

	final double getDim1() { return dim1; }
	final double getDim2() { return dim2; }
}

class Triangle extends Figure {

	Triangle (double height, double base)
		{
		super (height, base); // dim1: height  dim2: base 
		}

	double area() 
		{
		return 0.5*dim1*dim2;
		}
}

class Rectangle extends Figure {

	Rectangle (double length, double breadth)
		{
		super (length, breadth);
		}

	double area()
		{
		return dim1*dim2;
		}
}

class ex6 { 

	public static void main(String args[]) {

		Scanner sc= new Scanner(System.in); 
	
		System.out.println("Enter height: ");
		double h= sc.nextDouble();
		System.out.println("Enter base length: ");
		double b= sc.nextDouble();

		Triangle T= new Triangle(h,b);
		System.out.println("Area= " + T.area());

		
		System.out.println("Enter length: ");
		double l= sc.nextDouble();
		System.out.println("Enter breadth: ");
		double br= sc.nextDouble();

		Rectangle R= new Rectangle(l,br);
		System.out.println("Area= " + R.area());
	}
}
