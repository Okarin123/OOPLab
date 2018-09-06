import java.util.Scanner; 

class box {
	Scanner sc= new Scanner(System.in); 
 
	double length;
	double width;
	double height; 

	box() // Default constructor
		{
		System.out.println("Enter the lenght: ");
		this.length= sc.nextInt();

		System.out.println("Enter the width: ");
		this.width= sc.nextInt();
		
		System.out.println("Enter the height: ");
		this.height= sc.nextInt();
		}

	box(double l, double w, double h) // Parameterized constructor
		{
		this.length=l;
		this.width=w;
		this.height=h;
		}

	double volume() //Volume Method 
		{
		return this.length*this.height*this.width;
		}

	double surface_area() //Surface Area Method
		{
		return 2*(this.length*this.width + this.width*this.height + this.height*this.length);
		}

	void compare(box B) //Method to compare
		{
		
		if (this.volume()==B.volume())
			System.out.println("Equal Volumes!");

		else
			System.out.println("Unequal Volumes!");

		if (this.surface_area()==B.surface_area())
			System.out.println("Equal Surface areas!");

		else
			System.out.println("Unequal Surface areas!");

		if ((this.length==B.length)&(this.width==B.width)&(this.height==B.height))
			System.out.println("Equal Dimensions!");

		else
			System.out.println("Unequal Dimensions!");
		}
	}

class ex1 {

	public static void main (String args[]) {

		box B1= new box(); 
		box B2= new box(10, 20, 30); 
		box B3= new box(20, 30, 10); 

		double vol_B1= B1.volume(); 
		double vol_B2= B2.volume();
		double vol_B3= B3.volume(); 

		double sur_B1= B1.surface_area();
		double sur_B2= B2.surface_area();
		double sur_B3= B3.surface_area();

		System.out.println("Volumes: ");
		System.out.println(vol_B1 + "," + vol_B2 + "," + vol_B3); 
		System.out.println("Surface areas:");
		System.out.println(sur_B1 + "," + sur_B2 + "," + sur_B3);

		B2.compare(B3);
		}
	} 
		

		

	

	
