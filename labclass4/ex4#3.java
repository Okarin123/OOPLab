import java.util.Scanner;

class Fraction {

	Scanner sc= new Scanner(System.in);

	private int num;
	private int denom;

	Fraction() 
		{
		System.out.println("Enter numerator: "); 
		this.num= sc.nextInt(); 

		System.out.println("Enter denominator: ");
		this.denom= sc.nextInt();
		
		if (num==denom)
			{
			this.num=this.denom=1; 
			return; 
			}

		int temp, gcd=1;

		if (num<denom)
			temp= num; 

		else 
			temp= denom;

		for (int i=2; i<=temp; i++)
			if ((this.denom%i==0)&&(this.num%i==0))
				gcd=i; 
		this.num/= gcd; 
		this.denom/= gcd; 

		}

	Fraction(int n, int d)
		{

		System.out.println("Enter numerator: "); 
		this.num= sc.nextInt(); 
		System.out.println("Enter denominator: ");
		this.denom= sc.nextInt();

		if (n==d)
			{
			this.num=this.denom=1; 
			return; 
			}

		int temp, gcd=1;

		if (n<d)
			temp= n; 

		else 
			temp= denom;

		for (int i=2; i<=temp; i++)
			if ((this.denom%i==0)&&(this.num%i==0))
				gcd=i; 
		this.num/= gcd; 
		this.denom/= gcd; 

		}

	void display()
		{
		System.out.println("Fraction: " + this.num + "/" + this.denom);
		}

	boolean isZero () 
		{
		if (num==0)
			return true; 

		return false; 
		}

	boolean isOne () 
		{
		if (this.num==this.denom)
			return true; 

		return false;
		}

	boolean isInt() 
		{
		if (this.denom==1)
			return true; 

		return false;
		}
		
	int floor()
		{
		float val= (float) this.num/this.denom;
		return (int)val;
		}

	int ceiling()
		{
		float val= (float) this.num/this.denom;
		return ((int)val)+1;
		} 

	int compare_fraction (Fraction B)
		{
		if ((this.num==B.getNum())&&(this.denom==B.getDenom()))
			return 0; 

		else
			return 1; 
		}

	int compare_fraction (int x)
		{
		if ((this.denom==1)&&(this.num==x))
			return 0; 
	
		else
			return 1; 
		}

	Fraction add_fractions (Fraction B)
		{
		int res_num= this.num*B.getDenom() + this.denom*B.getNum();
		int res_denom= this.denom*B.getDenom();
		
		Fraction result= new Fraction(res_num, res_denom); 
		return result;
		}

	void add_fractions (int x)
		{
		this.num= this.num + x*this.denom;
		}

	final int getNum() { return this.num; }
	final int getDenom() {return this.denom; }
}

class ex3 { 

	public static void main(String args[]) { 

		Scanner sc= new Scanner(System.in);

		Fraction f1= new Fraction();
		f1.display(); 
	
		if (f1.isZero())
			System.out.println("Is zero!");

		else if (f1.isOne())
			System.out.println("Is one!");
	
		else if (f1.isInt())
			System.out.println("Is integer!");

		else 
			System.out.println("");

		System.out.println("Floor value= " + f1.floor() + "Ceiling value= " + f1.ceiling());

		System.out.println("Enter fraction to be compared:");
		Fraction f2= new Fraction(); 

		if (f1.compare_fraction(f2)==1)
			System.out.println("Unequal fractions");

		else 
			System.out.println("Equal fractions");

		System.out.println("Enter integer to be compared");
		int compare= sc.nextInt(); 

		if (f1.compare_fraction(compare)==1)
			System.out.println("Fraction and integer are unequal");

		else
			System.out.println("Fraction and integer are equal");

		System.out.println("Enter fraction to be added:");
		Fraction f3= new Fraction();

		Fraction sum= f1.add_fractions(f3);
		System.out.println("Sum:");
		sum.display();

		System.out.println("Enter integer to be added:");
		int add= sc.nextInt(); 
		f1.add_fractions(add);
		System.out.println("Sum:");
		f1.display();
	}
}

		

		 

		
	
		
