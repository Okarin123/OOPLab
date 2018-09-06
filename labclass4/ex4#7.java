import java.util.ArrayList;
import java.util.Scanner;

class Account {

	private long acct_no;
	private double acct_bal;
	static double min_bal=2000; 

	Account()
		{
		this.acct_no= 10000000 + (long)(Math.random()*90000000);
		this.acct_bal= min_bal;
		}

	Account (long id, double amount)
		{
		this.acct_no= id;
		this.acct_bal= amount;
		}

	Account (Account B) 
		{
		this.acct_no= B.get_id();
		this.acct_bal= B.get_balance();
		}

	void deposit (double amount)
		{
		this.acct_bal+= amount; 
		System.out.println(amount + " added to account!");
		System.out.println("Current balance: " + this.acct_bal);
		}

	void withdraw (double amount)
		{
		if (amount < this.acct_bal)
			{ 
			System.out.println(amount + "withdrawn from account number " + this.acct_no); 
			this.acct_bal-= amount;
			}

		System.out.println("\n");
		}

	boolean transfer(Account B, double transfer_amt)
		{
		if (transfer_amt>this.acct_bal)
			return false; 

		else
			{
			this.acct_bal-= transfer_amt; 
			B.add_money(transfer_amt);
			return true;		
			}
		}

	long get_id ( ) {return this.acct_no;}
	double get_balance ( ) {return this.acct_bal;}
	void set_balance (double bal) {this.acct_bal= bal;}
	
	void add_money(double amount){this.acct_bal+=amount;}
	}

class Savings_Account extends Account { 

	private double years; 
	private double interest;

	Savings_Account () 
		{
		super(); 
		this.years=0; 
		this.interest=0;  
		} 

	Savings_Account (long id, double amount)
		{
		super (id, amount); 
		this.years=0; 
		this.interest=0;  
		}

	void add_interest (double time) 
		{
		System.out.println("Interest rate is 4%"); 
		this.interest = 0.4* this.get_balance()* time; 
		System.out.println("interest of " + this.interest + " added into acount!"); 
		}

	}

class Current_Account extends Account { 

	private boolean overdraft;

	Current_Account () 
		{
		super(); 
		this.overdraft= false;   
		} 

	Current_Account (long id, double amount)
		{
		super (id, amount); 
		this.overdraft= false;
		}

	void withdraw (double amount)
		{
		double balance; 

		System.out.println("Account number: " + get_id());  
		System.out.println("Withdrawal amount = " + amount); 

		if (amount>get_balance())
			this.overdraft= true; 
			
		balance= get_balance() - amount; 
		set_balance (balance); 
		System.out.println("\n");
		}

	void overdraft_check () 
		{
		if (this.overdraft==true) 
			System.out.println("Overdraft amount is " + -1*get_balance());

		else 
			System.out.println("No overdraft!"); 
		}
	}

class Bank {
	Scanner sc = new Scanner(System.in); 	

	private	ArrayList<Account> Acc_Array; 
	private double time;  

	Bank()
		{
		this.Acc_Array= new ArrayList<Account> ();  
		} 

	void Create_Bank_Acc (Account obj) 
		{
		this.Acc_Array.add (obj); 

		System.out.println("Details of account created:");
		System.out.println("" + obj.getClass().getName());
		System.out.println("Account id: " + obj.get_id() + "\tAccount balance: " + obj.get_balance()); 
		System.out.println("\n"); 
		}

	void update ()
		{
		for (int i=0; i<Acc_Array.size(); i++) 
			{
			System.out.println("Bank account " + Acc_Array.get(i).get_id() + " is being updated."); 
			System.out.println("Account type: " + Acc_Array.get(i).getClass().getName()); 

			if (Acc_Array.get(i).getClass().toString().equals("class Savings_Account")) 
				{
				System.out.println("Enter the time in years: "); 
				time= sc.nextDouble(); 

				((Savings_Account)Acc_Array.get(i)).add_interest (time); 			 
				}

			else 
				((Current_Account)Acc_Array.get(i)).overdraft_check();  

			System.out.println("\n");
			}
		}

	void close (Account obj) 
		{ 
		for (int i=0; i<Acc_Array.size(); i++)
            		if (Acc_Array.get(i).get_id() == obj.get_id()) 
				{
				System.out.println("Closure of account number " + obj.get_id()); 
				System.out.println("The final account balance: " + Acc_Array.get(i).get_balance()); 
				Acc_Array.remove (i); 
				} 		
		}  
	} 

class ex7 { 

	public static void main (String args[]) { 

		Bank B = new Bank(); 

		Current_Account C = new Current_Account(); // Random id and minimum balance  
		Savings_Account S = new Savings_Account(12345678, 500000.876); 

		B.Create_Bank_Acc (C); 
		B.Create_Bank_Acc (S); 

		C.withdraw (3000.0); 		

		B.update();   
		B.close(C);
		B.close(S);
	}	
}

 

		  

	

	 

	 

	
	

	 

	
