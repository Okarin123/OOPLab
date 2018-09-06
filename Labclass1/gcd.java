import java.util.Scanner;

class gcd {

	public static void main(String args[]) {

		Scanner sc= new Scanner(System.in);
				
		System.out.println("Enter the two numbers whose GCD has to be calculated\n");
		int a= sc.nextInt();
		int b= sc.nextInt();
		
		int gcd=1;

		if (a<b)
			{
			int temp=a;
			a=b;
			b=temp;			
			}
		for (int i=2; i<=b; i++)
			if ((a%i==0)&&(b%i==0))
				gcd=i;

		System.out.println("The gcd of " + a + " and " + b + " is " + gcd); 
		sc.close();			
	}
}
