import java.util.Scanner;

class Prime {

	public static void main(String args[]) {

		Scanner sc= new Scanner(System.in);
			
		System.out.println("Enter N\n");
		int n= sc.nextInt();
		
		int counter=0;

		for (int i=2; i<=n; i++)
			{
			for (int j=1; j<i; j++)
				if (i%j==0)
					counter++;

			if (counter==1)
				System.out.println(i+" is a prime. \n");

			counter=0;  
			}
		
		}
}
