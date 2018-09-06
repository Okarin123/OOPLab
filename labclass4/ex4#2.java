import java.util.Scanner; 

class Complex {

	Scanner sc= new Scanner(System.in);

	private float real;
	private float imaginary;

	Complex() 
		{
		System.out.println("Enter real part: "); 
		this.real= sc.nextFloat(); 

		System.out.println("Enter imaginary part: ");
		this.imaginary= sc.nextFloat();
		}

	Complex(float r, float i)
		{
		this.real= r;
		this.imaginary= i; 
		}

	void display()
		{
		System.out.println("The complex number is: " + this.real + "+" + this.imaginary + "i"); 
		}

	boolean isReal ()
		{
		if (this.imaginary==0)
			return true; 

		return false;
		}

	boolean isImag ()
		{
		if (this.real==0)
			return true;

		return false;
		}

	Complex method1 (Complex B)
		{

		float res_real= this.real*B.getReal() - this.imaginary*B.getImaginary(); 
		float res_imag= this.real*B.getImaginary() + this.imaginary*B.getReal(); 		

		Complex result= new Complex(res_real, res_imag); 
		return result;	
		}

	void method1 ()
		{
		float num, temp;
		int choice; 

		System.out.println("Do you want to multiply a real or a complex number? (1.Real\t2.Complex)");
		choice= sc.nextInt();

		switch (choice)
			{
			case 1: 
				System.out.println("Enter real number: ");	
				num= sc.nextFloat();

				this.real*= num; 
				this.imaginary*= num;
				
				break;

			case 2: 
				System.out.println("Enter imaginary number: ");
				num= sc.nextFloat();

				temp= this.real; 
				this.real= -1*num*this.imaginary;
				this.imaginary= temp*num;

				break; 
	
			default:				 
		 		System.out.println("Enter apt. choice!");
			}
		}

	Complex method2 (Complex B)
		{

		float res_real= this.real+ B.getReal(); 
		float res_imag= this.imaginary+ B.getImaginary(); 		

		Complex result= new Complex(res_real, res_imag); 
		return result;	
		}

	void method2 (int x)
		{
		this.real+= (float)x;	
		}	

	final float getReal() { return this.real; }
	final float getImaginary() { return this.imaginary; }
}

class ex2 {
	
	public static void main (String args[]) {
		
 		Scanner sc= new Scanner(System.in);

		Complex num1= new Complex(1, 2);
		num1.display(); 
 
		Complex num2= new Complex(); 
		num2.display(); 

		Complex num2copy= new Complex(num2.getReal(), num2.getImaginary()); 

		if (num2.isReal())
			System.out.println("Purely Real!");

		else if (num2.isImag())
			System.out.println("Purely Imaginary!");

		else
			System.out.println("Both real and imaginary components are present!");

		Complex mul= num2.method1(num1);
		System.out.println("Product:");
		mul.display(); 

		num2.method1();	
		num2.display();

		Complex sum= num2.method2(num1);
		System.out.println("Sum:");
		sum.display(); 

		System.out.println("Enter integer to be added to num2: ");
		int add= sc.nextInt(); 
		num2copy.method2(add);	
		num2copy.display();

		}
}

		

		
		

		
		

		

		

