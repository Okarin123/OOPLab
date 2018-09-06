import java.util.Scanner;

class comp_occupancy{
	
	int occupancy_table[][]=new int[4][]; 
	static int total_workstations[]= {5,6,4,3};
		
	comp_occupancy()
		{
		occupancy_table[0]= new int[5];
		occupancy_table[1]= new int[6];
		occupancy_table[2]= new int[4];
		occupancy_table[3]= new int[3];
	
		for (int i=0; i<4; i++)
			for (int j=0; j<occupancy_table[i].length; j++)
				this.occupancy_table[i][j]=0;

		}

	boolean full_occu(int i)
		{	 
		for (int j=0; j<occupancy_table[i].length; j++)
			if (occupancy_table[i][j]==0)
				return false;

		return true; 
		}

	void sys_status()
		{
		for (int i=0; i<4; i++)
			{
			System.out.print((i+1)+"\t");

			for (int j=0; j<occupancy_table[i].length; j++)
				{
				if (occupancy_table[i][j]==0)
					System.out.print((j+1)+ ": empty");

				else
					System.out.print((j+1)+ ": "+ occupancy_table[i][j]); 
				
				System.out.print("\t");					
				}
			System.out.println("");
			}
		}

	boolean search (int ID)
		{
		for (int i=0; i<4; i++)
			for (int j=0; j<occupancy_table[i].length; j++)
				if (occupancy_table[i][j]==ID)
					{
					System.out.println((i+1)+","+(j+1));
					return true;
					}

		return false;
		}

	}

class user extends comp_occupancy {
	
	int user_ID, lab_num, sys_num, total_lab_occupancy; 

	boolean Allowed_ID(int ID)
		{		
		int i, j, digits=0, copy;
		boolean is_allowed=true, result;
		copy=ID;

		while (copy!=0)
			{
			copy/=10; 
			digits++;	

			if (digits>=6)
				break;	
			}

		if (digits!=5)
			{
			System.out.println("Not a 5- digit number!\n");
			is_allowed=false;
			}			
	
			
		//for (i=0; i<4; i++)  // Logical error
		//	for (j=0; j<occupancy_table[i].length; j++)
		//		if (occupancy_table[i][j]==ID);
		//			{
		//			System.out.println("This user is already logged on!");	
		//			is_allowed=false; 
		//			}
			


	if (is_allowed==true)
			{
			this.user_ID=ID;
			return true;
			}
	
		else
			return false; 
		}


	void assign_lab()
		{
		Scanner sc= new Scanner(System.in);

		boolean lab_full; 
		
		do 
			{
			
			System.out.println("Enter the lab number: ");
		
			do 
				{
				this.lab_num= sc.nextInt();
				
				if ((this.lab_num<1)||(this.lab_num)>4)
					System.out.println("Enter apt. lab number!");

				} while ((this.lab_num<1)||(this.lab_num)>4); 
		
			lab_full= full_occu(this.lab_num-1);
			
			if (lab_full==true) 
				System.out.println("Lab fully occupied! Enter another lab!");

			} while (lab_full==true);

		this.total_lab_occupancy= total_workstations[this.lab_num-1]; // Array to hold total workstations in a lab. Type int.

		}

	void assign_computer()
		{
		Scanner sc= new Scanner(System.in);
		boolean comp_al_occ; 

		do 
			{
	
			System.out.println("Enter the system number: ");
			this.sys_num= sc.nextInt(); 
			
			do {
				if ((this.sys_num<=0)||(this.sys_num>this.total_lab_occupancy))
					System.out.println("Enter apt. system number");

			} while ((this.sys_num<=0)||(this.sys_num>this.total_lab_occupancy));
		
			
			if (occupancy_table[this.lab_num-1][this.sys_num-1]!=0) // Table to hold occupancy of workstations. Type boolean.
				System.out.println("System occupied! Enter another system number: ");

			} while (occupancy_table[this.lab_num-1][this.sys_num-1]!=0);
		}

	void login()
		{
		occupancy_table[this.lab_num-1][this.sys_num-1]=this.user_ID;
		System.out.println(this.user_ID+ ","+ this.sys_num+ ","+ this.lab_num);
		}

	boolean logout(int ID)
		{		
		for (int i=0; i<4; i++)
			for (int j=0; j<occupancy_table[i].length; j++)
				if (occupancy_table[i][j]==ID)
					{
					occupancy_table[i][j]=0;
					System.out.println((i+1)+ "," +(j+1));
					return true;
					}
		return false;
		}
	}

class ex11 {

	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		user obj= new user(); 

		int choice; 
		int ID; 
		boolean result; 		
	
		do 
			{		
			System.out.println("\n\n1. To Login   2. To Logout   3. Workstations' occupancies   4. To search for a user   5. Exit");
			System.out.println("Enter your choice: ");
			choice= sc.nextInt();

			switch (choice)

				{
				case 1: 
					System.out.println("Enter ID: ");
					ID= sc.nextInt();
					result= obj.Allowed_ID(ID);
					
					if (result==false)
						System.out.println("Login failed!");
					else
						{
						obj.assign_lab();
						obj.assign_computer();
						obj.login();
						}

					break; 

				case 2: 
					System.out.println("Enter ID: ");
					ID= sc.nextInt();
					result= obj.logout(ID);

					if (result==false)
						System.out.println("ID does not exist!\nLogout failed!");

					break; 

				case 3:
					obj.sys_status();
					break; 
					
				case 4: 
					System.out.println("Enter ID: ");
					ID= sc.nextInt();
					result= obj.search(ID);

					if (result==false)
						System.out.println("Done!");

					break; 

				case 5:
					break; 

				default: 
					System.out.println("Enter apt. choice!");
				}

			} while (choice!=5);
	}
}

					
					
					
			

		
		

	
		
			

			

			
			

		 

			
		 

		 
	 

	 
