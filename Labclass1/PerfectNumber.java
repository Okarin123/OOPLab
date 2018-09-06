import java.util.Scanner;

class PerfectNumber {

	public static void main(String args[]) {

		Scanner sc= new Scanner(System.in);
			
		System.out.println("Enter N: The limit\n");
		int n= sc.nextInt();
		
		int sumofdivisors=0;

		for (int i=2; i<=n; i++)
			{
			for (int j=1; j<i; j++)
				if (i%j==0)
					sumofdivisors+=j;

			if (sumofdivisors==i)
				System.out.println(i+" is a perfect number. \n");

			sumofdivisors=0;  
			}

		sc.close();
		}
}
