import java.util.Scanner;

class Fibonacci {

	public static void main(String args[]) {

		Scanner sc= new Scanner(System.in);
			
		System.out.println("Enter n- first fibonaaci number is 0\n");
		int n= sc.nextInt();
		
		int first=0, second=1;
			
		if (n<=0)
			System.out.println("Enter apt. n \n");

		else if (n==1)
			System.out.println("Fibonacci number is 0. \n");

		else if (n==2)
			System.out.println("Fibonacci number is 1. \n");

		else
			{
			int third=0;

			for (int i=0; i<n-2; i++)
				{
				third=first+second; 
				first=second;				
				second=third;
				}

			System.out.println("Fibonacci number is " + third+ "."); 
			}

		}
}
