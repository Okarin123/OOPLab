import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.*;

class Reverseprint{

	BufferedReader buffer= new BufferedReader (new InputStreamReader(System.in));

	char Array[]= new char[10]; 
	int N;
	
	Reverseprint() throws IOException  //Constructor
		{
		int i;
			char item;

		System.out.println("Enter a max of 10 characters. Press '.' to stop entering characters.");
		
		for (i=0; i<10; i++)
			{
			System.out.println("Enter the character: ");
			item=(char)buffer.read();
			this.Array[i]=item;

			System.out.print(i);

			if (Array[i]=='.')
				break; 
			}
		
		this.N=i; 	
		}

	void printresult () //Method 1
		{
		for (int i=this.N-1; i>=0; i--)
			System.out.println(this.Array[i]); 
		}
	}

class ex1 {
		
	public static void main(String args[])  throws IOException {

	Reverseprint object= new Reverseprint();
	object.printresult();
	}
}
	
