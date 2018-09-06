import java.util.Scanner;

class LimitedBalanceException extends RuntimeException { 

	private double deficit; 

	LimitedBalanceException (double deficit) 
		{
		this.deficit = deficit; 
		} 

	public String toString () 
		{
		return "Cannot withdraw. Balance short of rupees " + this.deficit ;
		}
	}

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
			this.acct_bal-= amount;
		}
	
	long get_id ( ) {return this.acct_no;}
	double get_balance ( ) {return this.acct_bal;}
	void set_balance (double bal) {this.acct_bal= bal;}
	
	} 

class CheckedAccount extends Account { 

	CheckedAccount () 
		{
		super(); 
		}

	void withdraw (double amount) 
		{
		if (amount > get_balance()) 
			throw new LimitedBalanceException (amount - get_balance()); 

		else
			{
			set_balance (get_balance() - amount);
			System.out.println("Current balance = " + get_balance()); 
			} 
		} 
	} 

class ex6 { 

	public static void main (String args[]) { 

		CheckedAccount CA = new CheckedAccount (); 

		System.out.println("Checked Account details: ");
		System.out.println("Account id: " + CA.get_id() + "\tAccount balance: " + CA.get_balance()); 

		try {

			CA.withdraw (1000.0); 
			CA.withdraw (2000.0); 
		}

		catch (LimitedBalanceException e) { 
		
			System.out.println("" + e); 
		} 
	}
}
			  

			 
		  
			 

 

