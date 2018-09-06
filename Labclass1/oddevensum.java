import java.util.Scanner;

class oddevensum {

	public static void main(String args[]) {

		Scanner sc= new Scanner(System.in);
			
		System.out.println("Enter N: The 6- digit number\n");
		int N= sc.nextInt();
		
		int oddsum=0, evensum=0, digits=0;

		while (N!=0)
			{
			if ((N%10)%2==0)
				evensum+=N%10;

			else
				oddsum+=N%10;
 
			N=N/10; 
			
			digits++;	

			if (digits>=7)
				{
				System.out.println("Not a 6-digit number\n");
				return;
				}	
			}

		if (digits!=6)
			System.out.println("Not a 6-digit number\n");

		else
			System.out.println("Even sum: " + evensum + " Odd sum: " + oddsum);

		sc.close();			
	}
}
