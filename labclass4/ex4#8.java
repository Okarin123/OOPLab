
class Circle {

	private double radius;
	
	public Circle (double r) 
		{
		this.radius = r; 
		}

	public double findCircumference()
		{	
		return 2*Math.PI*radius;
		}
	
	public double findArea() 
		{
		return radius*radius*Math.PI; 
		}

	public double getRadius() { return radius; }
}

class Cylinder extends Circle {

	private double len;

	public Cylinder (double r, double l)
		{
		super (r); 
		this.len= l; 
		}

	public double findArea()
		{
		return 2*Math.PI*getRadius()*this.len + 2*Math.PI*getRadius()*getRadius(); 
		}

	public double findVolume()
		{
		return Math.PI*getRadius()*getRadius()*this.len;
		}

	public double getLength() { return this.len; }
}

class ex8 {

	public static void main (String args[]) {

		Circle cir= new Circle(5.0);
		System.out.println("Circle's Radius: " + cir.getRadius() ); 
		System.out.println("Circumference= " + cir.findCircumference() + "\tArea= " + cir.findArea() ); 

		Cylinder cyl= new Cylinder (5.0, 6.5); 
		System.out.println("Cylinder's Radius: " + cyl.getRadius() + "\tCyclinder's length: " + cyl.getLength() );
		System.out.println("Surface Area= " + cyl.findArea() + "\tVolume= " + cyl.findVolume() );

	}
}
		

 
		 
