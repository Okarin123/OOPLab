import java.util.Scanner;

class sumofdigits {

	public static void main(String args[]) {

		Scanner sc= new Scanner(System.in);
			
		System.out.println("Enter N: The 5- digit number\n");
		int N= sc.nextInt();
		
		int sum=0, digits=0;

		while (N!=0)
			{
			sum+=N%10; 
			N=N/10; 
			
			digits++;	

			if (digits>=6)
				{
				System.out.println("Not a 5-digit number\n");
				return;
				}	
			}

		if (digits!=5)
			System.out.println("Not a 5- digit number\n");

		else
			System.out.println("Sum is " + sum);

		sc.close();			
	}
}
