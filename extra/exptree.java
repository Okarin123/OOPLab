import java.util.Stack; 
import java.util.Scanner; 

class UndefinedSymbolException extends Exception { 

	char symbol; 

	UndefinedSymbolException (char ch) 
		{
		this.symbol = ch; 
		}

	public String toString () 
		{
		return  this.symbol + " is an invalid symbol in postfix notation.";
		}	
	}

class Node { 

	int value; 
	char symbol; 

	Node left;
	Node right; 
	
	Node ()
		{
		this.left = null; 
		this.right = null; 
		}

	Node (int value, char symbol)
		{
		this.value = value; 
		this.symbol = symbol; 
		this.left = null;
		this.right = null; 
		}

	Node (char symbol)
		{
		this.symbol = symbol; 
		this.left = null; 
		this.right = null; 
		}
	}

class Exptree { 

	private Node root; 

	Exptree (Node root) 
		{
		this.root = root; 	
		}

	int evaluate ()
		{
		return exp_eval (this.root);  
		}

	private int exp_eval (Node node) 
		{
		int left_val;
		int right_val; 

		switch (node.symbol) 
			{
			case '+': 
				left_val = exp_eval (node.left);
				right_val = exp_eval (node.right);
				return left_val + right_val;  

			case '-':
				left_val = exp_eval (node.left);
				right_val = exp_eval (node.right); 
				return left_val - right_val; 

			case '*': 
				left_val = exp_eval (node.left);
				right_val = exp_eval (node.right);				
				return left_val * right_val; 
	
			case '/': 
				left_val = exp_eval (node.left);
				right_val = exp_eval (node.right);
				return left_val / right_val; 

			default: 
				return node.value; 
			}
		}
	} 
 
class driver { 

	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in); 
		Stack<Node> St = new Stack<Node> ();

		String postfix = "ab+cd-*$";

		for (int i=0; i<postfix.length(); i++)
			{

			try 
				{
				char symbol = postfix.charAt(i); 	

				if ((97<=symbol) & (symbol<=122)) 
					{
					System.out.println("Enter value of " + symbol + ": "); 
					int val = sc.nextInt(); 

					Node newnode = new Node (val, symbol); 
					St.push (newnode);  
					}

				else if (symbol=='+' || symbol=='-' || symbol=='*' || symbol=='/') 
					{
					Node newnode = new Node (symbol); 
	
					newnode.right = St.pop();
					newnode.left = St.pop(); 
					St.push(newnode); 
					}
		
				else
					throw new UndefinedSymbolException(symbol); 
				} 

			catch (UndefinedSymbolException e) 
				{
				System.out.println("" + e); 
				} 
			} 

		Exptree tree = new Exptree (St.pop()); 
		int Final_val = tree.evaluate(); 

		System.out.println("value of postfix = " + Final_val); 	
		}
	}
		
