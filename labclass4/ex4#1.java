import java.util.Scanner; 
import java.lang.Math;

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

	boolean withdraw (double amount)
		{
		if (amount>this.acct_bal)
			return false; 

		else
			{
			this.acct_bal-= amount;
			return true;
			}
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

	double get_balance ( ){return this.acct_bal;}

	void add_money(double amount){this.acct_bal+=amount;}
	}

class ex1 {

	public static void main (String args[]) {

		boolean result;
		double bal;
		long id;

		Account ravi= new Account();
		id= ravi.get_id(); 
		bal= ravi.get_balance();

		System.out.println("Ravi's acc number: " + id);
		System.out.println("Ravi's acc balance: " + bal);
		System.out.println("");
		 
		Account mala= new Account(178272,10000);
		id=  mala.get_id();
		bal= mala.get_balance();

		System.out.println("Mala's acc number: " + id);
		System.out.println("Mala's acc balance: " + bal);
		System.out.println("");

		mala.deposit(1000);
		result= mala.withdraw(5000);

		if (result)
			System.out.println("Success! 5000 withdrew from Mala's account.");

		else
			System.out.println("Failed! Not enough balance.");

		bal= mala.get_balance(); 		
		System.out.println("Mala's acc balance: " + bal);
		System.out.println("");

		Account leela= new Account(mala); 
		id= leela.get_id();
		bal= leela.get_balance();

		System.out.println("Bank account no of Leela: " + id);
		System.out.println("Bank Balance of Leela: " + bal); 
		System.out.println("");

		result= leela.transfer(ravi, 3000);
		
		if (result)
			{
			System.out.println("Success! transfered 3000 to Ravi!");
			
			bal= leela.get_balance(); 
			System.out.println("Leela's balance: " + bal); 

			bal= ravi.get_balance(); 
			System.out.println("Ravi's balance: " + bal);
			}

		else
			System.out.println("Failed! not enough balance!");

		}
	}
